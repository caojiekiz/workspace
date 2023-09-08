package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

public class JsoupDemo2 {
    public static void main(String[] args) throws Exception {
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");
        //Elements elements = document.getElementsByTag("name");
        System.out.println(document);
//        Element element = elements.get(0);
//        String name = element.text();
//        System.out.println(name);
    }
}
 