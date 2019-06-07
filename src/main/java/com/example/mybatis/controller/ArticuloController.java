package com.example.mybatis.controller;

import com.example.mybatis.entity.Articulo;
import com.example.mybatis.entity.Response;
import com.example.mybatis.service.ArticuloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path= "api/articulo")
public class ArticuloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticuloController.class);

    @Autowired
    private ArticuloService articuloService;

    @GetMapping(path ="/list")
    public Response list() {
        Response response = new Response();
        try {
            response.setData(articuloService.list());
            response.setStatus(0);
        }catch (Exception e){
            LOGGER.error("ERROR", e);
            response.setStatus(1);
            response.setMessage("Ocurrio un error al obtener los articulos");
        }
        return response;
    }

    @PostMapping(path="/create")
    public Response create(@RequestBody Articulo articulo){
        Response response = new Response();
        try{
            articuloService.create(articulo);
            response.setStatus(0);
        }catch (Exception e){
            LOGGER.error("ERROR", e);
            response.setStatus(1);
            response.setMessage("Ocurrio un error al crear el articulo");
        }
        return response;
    }

    @PutMapping(path = "/update")
    public Response update(Articulo articulo){
        Response response = new Response();
        try{
            articuloService.update(articulo);
            response.setStatus(0);
        }catch (Exception e){
            LOGGER.error("ERROR",e);
            response.setStatus(1);
            response.setMessage("Ocurrio un error al actualizar el articulo");
        }
        return response;
    }

    @DeleteMapping(path = "/delete/{id}")
    public Response delete(@PathVariable("id") Long id) {
        Response response = new Response();
        try {
            articuloService.delete(id);
            response.setStatus(0);
        } catch (Exception e) {
            LOGGER.error("ERROR", e);
            response.setStatus(1);
            response.setMessage("Ocurrio un error al eliminar el articulo");
        }
        return response;
    }

    @GetMapping(path = "/get/{id}")
    public Response get(@PathVariable("id") Long id) {
        Response response = new Response();
        try {
            response.setStatus(0);
            response.setData(articuloService.get(id));
        } catch (Exception e) {
            LOGGER.error("ERROR", e);
            response.setStatus(1);
            response.setMessage("Ocurrio un error al obtener el articulo");
        }
        return response;
    }
}
