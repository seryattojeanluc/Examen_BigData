import jdk.nashorn.internal.objects.NativeString.substring
import scala.collection.mutable.Stack

object ExamenBigData {
    def end_by_n(args: List[String]): List[String] = {
        val new_list: List[String] = args.filter(s => ((s.charAt(s.length-1) == 'n')||(s.charAt(s.length-1) == 'N')))
        return new_list
    }

    def liste_double(): Unit = {
        val liste = List("ecommercemag.fr", "https://www.journalducm.com/concat/", "https://www.zatsaz.com", "https://www.lerevenu.com", "https://www.cadre-dirigent", "https://www.silicon.fr/services/contact#annoncer", "https://www.channelbiz.fr/nous-contacter/", "https://www.itespresso.fr", "https://www.industrie-mag.com/article4.html", "https://www.jesuisundev.com/article-invite/", "https://www.numerama.com/")
        val type_ = List("", "Payant", "", "", "Payant", "Payant", "", "", "invité", "invité", "")

        // premier liste
        val url = List(liste, type_)



        var s = Stack[String]()

        url(0).foreach(u => {
            if (u != "ecommercemag.fr") {
                s.push(substring(u, 12))
            } else {
                s.push(u)
            }
        })

        val url_2 = List(s.toList, url(1))
        println(url_2)
    }
    def main(args: Array[String]): Unit = {
        //val liste = List("julien","Paul","jean","rac","trec","joel","ed","chris")
        //println(end_by_n(liste))
        //liste_double()
    }
}
