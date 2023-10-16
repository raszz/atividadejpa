/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.factory;

import com.atividadejpa.entities.Aluno;
import com.atividadejpa.entities.Orientador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author moaci
 */
public class Factory {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager manager = factory.createEntityManager();

        //Inserção de alunos e orientadores
//        Orientador orientador1 = new Orientador();
//        orientador1.setNome("Cristiano Alves");
//        orientador1.setMatricula("22559");
//        orientador1.setEmail("cristiano@ifpb.edu.br");
//
//        Orientador orientador2 = new Orientador();
//        orientador2.setNome("Fábio Abrantes Diniz");
//        orientador2.setMatricula("22557");
//        orientador2.setEmail("fabioads@ifpb.edu.br");
//
//        Aluno aluno1 = new Aluno();
//        aluno1.setNome("Moacir David");
//        aluno1.setMatricula("202012010020");
//        aluno1.setEmail("moacir@gmail.com");
//        aluno1.setOrientador(orientador1);
//
//        Aluno aluno2 = new Aluno();
//        aluno2.setNome("Ramon Rolim");
//        aluno2.setMatricula("20192010001");
//        aluno2.setEmail("ramon@gmail.com");
//        aluno2.setOrientador(orientador2);
//
//        Orientador fabioGomes = new Orientador();
//        fabioGomes.setNome("Fábio Gomes");
//        fabioGomes.setMatricula("23312");
//        fabioGomes.setEmail("fabio@ifpb.edu.br");
//
//        Aluno tobias = new Aluno();
//        tobias.setNome("Tobias Miguel");
//        tobias.setMatricula("202012010018");
//        tobias.setEmail("tobias@academico.ifpb.edu.br");
//        tobias.setOrientador(fabioGomes);
//
//        manager.getTransaction().begin();
//
//        manager.persist(orientador1);
//        manager.persist(orientador2);
//        manager.persist(fabioGomes);
//
//        manager.persist(aluno1);
//        manager.persist(aluno2);
//        manager.persist(tobias);
//
//        manager.getTransaction().commit();
//        manager.close();
        // Consultando aluno por matrícula
//        
//        String matriculaAluno = "202012010020";
//        
//        manager.getTransaction().begin();
//        
//        Query query = manager.createQuery("FROM Aluno a WHERE a.matricula = :matricula");
//        query.setParameter("matricula", matriculaAluno);
//        
//        Aluno aluno = (Aluno) query.getSingleResult();
//        
//        manager.getTransaction().commit();
//        manager.close();
//        
//        System.out.println(aluno.toString());
        // Atualizando um registro
//        manager.getTransaction().begin();
//
//        Aluno aluno = manager.find(Aluno.class, 1L);
//        aluno.setNome("Moacir David de Almeida Gonçalves");
//
//        manager.getTransaction().commit();
//        manager.close();

        // Deletando um aluno
        
//        manager.getTransaction().begin();
//        
//        Aluno aluno = manager.find(Aluno.class, 3L);
//        manager.remove(aluno);
//        
//        manager.getTransaction().commit();
//        manager.close();

    }

}
