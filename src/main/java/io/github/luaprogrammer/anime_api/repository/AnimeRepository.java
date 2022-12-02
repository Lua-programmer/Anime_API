package io.github.luaprogrammer.anime_api.repository;

import io.github.luaprogrammer.anime_api.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
