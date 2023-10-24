package com.lad666.videocreatorservice.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "video_creator")
public class VideoCreator implements ContentContributor {
    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_creator_id")
    private int id;

    @Column(name = "video_creator_name")
    private String name;

    //constructors
    public VideoCreator() {
    }

    public VideoCreator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString

    @Override
    public String toString() {
        return "VideoCreator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
