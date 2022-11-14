package main.services;

import java.util.List;

import main.dto.Fabricantes;

public interface IFabricantesService {
	
	public List<Fabricantes> listarFabricantes();
	
	public Fabricantes guardarFabricante(Fabricantes fabricante);
	
	public Fabricantes buscarFabricante(Long id);
	
	public Fabricantes actualizarFabricante(Fabricantes fabricante);
	
	public void eliminarFabricante(Long id);
}
