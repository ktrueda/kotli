val defaultBird = """
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

val birds = mapOf(
    "inko" to """
        
        　　　　　　　　　　　　　　／￣￣￣￣＼
　　　　　　　　　　　　　　　　　 ／　　　　　 　　　 ）
　　　　　　　　　　　　　　　　／　　　　●　 (⌒⌒)
　　　　　　　　　　　　　　 ／　　　　　　　　　＼ノ
　　　　　　　　　　　　　／　""${'"'}゛゛ヽ　　　 　　　|
　　　　　　　　　　　 ／　　　　　　　） 　 　 　 　|
　　　　　　　　　　／　　　　　　ノノ　 　 　 　 　|
　　　　　　　　 ／　　　　　　ノノ　　　　 　　　/
　　　　　　　／　　　　　　ノノ　　　　　　　　/
　　　　　 ／　　　　　　／ 　　　　　　　　／
　　　　／　彡ミ（_）二二二)) ))二二二)) ))二二二)
　　 ／　彡
　／／
　"゛
    """.trimIndent(),
    "tsubame" to """
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 ,,,;;;;';';';';;;;,,,、
　　　　　　　　　　　　　　　　　　　　 　 　 　 　 　 ／;;;;;;;;;;;;;;::'´　ヽ
　　　　　　　　　　　　　　　　　　　　　　　　　　　/;;;;;;;;;;;;;;○;;;;;;,,,_ﾆｭ_
　　　　　　　　　　　　　　　 　 　 　 　 　 　 　 ,r'-､;;;;;;;::-'''''''"　￣丁
　　　　　　　　　　　　　　　　　　　　　　　　／;;;;;;;;;;;;;;`;;;;-‐;;;;;;;;;;､_/
　　　　　　　　　　　　　　　　　　　　　　 ／;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;ﾂ//};ヽ
　　　　　　　　　　　　　　　　　　　　　／,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;r-'////, 　 i
　　　　　　　　　　　　 　 　 　 　 　 ,,;';;;;;;;;;;;;;;;;;;;;;;;;;;;;;;rｧ'/////ﾂ 　 ,!
　　　　　　　　　　　 　 　 　 　 　 ,;';;;;;;;;;;;;;;;;;;;;;;;;;;;r'"///////"　　/
　　　　　　　　　　　　　　　　　　/;;;;;;;;;;;;;;;;;;;;;;;;／／/////イ　　 ./
　　　　　　　　 　 　 　 　 　 　 /;;;;;;;;;;;;;;;;;;;;／ ／アｧ'／／　　　/
　　　　　　　 　 　 　 　 　 　 /;;;;;;;;;;;;／／ ／ ／'／／　　　　/
　　　　　　　　　　　　　　　,;';;;;;;;;/"(,／／､／'／／ 　 　 　 /
　　　　　　　　　　　　　　,;';;;;;;;;;/"（／⌒ｰ"／／　　　　 ,／
　　　　　　　 　 　 　 　 /;;;;;;;;/　／／／／／　　　r-＜__
　　　　　　　　　　＿　/　,,.イ　 ／／／／ヽ､,,ｯィ"''⌒ｱﾘ）＿＿＿＿＿＿＿
　　　　　　　　￣￣／／,ノ゛／／／／　　￣￣￣￣￣￣￣￣
　　　　　　 　 　 ／　 ／　 '／／／
　　　　　　　 ／　,.r／　　 ／／
　　　　　　／ ／／　　 ∠-'"
　　　　 ／／.／　　 ／'"
　 　 ／ィ゛／　 _,.-'"
　／'" └（,,.-''"
    """.trimIndent(),
    "hiyoko" to """
　　　　　　　　　　　　　　　　　　.,.,.,.
　　　　　　　　　　　　　　,),ﾂﾂ''"　　"ﾂｼｯ,,.
　　　　　　　　　　,.,.,.,.,;ﾂ'　　　　　　　　　　"''彡
　　　　　　 ,: ''"'" 　　　　　　　　　　　　　　　 "';､
　　　　　,:'"　　　　　　　　　　　　　　　　　　　　　';
　　　,.,'"　　　彡　　　　　　　　　　　　　　　ﾐ　　 彡
　 ,;'"　　　　　　　　　　　　　　　　　　　　　ﾐ 　　　 ﾐ
　ﾐ　　　　　　　彡　　　彡　　　　　　　　　ﾐ　　　　 ミ
　ﾐ　　 　 , ､ 　 　ﾐ　　　ミ　　　　　　　　ﾐ　　　　､ﾐ ﾐ
　ﾐ　 　 (●ﾉ　　　　　　ミ　　　　　　ﾐ　　　　　ﾐ　　ﾐ
　}｀ヽ､_____ﾞ　　　　ﾐ　　　ﾐ　　　　　　ﾐ　　　　ﾐ　 ｼ
　| "　 , ＜､､　,.,　　 ヾヾ　　　　　　　ヾ　　　　,.ﾐﾞ
　レ '　　　　ﾞ':;,　ヾヾ　　　　　　　　,,,.,ヾヾ .,.ヾﾞ
　　　　　　　　 ﾞ''-､,,,,..,.,..ﾐ､,;,,::,:ヾヾ　 }ﾞ''}''"
　　　　　　　　　＿＿, --ﾉ ﾄ､ゝ　　 / /
　　　　　　　　　｀ーー'ノ, ﾍ､ヽ　　 / {
　　　　　　　　　　　　/ /　-=ﾆニｧ ,､＼
　　　　　　　　　　　/／　　　 ／／- ヽ ＼
　　　　　　　　　　　　　　　∠／　　　　 ＼ゝ
    """.trimIndent()
)