package com.sparta.week02.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String tutor;

    public String getTitle(){
        return this.title;
    }

    public String getTutor(){
        return this.tutor;
    }

    public Course(String title, String tutor){
        this.title = title;
        this.tutor = tutor;
    }
}
