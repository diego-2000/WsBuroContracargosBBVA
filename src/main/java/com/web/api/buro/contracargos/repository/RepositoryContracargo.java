package com.web.api.buro.contracargos.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.api.buro.contracargos.dto.DTONivelContraComercio;
import com.web.api.buro.contracargos.model.Contracargo;
@Repository
public interface RepositoryContracargo extends JpaRepository<Contracargo,Long>{
	
	
	@Query(value="SELECT COUNT(*) as cantidad, MONTH(c.fecha_vta) as mes FROM contracargo c WHERE YEAR(c.fecha_vta)=:anio and comercio=:comercio GROUP BY MONTH(c.fecha_vta)",nativeQuery=true)
	List<Object> nivContraComercio(@Param("comercio") String comercio,@Param("anio") int anio);	

}