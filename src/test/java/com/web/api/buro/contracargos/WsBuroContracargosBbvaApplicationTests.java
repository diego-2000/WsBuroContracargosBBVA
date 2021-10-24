package com.web.api.buro.contracargos;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.web.api.buro.contracargos.dto.DTONivelContraComercio;
import com.web.api.buro.contracargos.implement.ImplementContracargo;

@SpringBootTest
class WsBuroContracargosBbvaApplicationTests {
	@Autowired(required=true)
	private ImplementContracargo ic;
	
	@Test
	void contextLoads() {
		List<Object> a = new ArrayList();
				
			//	this.ic.nivContraComercio("OPENPAY",2021);

		System.out.println(this.ic.nivContraComercio("OPENPAY",2021));
	}

}
