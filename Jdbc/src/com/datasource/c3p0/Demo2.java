package com.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Demo2
 * @link:
 * @author: AaronLi
 * @description: C3P0的演示
 * @date: 2022/8/10 下午10:55
 * @version: JDK17
 */

public class Demo2 {

    /**
     * @param: static final int MAX
     * @description: 最大连接数量
     */
    static final  int MAX =11;
    public static void main(String[] args) throws SQLException {

        //1.1、创建数据库连接池对象，若创建ds没有输入任何名称，使用默认配置
        DataSource ds = new ComboPooledDataSource();
        //1.2、使用itheimac3p0配置
        //DataSource dsTwo = new ComboPooledDataSource("itheimac3p0");
        //2、获取最大连接对象个数
        for (int i = 1; i <= MAX; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i + " " + connection);
            if (i == 5) {
                //归还到连接池中，当需要取出连接数大于最大连接数时，便会重新将已归还到连接池的连接取出。
                connection.close();
            }
        }
    }
}
