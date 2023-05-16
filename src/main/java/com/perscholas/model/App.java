package com.perscholas.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;
//Demonstrates One-to-Many relationship
public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Department dep = new Department();
        dep.setdName("IT");

        Department dep2= new Department();
        dep2.setdName("HR");

        Teacher t1 = new Teacher();
        t1.setSalary("1000");
        t1.setTeacherName("MHaseeb");

        Teacher t2 = new Teacher();
        t2.setSalary("2220");
        t2.setTeacherName("Shahparan");

        Teacher t3 = new Teacher();
        t3.setSalary("30000");
        t3.setTeacherName("James");

        Teacher t4 = new Teacher();
        t4.setSalary("40000");
        t4.setTeacherName("Joseph");

        Teacher t5 = new Teacher();
        t5.setSalary("200");
        t5.setTeacherName("Ali");

        List<Teacher> teachlist = new ArrayList();
        teachlist.add(t1);
        teachlist.add(t2);
        teachlist.add(t3);
        teachlist.add(t4);
        teachlist.add(t5);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        session.save(t5);

        //Create Department
        Department department = new Department();
        department.setdName("Development");
        department.setTeacherList(teachlist);

        //Store Department
        session.save(department);
        t.commit();
    }
}