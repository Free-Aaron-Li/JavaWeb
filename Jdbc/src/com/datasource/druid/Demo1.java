package com.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Demo1
 * @link:
 * @author: AaronLi
 * @description: druid演示
 * @date: 2022/8/10 下午11:28
 * @version: JDK17
 */

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //1、导入jar包
        //2、定义配置文件
        //3、加载配置文件
        Properties properties = new Properties();
        InputStream resourceAsStream = Demo1.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(resourceAsStream);
        //5、获取连接池对象
        DataSource ds=DruidDataSourceFactory.createDataSource(properties);
        //5、获取连接
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
