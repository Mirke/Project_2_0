package com.mirke.mediamicroservice.models;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "media_name")
    private String name;

    @Column(name = "fk_genre")
    private int fk_genre;

    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;

    public Media() {
    }

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

    public int getFk_genre() {
        return fk_genre;
    }

    public void setFk_genre(int fk_genre) {
        this.fk_genre = fk_genre;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fk_genre=" + fk_genre +
                ", mediaType=" + mediaType +
                '}';
    }
}
