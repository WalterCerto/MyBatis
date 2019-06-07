package com.example.mybatis.mapper;

import com.example.mybatis.entity.Articulo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticuloMapper {

    void insert(@Param("articulo")Articulo articulo);

    void update(@Param("articulo") Articulo articulo);

    Articulo get(@Param("id") Long id);

    void delete(@Param("id") Long id);

    List<Articulo> list();
}
