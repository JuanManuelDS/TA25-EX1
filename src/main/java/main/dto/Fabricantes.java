package main.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@Entity
@Table (name="fabricantes")
public class Fabricantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	//El punto de unión es el id de esta clase
	@OneToMany
	@JoinColumn(name="id")
	private List<Articulos> articulos;

	public Fabricantes(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public List<Articulos> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
	
	
	
}
