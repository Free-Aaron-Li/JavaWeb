package com.xml.jsoup;

import java.io.IOException;
import java.util.Objects;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JsonDemo2
 * @link:
 * @author: AaronLi
 * @description: <p>Jsoup对象功能</p>
 * @date: 10/13/22 7:23 PM
 * @version: JDK17
 */

public class JsonDemo2 {
    public static void main(String[] args) throws IOException {
        /*
         * 1、获取Document对象，根据xml文档获取
         * 1.1、获取student.xml的path
         */
        String path = Objects.requireNonNull(JsoupDemo1.class.getClassLoader().getResource("student.xml")).getPath();
        //1.2.1、解析xml文档，加载文档进内存，获取DOM树 --> Document

        //parse方法一：parse(File in,String charsetName)：解析XML或HTML
        /**
         Document document = Jsoup.parse(new File(path), "utf-8");
         System.out.println(document);
         */

        //1.2.2、parse方法二： parse(String html)：解析HTML或XML字符串
        /**
         String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
         "<students>\n" +
         "    <student number=\"s001\">\n" +
         "        <name>张三</name>\n" +
         "        <age>23</age>\n" +
         "        <sex>male</sex>\n" +
         "    </student>\n" +
         "\n" +
         "    <student number=\"s002\">\n" +
         "        <name>李四</name>\n" +
         "        <age>20</age>\n" +
         "        <sex>female</sex>\n" +
         "    </student>\n" +
         "</students>";
         Document document = Jsoup.parse(str);
         System.out.println(document);
         */

        //1.2.3、parse方法三：parse(URL url,int timeoutMillis)：通过网络路径获取指定的HTML或XML文档对象
        /**
         URL url = new URL("https://www.baidu.com");
         Document document = Jsoup.parse(url, 10000);
         System.out.println(document);
         */
    }
}
