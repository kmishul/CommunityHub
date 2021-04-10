package com.project.community_hub.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userId;
    private String songName;
    private String genre;
    private String desc;

}
