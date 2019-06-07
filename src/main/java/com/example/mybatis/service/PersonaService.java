package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.entity.Persona;
import com.example.mybatis.mapper.PersonaMapper;

@Service
public class PersonaService {

	@Autowired
	private PersonaMapper personaMapper;

	public PersonaService() { }

	public void create(Persona persona) {
		personaMapper.insert(persona);
	}

	public void update(Persona persona) {
		personaMapper.update(persona);
	}

	public Persona get(Long id) {
		return personaMapper.get(id);
	}

	public List<Persona> list() {
		return personaMapper.list();
	}

	public void delete(Long id) {
		personaMapper.delete(id);
	}

}
