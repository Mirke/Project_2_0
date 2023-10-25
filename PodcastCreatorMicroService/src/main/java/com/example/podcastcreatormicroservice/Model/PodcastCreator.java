package com.example.podcastcreatormicroservice.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "podcast_creator")
public class PodcastCreator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "podcast_creatorname")
    private String name;

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
}
