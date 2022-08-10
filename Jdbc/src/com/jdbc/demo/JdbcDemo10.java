package com.jdbc.demo;

import com.jdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @projectName: JavaWeb_Workspace
 * @className: JdbcDemo10
 * @link:
 * @author: AaronLi
 * @description: 事务操作
 * @date: 2022/8/9 下午9:49
 * @version: JDK17
 */

public class JdbcDemo10 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //1、获取连接
            conn = JdbcUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //2、定义sql
            //2.1、张三减500
            String sqlOne = "update account set balance=balance - ? where id=?";
            //2.2、李四加500
            String sqlTwo = "update account set balance=balance + ? where id=?";
            //3、获取执行sql的对象
            pstmt1 = conn.prepareStatement(sqlOne);
            pstmt2 = conn.prepareStatement(sqlTwo);
            //4、设置参数
            pstmt1.setDouble(1, 500);
            pstmt1.setInt(2, 1);

            pstmt2.setDouble(1, 500);
            pstmt2.setInt(2, 2);

            //5、执行sql
            pstmt1.executeUpdate();
            // 手动制造异常
            int i = 3 / 0;
            System.out.println(i);
            pstmt2.executeUpdate();
            // 提交事务
            conn.commit();
        } catch (Exception e) {
            // 事务回滚
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    e.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            JdbcUtils.close(pstmt1, conn);
            JdbcUtils.close(pstmt2, null);
        }
    }
}
