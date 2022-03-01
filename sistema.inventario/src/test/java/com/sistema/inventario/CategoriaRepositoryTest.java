package com.sistema.inventario;


import com.sistema.inventario.categoria.Categoria;
import com.sistema.inventario.categoria.CategoriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CategoriaRepositoryTest {

    @Autowired
    private CategoriaRepository repositorio;

    @Test
    public  void testCrearCategoria(){
        Categoria categoriaGuardada = repositorio.save(new Categoria("Electronicos"));

    }

}
