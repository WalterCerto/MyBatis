package com.example.mybatis.service;

import com.example.mybatis.entity.Articulo;
import com.example.mybatis.mapper.ArticuloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {

    @Autowired
    private ArticuloMapper articuloMapper;

    public ArticuloService() {}

    public void create(Articulo articulo){articuloMapper.insert(articulo);}

    public void update(Articulo articulo){articuloMapper.update(articulo);}

    public Articulo get(Long id){return articuloMapper.get(id);}

    public List<Articulo> list(){return articuloMapper.list();}

    public void delete(Long id){articuloMapper.delete(id);}

}
