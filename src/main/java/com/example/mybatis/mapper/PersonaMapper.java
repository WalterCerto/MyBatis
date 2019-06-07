package com.example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis.entity.Persona;

@Mapper
public interface PersonaMapper {

	void insert(@Param("persona") Persona persona);

	void update(@Param("persona") Persona persona);

	Persona get(@Param("id") Long id);

	void delete(@Param("id") Long id);

	List<Persona> list();

}
