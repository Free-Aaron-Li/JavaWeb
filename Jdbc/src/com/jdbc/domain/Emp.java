package com.jdbc.domain;

import java.util.Date;

/**
 * @projectName: JavaWeb_Workspace
 * @className: Emp
 * @link:
 * @author: AaronLi
 * @description: 封装emp表数据的JavaBean
 * @date: 2022/8/5 下午4:56
 * @version: JDK17
 */
public class Emp {
    private int id;
    private String enname;
    private int job_id;
    private int mgr;
    private Date joindate;
    private double salary;
    private double bonus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    private int dept_id;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", enname='" + enname + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bounds=" + bonus +
                ", dept_id=" + dept_id +
                '}' + "\n";
    }
}
