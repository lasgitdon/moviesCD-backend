package com.lgd.moviesbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seqId;

    public String id;

    @NotNull(message = "title is required")
    public String title;

    public String director;

    public int year;

    public String rating;
}
