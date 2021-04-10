package com.project.community_hub.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
public class Cook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userId;
    private String dishName;
    private String type;
    private String desc;

}
