# kotli

This CLI tool shows kotli (small bird in Japanese) implemented in Kotlin.

```
$ kotli-mac.kexe
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

$ kotli-mac.kexe -e
　　　　　　　　　　　　 ,, -―-、
　　　　　　　　　　　／　　　　 ヽ
　　　　　／￣￣／　　／i⌒ヽ､|　　　　オエーー！！！！
　　　　/　　（👁）/　　 ／　/
　　　/　　　　 ト､.,../　,ー-､
　　=彳　　　　　 ＼＼‘ﾟ。､｀ ヽ。、🌟
　　/ 　 　　　　　　　＼＼ﾟ。､。、🌟
　/　　　　　　　　　/⌒ ヽ ヽ⭐️　　🌟
 /　　　　　　　　　│　　　`ヽ⭐️　💫ｌ
│　　　　　　　　　│　　　　　⭐️　：l
　　　　　　　　　　　　　　　　　　|：!
　　　　　　　　　　　　　　　　　　👅⏎
```

## installation

Download binary from github release page.

## benchmark result

Kotlin-Native build is 18x faster than JVM build.

| Prepare                                                   | Command | Mean [ms] | Min [ms] | Max [ms] | Relative |
|:----------------------------------------------------------|:---|---:|---:|---:|---:|
| `gradle build`                                            | `./build/bin/native/releaseExecutable/kotli.kexe` | 3.9 ± 1.9 | 2.7 | 20.6 | 1.00 |
| `kotlinc ./Main.kt -include-runtime -d ./Kotlin.jar`      | `java -jar Kotlin.jar` | 71.1 ± 4.2 | 67.6 | 93.7 | 1.00 |

https://github.com/sharkdp/hyperfine