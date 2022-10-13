package com.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JsoupDemo3
 * @link:
 * @author: AaronLi
 * @description: <p>Document对象</p>
 * @date: 10/13/22 8:44 PM
 * @version: JDK17
 */

public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        /*
         * 1、获取Document对象，根据xml文档获取
         * 1.1、获取student.xml的path
         */
        String path = Objects.requireNonNull(JsoupDemo1.class.getClassLoader().getResource("student.xml")).getPath();
        //2、获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");

       /*
        3、获取元素对象
        3.1、获取所有student对象
       */
        Elements student = document.getElementsByTag("student");
        System.out.println(student);

        System.out.println("-----------------");

        //3.2、获取属性名为id的元素们
        Elements id = document.getElementsByAttribute("id");
        System.out.println(id);

        System.out.println("-----------------");

        //3.3、获取number属性值为s001的元素对象
        Elements number1 = document.getElementsByAttributeValue("number", "s001");
        System.out.println(number1);

        System.out.println("-----------------");

        //3.4、获取id属性值的元素对象
        Element li = document.getElementById("li");
        System.out.println(li);

    }
}
