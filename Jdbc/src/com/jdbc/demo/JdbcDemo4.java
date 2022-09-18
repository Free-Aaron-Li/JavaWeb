package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcDemo4
 * @link:
 * @author: AaronLi
 * @description: 在account表中删除一条记录
 * @date: 2022/8/4 上午11:59
 * @version: JDK17
 */
public class JdbcDemo4 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、定义sql
            String sql = "delete from account where id = 3";
            //3、获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///affairs", "root", "123456");
            //4、获取执行sql的对象 Statement
            statement = conn.createStatement();
            //5、执行sql
            //获取影响行数
            int count = statement.executeUpdate(sql);
            //6、处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //避免空指针异常
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
