package com.project.community_hub.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userId;
    private String bookName;
    private String author;
    private String genre;
    private String desc;

}
