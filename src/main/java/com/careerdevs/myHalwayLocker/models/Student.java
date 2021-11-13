package com.careerdevs.myHalwayLocker.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id @GeneratedValue private Long id;

//    @OneToMany
//    @JoinColumn(name = "student_id", referencedColumnName = "id")
//    private List<Stuff> myStuff;
    @OneToOne
    @JoinColumn(name = "locker_id", referencedColumnName = "id")
    private Locker locker;

    private String firstName;
    private String lastName;
    private Integer cohort;

    public Student() {}

    public Student(Locker locker, String firstName, String lastName, Integer cohort) {
        this.locker = locker;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohort = cohort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getCohort() {
        return cohort;
    }

    public void setCohort(Integer cohort) {
        this.cohort = cohort;
    }

    public Locker getLocker() {
        return locker;
    }

    public void setLocker(Locker locker) {
        this.locker = locker;
    }
}
