package main.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table (name="fabricantes")
public class Fabricantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	//El punto de unión es el id de esta clase
	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
	private List<Articulos> articulos;
	
	public Fabricantes(Long id, String nombre, List<Articulos> articulos) {
		this.id = id;
		this.nombre = nombre;
		this.articulos = articulos;
	}

	public Fabricantes() {}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Articulos> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
	
	
	
}
