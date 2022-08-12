package com.datasource.jdbctemplate;

import com.utils.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Demo1
 * @link:
 * @author: AaronLi
 * @description: JdbcTemplate入门学习
 * @date: 2022/8/12 上午10:54
 * @version: JDK17
 */

public class Demo1 {
    public static void main(String[] args) {
        //1、导入jar包
        //2、创建JDBCTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtils.getDataSource());
    }
}
