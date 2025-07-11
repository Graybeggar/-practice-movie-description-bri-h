package com.example.classmanager.model;

import jakarta.persistence.Id;

public class Teacher {
    @Id
    private Long id;
    private String name;
    private String subject;

    public Teacher() {
    }

    public Teacher(Long id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
