package com.web.api.buro.contracargos.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.api.buro.contracargos.dto.DTONivelContraComercio;

@Service
public interface ServiceContracargo {

	public List<Object> nivContraComercio(String comercio,int anio);
	
}
