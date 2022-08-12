package com.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcUtils
 * @link:
 * @author: AaronLi
 * @description: JDBC工具类
 * <ol type="1" start="1">
 *          <li>Druid连接池的工具类</li>
 *  </ol>
 * @date: 2022/8/11 下午8:57
 * @version: JDK17
 */

public class JdbcUtils {

    /**
     * @date: 2022/8/11 下午9:01
     * @description: Druid连接池工具类
     */

    private static DataSource dataSource;

    static {
        try {
            //1、加载配置文件
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2、获取DataSource
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @date: 2022/8/11 下午9:08
     * @description: 获取连接对象
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * @date: 2022/8/11 下午9:10
     * @description: 释放资源
     */
    public static void close(Statement statement, Connection connection) {
        close(null, statement, connection);
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
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
        if (connection != null) {
            //归还到连接池
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @date: 2022/8/11 下午9:21
     * @description: 获取连接池方法
     */
    public static DataSource getDataSource() {
        return dataSource;
    }
}
