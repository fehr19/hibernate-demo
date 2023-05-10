package com.perscholas.model;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Professor")
public class Professor {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int tit;
    private String salary;
    private String professorName;
    @ManyToMany(targetEntity = Cohort.class)
    private Set CohortSet;
    public Professor(String salary, String professorName, Set CohortSet) {
        this.salary = salary;
        this.professorName = professorName;
        this.CohortSet = CohortSet;
    }
    public Professor() {
        super();
    }
    public Set getCohortSet() {
        return CohortSet;
    }
    public void setCohortSet(Set cohortSet) {
        CohortSet = cohortSet;
    }public int getTit() {
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
    public String getProfessorName() {
        return professorName;
    }
    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}
