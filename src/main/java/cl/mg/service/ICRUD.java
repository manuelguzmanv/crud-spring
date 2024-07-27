package cl.mg.service;

import java.util.List;

public interface ICRUD<E> {
	
	E findById(Integer id);
	List<E> findAll();
	E save(E e);
	E update(E e);
	void deleteById(Integer id);

}
