package com.example.mybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatis.entity.Persona;
import com.example.mybatis.entity.Response;
import com.example.mybatis.service.PersonaService;

@RestController
@RequestMapping("api/persona")
public class PersonaController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

	@Autowired
	private PersonaService personaService;

	@GetMapping(path = "/list")
	public Response list() {
		Response response = new Response();
		try {
			response.setData(personaService.list());
			response.setStatus(0);
		} catch (Exception e) {
			LOGGER.error("ERROR", e);
			response.setStatus(1);
			response.setMessage("Ocurrio un error al obtener las personas");
		}
		return response;
	}

	@PostMapping(path = "/create")
	public Response create(@RequestBody Persona persona) {
		Response response = new Response();
		try {
			personaService.create(persona);
			response.setStatus(0);
		} catch (Exception e) {
			LOGGER.error("ERROR", e);
			response.setStatus(1);
			response.setMessage("Ocurrio un error al guardar el persona");
		}
		return response;
	}

	@PutMapping(path = "/update")
	public Response update(@RequestBody Persona persona) {
		Response response = new Response();
		try {
			personaService.update(persona);
			response.setStatus(0);
		} catch (Exception e) {
			LOGGER.error("ERROR", e);
			response.setStatus(1);
			response.setMessage("Ocurrio un error al actualizar la persona");
		}
		return response;
	}

	@DeleteMapping(path = "/delete/{id}")
	public Response delete(@PathVariable("id") Long id) {
		Response response = new Response();
		try {
			personaService.delete(id);
			response.setStatus(0);
		} catch (Exception e) {
			LOGGER.error("ERROR", e);
			response.setStatus(1);
			response.setMessage("Ocurrio un error al eliminar la persona");
		}
		return response;
	}

	@GetMapping(path = "/get/{id}")
	public Response get(@PathVariable("id") Long id) {
		Response response = new Response();
		try {
			response.setStatus(0);
			response.setData(personaService.get(id));
		} catch (Exception e) {
			LOGGER.error("ERROR", e);
			response.setStatus(1);
			response.setMessage("Ocurrio un error al obtener la persona");
		}
		return response;
	}

}
