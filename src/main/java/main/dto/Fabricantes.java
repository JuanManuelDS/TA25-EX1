package main.dto;

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
	
	
}
