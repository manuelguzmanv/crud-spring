package cl.mg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.mg.model.Categoria;
import cl.mg.repository.CategoriaRepository;
import cl.mg.service.ICategoriaService;


@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepo;

	@Override
	public Categoria findById(Integer id) {
		return categoriaRepo.findById(id).orElse(null);
	}

	@Override
	public List<Categoria> findAll() {		
		return categoriaRepo.findAll();
	}

	@Override
	public Categoria save(Categoria categoria) {
		return categoriaRepo.save(categoria);
	}

	@Override
	public Categoria update(Categoria categoria) {
		return categoriaRepo.save(categoria);
	}

	@Override
	public void deleteById(Integer id) {
		categoriaRepo.deleteById(id);		
	} 
	
	

}
