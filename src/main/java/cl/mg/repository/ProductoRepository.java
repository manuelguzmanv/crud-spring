package cl.mg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.mg.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
