package com.jdbc.demo;

import java.sql.*;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcDemo5
 * @link:
 * @author: AaronLi
 * @description: 查询account表中所有数据
 * @date: 2022/8/5 下午4:05
 * @version: JDK17
 */
public class JdbcDemo5 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection conn = null;
        ResultSet resultSet = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、定义sql
            String sql = "select * from account";
            //3、获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///affairs", "root", "123456");
            //4、获取执行sql的对象 Statement
            statement = conn.createStatement();
            //5、执行sql
            resultSet = statement.executeQuery(sql);
            //6、处理结果
            //6.1 让游标向下移动一行
            while (resultSet.next()) {
                //判断结果集是否有为最后一行末尾
                //6.2获取数据
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                System.out.println(id + " " + name + " " + balance);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            //避免空指针异常
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
