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
 * @className: jsoupDemo1
 * @link:
 * @author: AaronLi
 * @description: <p>Jsoup快速入门</p>
 * @date: 10/13/22 6:32 PM
 * @version: JDK17
 */

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 1、获取Document对象，根据xml文档获取
         * 1.1、获取student.xml的path
         */
        String path = Objects.requireNonNull(JsoupDemo1.class.getClassLoader().getResource("student.xml")).getPath();
        /*
         * 1.2、解析xml文档，加载文档进内存，获取DOM树 --> Document
         */
        Document document = Jsoup.parse(new File(path), "utf-8");
        /*
         * 2、获取元素对象
         */
        Elements names = document.getElementsByTag("name");

        System.out.println(names.size());

        /*
         * 2.1、获取第一个name的Element对象
         */
        Element name1 = names.get(0);
        /*
         * 2.2、获取数据
         */
        String nameString1 = name1.text();
        System.out.println(nameString1);
    }
}
