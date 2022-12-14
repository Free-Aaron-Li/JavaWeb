package com.jdbc.demo;

import com.jdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcDemo8
 * @link:
 * @author: AaronLi
 * @description: <br>
 * 练习
 * <br>
 * &emsp;需求：
 * &emsp;<ol  type="1" start="1">
 * <li>通过键盘录入用户名和密码</li>
 * <li>判断用户是否登录成功</li>
 * </ol>
 * @date: 2022/8/5 下午10:32
 * @version: JDK17
 */

public class JdbcDemo8 {
    public static void main(String[] args) {
        //1、键盘录入，接收用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();
        //2、调用方法
        boolean flag = new JdbcDemo8().login(username, password);
        //3、判断结果，输出不同结果
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误！");
        }
    }

    /**
     * @date: 2022/8/5 下午10:45
     * @description: 登录方法
     */
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1、获取Connection连接
            conn = JdbcUtils.getConnection();
            //2、定义sql
            String sql = "SELECT* FROM user WHERE username='" + username + "'and password='" + password + "'";
            //3、获取sql对象
            stmt = conn.createStatement();
            //4、执行查询
            rs = stmt.executeQuery(sql);
            //5、判断
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(rs, stmt, conn);
        }
    }
}
