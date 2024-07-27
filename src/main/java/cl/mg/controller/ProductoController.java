package cl.mg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.mg.model.Producto;
import cl.mg.service.IProductoService;

@RestController
@RequestMapping(path = "/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService; 
	
	@GetMapping("/listar")
    public List<Producto> getAll() {
        return productoService.findAll();
    }
	
	@GetMapping("/{productoId}")
    public Producto getProducto(@PathVariable(name = "productoId") Integer productoId) {
    	return productoService.findById(productoId);
    }
	
	@PostMapping("/registrar")
	@ResponseStatus(code = HttpStatus.CREATED)
    public Producto saveEmployee(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("/editar")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Producto updateProducto(@RequestBody Producto producto) {		    	
    	return productoService.update(producto);
    }    

    @DeleteMapping("/borrar/{productoId}")
    public void deleteProducto(@PathVariable(name = "productoId") Integer productoId) {
        productoService.deleteById(productoId);
    }

}
