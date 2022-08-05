package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcDemo1
 * @link:
 * @author: AaronLi
 * @description: 在account表中添加一条记录，初次体验JDBC
 * @date: 2022/8/2 下午6:30
 * @version: JDK17
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1、导入驱动jar包
        //2、注册驱动
        //注意：mysql5.0之后的驱动jar包可以省略注册驱动的步骤
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3、获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql:///affairs", "root", "123456");
        //4、定义SQL语句
        //String sql="UPDATE account SET balance=2000  WHERE id=2";
        String sql = "update account set balance=2000";
        //5、获取执行SQL的对象Statement
        Statement stmt = conn.createStatement();
        //6、执行SQL
        int count = stmt.executeUpdate(sql);
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        stmt.close();
        conn.close();
    }
}
