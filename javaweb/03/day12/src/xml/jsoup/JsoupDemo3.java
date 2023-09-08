package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;

public class JsoupDemo3 {
    public static void main(String[] args) throws Exception {
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");
        Elements elements = document.select("name");
        System.out.println(elements);
        System.out.println("===========");
        Elements elements1 = document.select("#kiz");
        System.out.println(elements1);
    }
}
 