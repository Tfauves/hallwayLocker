package com.careerdevs.myHalwayLocker.models;

import javax.persistence.*;

@Entity
public class Locker {
    @Id  @GeneratedValue private Long id;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")

    private Student student;


    public Locker() {
    }

    public Locker(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
