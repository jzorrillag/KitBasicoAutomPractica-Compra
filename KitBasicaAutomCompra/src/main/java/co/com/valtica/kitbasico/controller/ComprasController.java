package co.com.valtica.kitbasico.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.valtica.kitbasico.entidades.Compra;
import co.com.valtica.kitbasico.service.CompraService;

@RestController
@RequestMapping("/api")
public class ComprasController {

	@Autowired
	CompraService compraService;

	@PostMapping("/compras")
	public Compra registrarCompra(@Valid @RequestBody Compra compra) {

		return compraService.calcularValorPoliza(compra.getIdPoliza(), compra.getIdAsegurado());
	}

}
