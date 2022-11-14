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

import main.dto.Fabricantes;
import main.services.FabricantesService;

@RestController
@RequestMapping("/api")
public class FabricantesControllers {

	@Autowired
	FabricantesService fabricantesService;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabricantesService.listarFabricantes();
	}
	
	@GetMapping("/fabricantes/{id}")
	//En path variable le paso el nombre de la variable que busco en la url
	public Fabricantes buscarFabricante(@PathVariable(name="id") Long id) {
		return fabricantesService.buscarFabricante(id);
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes guardarFabricantes(@RequestBody Fabricantes fabricante) {
		return fabricantesService.guardarFabricante(fabricante);
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarFabricante(@PathVariable(name="id") Long id, @RequestBody Fabricantes fabricante) {
		Fabricantes fabricanteSeleccionado = fabricantesService.buscarFabricante(id);
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		
		return fabricantesService.actualizarFabricante(fabricanteSeleccionado);
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name="id")Long id) {
		fabricantesService.eliminarFabricante(id);
	}
	
}
