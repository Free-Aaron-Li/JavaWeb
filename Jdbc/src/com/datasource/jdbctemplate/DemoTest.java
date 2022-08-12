package com.datasource.jdbctemplate;

import com.datasource.domain.Emp;
import com.utils.JdbcUtils;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Demo2
 * @link:
 * @author: AaronLi
 * @description: emp表下的练习
 * @date: 2022/8/12 上午11:14
 * @version: JDK17
 */

public class DemoTest {


    /**
     * @projectName: JavaWeb_Workspace
     * @className: Demo
     * 1、获取JdbcTemplate
     */
    private final JdbcTemplate jdbcTemplate = new JdbcTemplate(JdbcUtils.getDataSource());

    /**
     * @date: 2022/8/12 上午11:16
     * @description: 1、修改1号数据的salary为10000
     */
    @Test
    public void test1() {
        //2、定义sql
        String sql = "update emp set salary=10000 where id=?";
        //3、执行sql
        int count = jdbcTemplate.update(sql, 1001);
        System.out.println(count);
    }

    /**
     * @date: 2022/8/12 上午11:17
     * @description: 2、添加一条记录
     */
    @Test
    public void test2() {
        //2、定义sql
        String sql = "insert into emp (id, enname,dept_id) values (?,?,?)";
        //3、执行sql
        int count = jdbcTemplate.update(sql, 1015, "郭靖", 10);
        System.out.println(count);
    }

    /**
     * @date: 2022/8/12 上午11:17
     * @description: 3、删除刚才添加的记录
     */
    @Test
    public void test3() {
        //2、定义sql
        String sql = "delete from emp where id=?";
        //3、执行sql
        int count = jdbcTemplate.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * @date: 2022/8/12 上午11:36
     * @description: 4、查询id=1记录，将其封装为Map集合，注意：查询结果集长度只能是1条
     */
    @Test
    public void test4() {
        //2、定义sql
        String sql = "select * from emp where id=?";
        //3、执行sql
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, 1001);
        System.out.println(map);
        //结果：{id=1001, enname=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}
    }

    /**
     * @date: 2022/8/12 上午11:44
     * @description: 5、查询所有记录，将其封装为List
     */
    @Test
    public void test5() {
        //2、定义sql
        String sql = "select * from emp";
        //3、执行sql
        List<Map<String, Object>> list =jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    /**
     * @date: 2022/8/12 上午11:48
     * @description: 6、查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public  void test6() {
        //2、定义sql
        String sql = "select * from emp";
        //3、执行sql
        List <Emp> list=jdbcTemplate.query(sql,new RowMapper<>(){

            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = resultSet.getInt("id");
                String enname = resultSet.getString("enname");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                emp.setId(id);
                emp.setEnname(enname);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                return emp;
            }
        });

        for(Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * @date: 2022/8/12 上午11:48
     * @description: 6、查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public  void test6_2() {
        //2、定义sql
        String sql = "select * from emp";
        //3、执行sql
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * @date: 2022/8/12 下午12:16
     * @description: 7、查询总记录数
     */
    @Test
    public  void test7(){
        //2、定义sql
        String sql = "select count(id) from emp";
        //3、执行sql
        Long total = jdbcTemplate.queryForObject(sql,Long.class);
        System.out.println(total);
    }
}
