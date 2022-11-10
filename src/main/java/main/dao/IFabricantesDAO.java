package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Fabricantes;

public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long>{

}
