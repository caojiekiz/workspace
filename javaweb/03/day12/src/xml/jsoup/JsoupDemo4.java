package xml.jsoup;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.List;

public class JsoupDemo4 {
    public static void main(String[] args) throws Exception {
        String path = JsoupDemo4.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path),"utf-8");
        JXDocument jxDocument = new JXDocument(document);
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for(JXNode jxNode : jxNodes){
            System.out.println(jxNode);
        }
        System.out.println("2=================");
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for(JXNode jxNode : jxNodes2){
            System.out.println(jxNode);
        }
        System.out.println("3=================");
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id=kiz]");
        for(JXNode jxNode : jxNodes3){
            System.out.println(jxNode);
        }
    }
}
 