import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

val kotli = """
　　　　　　　　　　　　　　 ,, -―-、
　　　　　　　　　　　　　／　　　　 ヽ
　　　　　　　／￣￣／　　／i⌒ヽ､|　　　　オエーー！！！！
　　　　　　/　　（゜）/　　 ／　/
　　　　　/　　　　 ト､.,../　,ー-､
　　　　=彳　　　　　 ＼＼‘ﾟ。､｀ ヽ。、ｏ
　　　　/ 　 　　　　　　　＼＼ﾟ。､。、ｏ
　　　/　　　　　　　　　/⌒ ヽ ヽU　　ｏ
　　 /　　　　　　　　　│　　　`ヽU　∴ｌ
　　│　　　　　　　　　│　　　　　U　：l
　　　　　　　　　　　　　　　　　　　　|：!
　　　　　　　　　　　　　　　　　　　　Ｕ
""".trimIndent()

val starLightKotli = kotli
    .replace("ｏ", "🌟")
    .replace("U", "⭐️")
    .replace("∴", "💫")
    .replace("Ｕ", "👅")
    .replace("゜", "👁")


fun main(args: Array<String>) {
    val parser = ArgParser("kotli")
    val emoji by parser.option(ArgType.Boolean, shortName = "e", description = "Use emoji").default(false)
    parser.parse(args)
    
    val exp = when (emoji) {
        true -> starLightKotli
        else -> kotli
    }
    print(exp)
}