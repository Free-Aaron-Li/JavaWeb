package com.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Demo1
 * @link:
 * @author: AaronLi
 * @description: C3P0的演示
 * @date: 2022/8/10 下午10:46
 * @version: JDK17
 */

public class Demo1 {
    public static void main(String[] args) throws SQLException {

        //1、创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //2、获取连接对象
        Connection connection = ds.getConnection();
        //3、打印
        System.out.println(connection);
    }
}
