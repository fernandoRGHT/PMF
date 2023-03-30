package org.example.requests;

import org.example.model.Muestra;
import org.example.repository.MuestraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.junit.jupiter.api.Test;

@DataJpaTest()
public class MuestraTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    MuestraRepository repository;

    @Test
    public void buscatodas (){
        Iterable<Muestra> muestras = repository.findAll();


    }
}
