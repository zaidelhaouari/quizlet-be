package com.quizlet.be.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "arabic")
    private String arabic;

    @Column(name = "french")
    private String french;
}
