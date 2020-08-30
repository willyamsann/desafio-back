package com.willyam.lista.controller;

import java.util.List;

import com.willyam.lista.models.Lista;
import com.willyam.lista.repository.ListaRepo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping({"/lista"})
public class ListaController {

  private ListaRepo repository;

  ListaController(ListaRepo listaRepo) {
      this.repository = listaRepo;
  }
  @GetMapping
  public List findAll(){
    return repository.findAll();
  }
  @GetMapping(path = {"/{id}"})
public ResponseEntity<Lista> findById(@PathVariable long id){
  return repository.findById(id)
          .map(record -> ResponseEntity.ok().body(record))
          .orElse(ResponseEntity.notFound().build());
}
 
@PostMapping
public Lista create(@RequestBody Lista lista){
    return repository.save(lista);
}
@DeleteMapping(path ={"/{id}"})
  public ResponseEntity<?> delete(@PathVariable("id") long id) {
    return repository.findById(id)
        .map(record -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
  }

  @PutMapping(value="/{id}")
  public ResponseEntity<Lista> 
  update(@PathVariable("id") long id,                                   
  @RequestBody Lista lista){
    return repository.findById(id)
        .map(record -> {
            record.setTitulo(lista.getTitulo());
            record.setStatus(lista.getStatus());
        
            Lista updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
  }
}

