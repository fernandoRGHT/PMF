package org.example.controler;

import org.example.model.Muestra;
import org.example.repository.MuestraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/muestras")
public class MuestraController {
    @Autowired
    private MuestraRepository repository;

    @GetMapping("/all")
    public List<Muestra> buscarMuestras() {
        return repository.findAll();
    }

    @GetMapping ("/filter/{codAnalisis}")
    public  List<Muestra> listaporAnalisis(@PathVariable String codAnalisis){
        return  repository.findByCodAnalisis(codAnalisis);
    }
}
