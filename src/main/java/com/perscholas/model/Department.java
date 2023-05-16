package com.perscholas.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int did;
    private String dName;

    @OneToMany(targetEntity= Professor.class, cascade = {CascadeType.ALL})
    private List teacherList;

    public Department(int did, String dName) {
        super();
        this.did = did;
        this.dName = dName;
    }

    public Department() {
    }

    public List getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List teacherList) {
        this.teacherList = teacherList;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
}