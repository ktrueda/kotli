import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

enum class Format {
    INKO,
    NONE
}

fun main(args: Array<String>) {
    val parser = ArgParser("kotli")
    val kind by parser.option(
        ArgType.Choice<Format>(), shortName = "k",
        description = "kind of kotli"
    ).default(Format.NONE)
    parser.parse(args)


    val exp = birds[kind.name.lowercase()] ?: defaultBird
    print(exp)
}