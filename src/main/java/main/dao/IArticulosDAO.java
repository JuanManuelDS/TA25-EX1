package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long> {

}
