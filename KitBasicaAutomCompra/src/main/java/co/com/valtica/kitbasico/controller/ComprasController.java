package co.com.valtica.kitbasico.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.valtica.kitbasico.entidades.Compra;
import co.com.valtica.kitbasico.entidades.RespuestaCompra;

@RestController
@RequestMapping("/api")
public class ComprasController {

	@PostMapping("/compras")
	public RespuestaCompra registrarCompra(@Valid @RequestBody Compra compra) {

		RespuestaCompra respuesta = new RespuestaCompra();
		respuesta.setCodigoRespuesta("1");
		respuesta.setMensajeRespuesta("Se registró la compra correctamente");
		return respuesta;
	}

}
