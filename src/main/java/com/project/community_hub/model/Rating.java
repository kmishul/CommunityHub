package com.project.community_hub.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int userId;
    private int postId;
    private int likes;
    private int dislikes;

}
