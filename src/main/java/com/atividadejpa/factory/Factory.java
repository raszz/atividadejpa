/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.factory;

import com.atividadejpa.entities.AlunoEntity;
import com.atividadejpa.entities.OrientadorEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author moaci
 */
public class Factory {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager manager = factory.createEntityManager();

        // Inserção de alunos e orientadores
//        OrientadorEntity orientador1 = new OrientadorEntity();
//        orientador1.setNome("Cristiano Alves");
//        orientador1.setMatricula("22559");
//        orientador1.setEmail("cristiano@ifpb.edu.br");
//
//        OrientadorEntity orientador2 = new OrientadorEntity();
//        orientador2.setNome("Fábio Abrantes Diniz");
//        orientador2.setMatricula("22557");
//        orientador2.setEmail("fabioads@ifpb.edu.br");
//
//        AlunoEntity aluno1 = new AlunoEntity();;
//        aluno1.setNome("Moacir David");
//        aluno1.setMatricula("202012010020");
//        aluno1.setEmail("moacir@gmail.com");
//        aluno1.setOrientador(orientador1);
//
//        AlunoEntity aluno2 = new AlunoEntity();
//        aluno2.setNome("Ramon Rolim");
//        aluno2.setMatricula("20192010001");
//        aluno2.setEmail("ramon@gmail.com");
//        aluno2.setOrientador(orientador2);
//        
//
//        manager.getTransaction().begin();
//
//        manager.persist(orientador1);
//        manager.persist(orientador2);
//        
//        manager.persist(aluno1);
//        manager.persist(aluno2);
//
//        manager.getTransaction().commit();
//        manager.close();
        // Consultando banco de dados
        manager.getTransaction().begin();

        OrientadorEntity orientador = manager.find(OrientadorEntity.class, 1L);

        manager.getTransaction().commit();
        manager.close();

        System.out.println(orientador.getNome());
        
    }

}
