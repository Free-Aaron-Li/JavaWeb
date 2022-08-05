package com.jdbc.utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcUtils
 * @link:
 * @author: AaronLi
 * @description: JDBC工具类
 * @date: 2022/8/5 下午8:45
 * @version: JDK17
 */
public class JdbcUtils {
    private static String url;
    private static String user;
    private static String password;

    /*
      需求：文件的读取，只需要读取一次即可拿到这些值。使用静态代码块
     */
    static {
        //通过配置文件获取资源，获取值
        try {
            //1、创建Properties集合类
            Properties properties = new Properties();
            //获取src路径下的文件的方式--->ClassLoader类加载器
            ClassLoader classLoader = JdbcUtils.class.getClassLoader();
            //得到统一资源定位符
            URL resource = classLoader.getResource("jdbc.properties");
            String path = resource != null ? resource.getPath() : null;
            //2、加载文件
            //assert（断言）。
            // 语法形式：1、assert condition;2、assert condition:expr;
            // 1、如果为真，则没有任何行动；如果为假，则会抛出AssertionError对象。
            //2、冒号后面添加失败提示信息。如果断言失败，该值被转化为对应字符串。
            assert path != null:"该路径为空";
            properties.load(new FileReader(path));
            //3、获取数据，赋值
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            String driver = properties.getProperty("driver");
            //4、注册驱动
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * @date: 2022/8/5 下午8:50
     * @description: 获取连接
     * @return: 连接对象
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * @date: 2022/8/5 下午8:55
     * @description: 释放资源
     * @param: stmt
     * @param: conn
     */
    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
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

    /**
     * @date: 2022/8/5 下午8:55
     * @description: 释放资源
     * @param: rs
     * @param: stmt
     * @param: conn
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
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
