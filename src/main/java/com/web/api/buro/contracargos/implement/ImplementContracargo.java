package com.web.api.buro.contracargos.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.api.buro.contracargos.repository.RepositoryContracargo;
import com.web.api.buro.contracargos.service.ServiceContracargo;

public class ImplementContracargo implements ServiceContracargo{
	
	@Autowired
	public RepositoryContracargo rc;

	@Override
	public List<Object> nivContraComercio(String comercio, int anio) {
		return rc.nivContraComercio(comercio,anio);
	}
	
}
