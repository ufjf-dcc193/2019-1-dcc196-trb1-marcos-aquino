package br.ufjf.dcc193.patas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.patas.model.Voluntario;



public interface VoluntarioRepository extends JpaRepository<Voluntario, Long>{
}