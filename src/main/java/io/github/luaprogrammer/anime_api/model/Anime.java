package io.github.luaprogrammer.anime_api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String genre;

    private String type;

    private String episodes;

    private Double rating;

    private Integer members;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
