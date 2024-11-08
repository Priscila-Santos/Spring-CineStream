package com.tech.ada.spring_cinestream.repository;


import com.tech.ada.spring_cinestream.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Optional<Usuario> findByNome(String nome);


}