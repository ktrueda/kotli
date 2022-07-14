import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

fun main(args: Array<String>) {
    val parser = ArgParser("kotli")
    val kind by parser.option(
        type = ArgType.Choice(
            birds.keys.toList(),
            { it }),
        shortName = "k",
        description = "kotli kind"
    ).default("csv")
    parser.parse(args)


    val exp = birds[kind] ?: defaultBird
    print(exp)
}