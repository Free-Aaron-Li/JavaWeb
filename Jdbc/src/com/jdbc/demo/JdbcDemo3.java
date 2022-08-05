package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JDBCDemo3
 * @link:
 * @author: AaronLi
 * @description: 修改account表中一条记录
 * @date: 2022/8/3 上午11:20
 * @version: JDK17
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///affairs", "root", "123456");
            //3.定义sql
            String sql = "update account set balance =1500 where id=3";
            //4、获取执行sql对象
            statement = conn.createStatement();
            //5、执行sql
            int count = statement.executeUpdate(sql);
            //6、处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("执行成功！！");
            } else {
                System.out.println("执行失败！！");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}