package com.tech.ada.spring_cinestream.repository;

import com.tech.ada.spring_cinestream.model.SerieFavorita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieFavoritaRepository extends JpaRepository<SerieFavorita, Long> {
}
