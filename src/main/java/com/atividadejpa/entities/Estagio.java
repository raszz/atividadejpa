/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

/**
 *
 * @author RAMON
 */
@Entity
public class Estagio implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String titulo;
    @NotNull
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    @NotNull
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataTermino;
    @NotNull
    private int duracao;
    @NotNull
    private String status;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Aluno aluno;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Orientador orientador;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Empresa empresa;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    


    @Override
    public String toString() {
        return "EstagioEntity{" + "id=" + id + ", titulo=" + titulo + " dataInicio=" + dataInicio + " dataTermino=" + dataTermino
                + " duracao=" + duracao + "status=" + status + "orientador=" + orientador + "aluno=" + aluno + "Empresa=" + empresa + "}";
    }
    
}
