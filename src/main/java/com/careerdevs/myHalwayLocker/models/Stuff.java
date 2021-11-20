package com.careerdevs.myHalwayLocker.models;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Stuff {
    @Id @GeneratedValue
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "student_id", referencedColumnName = "id")
//    private Student student;

    private String title;
    private String content;

    public Stuff() {}

    public Stuff(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
