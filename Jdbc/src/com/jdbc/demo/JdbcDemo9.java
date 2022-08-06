package com.jdbc.demo;

import com.jdbc.utils.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcDemo9
 * @link:
 * @author: AaronLi
 * @description: 采用preparedStatement方法，设计登录方法。防止SQL注入
 * @date: 2022/8/6 上午10:45
 * @version: JDK17
 */

public class JdbcDemo9 {
    public static void main(String[] args) {
        //1、键盘录入，接收用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        //2、调用方法
        boolean flag = new JdbcDemo9().loginTwo(username, password);
        //3、判断结果，输出不同结果
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误！");
        }
    }

    /**
     * @date: 2022/8/5 下午10:45
     * @description: 登录方法，使用preparedStatement实现
     */
    public boolean loginTwo(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //1、获取Connection连接
            conn = JdbcUtils.getConnection();
            //2、定义sql
            String sql = "SELECT* FROM user WHERE username= ? and password= ?";
            //3.1、获取sql对象
            pstmt = conn.prepareStatement(sql);
            //3.2、给占位符？赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            //4、执行查询，不需要传递sql
            rs = pstmt.executeQuery();
            //5、判断
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(rs, pstmt, conn);
        }
    }
}
