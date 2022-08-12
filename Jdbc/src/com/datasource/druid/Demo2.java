package com.datasource.druid;

import com.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Demo2
 * @link:
 * @author: AaronLi
 * @description: 使用utils包中JdbcUtils中数据库连接池工具类
 * @date: 2022/8/11 下午9:22
 * @version: JDK17
 */

public class Demo2 {
    public static void main(String[] args) {

        /**
         * @date: 2022/8/11 下午9:24
         * @description: 完成添加操作，给affairs库中account表添加一条记录
         */
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            //1、获取连接
            connection = JdbcUtils.getConnection();
            //2、定义sql
            String sql="insert into account values(null,?,?)";
            //3、获取prepareStatement对象
            preparedStatement = connection.prepareStatement(sql);
            //4、给？赋值
            preparedStatement.setString(1,"张三");
            preparedStatement.setString(2,"3000");
            //5、执行sql
            int count = preparedStatement.executeUpdate();
            System.out.println("count:" + count);
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            //6、释放资源
            JdbcUtils.close(preparedStatement,connection);
        }
    }
}
