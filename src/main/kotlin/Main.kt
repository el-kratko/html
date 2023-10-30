import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlOptions
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser

fun main(args: Array<String>) {

    val secondHandler = KsoupHtmlHandler
        .Builder()
        .onOpenTag{name, attributes, isImplied ->
        }.onCloseTag { name, isImplied ->

        }.onText { text:String->
            val t = text.replace("\n", "")
            println("Text: $t")
        }
        .build()

    val ksoupHtmlParser= KsoupHtmlParser(secondHandler, KsoupHtmlOptions(
        xmlMode = true
    ))
    // String to parse
    val html = """<html>
    |<h1>My Heading</h1>
    |<div>body</div><div>River</div><div>NewNew</div>
    |</html>
    """.trimMargin()

    ksoupHtmlParser.write(html)
    ksoupHtmlParser.end()



}