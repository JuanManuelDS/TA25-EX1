package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Articulos;
import main.services.ArticulosService;

@RestController
@RequestMapping("/api")
public class ArticulosControllers {

	
	@Autowired
	ArticulosService articulosService;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articulosService.listarArticulos();
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos buscarArticulo(@PathVariable(name="id")Long id) {
		return articulosService.buscarArticulo(id);
	}
	
	@PostMapping("/articulos")
	public Articulos agregarArticulos(@RequestBody Articulos articulo) {
		return articulosService.guardarArticulos(articulo);
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos modificarArticulos(@PathVariable(name="id")Long id, @RequestBody Articulos articulo) {
		
		Articulos articuloSeleccionado = articulosService.buscarArticulo(id);
		
		articuloSeleccionado.setNombre(articulo.getNombre());
		articuloSeleccionado.setPrecio(articulo.getPrecio());
		articuloSeleccionado.setFabricante(articulo.getFabricante());
		
		return articulosService.actualizarArticulos(articuloSeleccionado);
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articulosService.eliminarArticulo(id);
	}
}
