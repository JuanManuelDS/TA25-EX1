package main.services;

import java.util.List;


import main.dto.Articulos;

public interface IArticulosService {

	public List<Articulos> listarArticulos();
	
	public Articulos guardarArticulos (Articulos articulo);
	
	public Articulos buscarArticulo (Long id);
	
	public Articulos actualizarArticulos (Articulos articulo);
	
	public void eliminarArticulo(Long id);
	
}
