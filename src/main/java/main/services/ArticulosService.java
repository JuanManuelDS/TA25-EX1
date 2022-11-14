package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IArticulosDAO;
import main.dto.Articulos;

@Service
public class ArticulosService implements IArticulosService {

	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listarArticulos() {
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulo) {
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos buscarArticulo(Long id) {
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulo) {
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		
		iArticulosDAO.deleteById(id);
		
	}
	
	
}
