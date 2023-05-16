package com.perscholas.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tit;
    private String salary;
    private String teacherName;

    @ManyToOne
    @JoinColumn(name = "fk_dep")
    private Department department;

    public Teacher(int tit, String salary, String teacherName) {
        super();
        this.tit = tit;
        this.salary = salary;
        this.teacherName = teacherName;
    }

    public Teacher() {
    }

    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}