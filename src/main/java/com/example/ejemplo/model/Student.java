package com.example.ejemplo.model;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "Student")
@Getter @Setter
public class Student
{
    @Id
    @GeneratedValue //autoincremental
    private long id;
    private String name;
    private String lastname;

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
