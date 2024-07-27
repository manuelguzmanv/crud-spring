package cl.mg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.mg.model.Producto;
import cl.mg.repository.ProductoRepository;
import cl.mg.service.IProductoService;


@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoRepository productoRepo; 
	
	@Override
	public Producto findById(Integer id) {
		return productoRepo.findById(id).orElse(null); 
	}

	@Override
	public List<Producto> findAll() {
		return productoRepo.findAll(); 
	}

	@Override
	public Producto save(Producto producto) {
		return productoRepo.save(producto); 
	}

	@Override
	public Producto update(Producto producto) {
		return productoRepo.save(producto); 
	}

	@Override
	public void deleteById(Integer id) {
		productoRepo.deleteById(id);
	}
	
	

}
