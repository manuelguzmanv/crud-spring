package cl.mg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.mg.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}