package com.web.api.buro.contracargos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.api.buro.contracargos.implement.ImplementContracargo;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")

public class ControllerComercio {
	@Autowired
	private ImplementContracargo ic;

	@PostMapping("/pruebas")
	public List<Object> getNivelContraComercio() {
		return this.ic.nivContraComercio("OPENPAY", 2021);
	}
	
}
