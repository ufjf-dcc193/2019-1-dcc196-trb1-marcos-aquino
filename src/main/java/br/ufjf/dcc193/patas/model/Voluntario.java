package br.ufjf.dcc193.patas.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Voluntario
 */
@Entity
@Table(name = "voluntario")
public class Voluntario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Sede sede;
    private String nome;
    private String funcao;
    private String email;
    private String data_entrada;
    private String data_saida;

    public Voluntario() {
    }

    public Voluntario(String nome, String funcao, String email, String data_entrada, String data_saida) {
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
    }

    public Voluntario(Sede sede, String nome, String funcao, String email, String data_entrada, String data_saida) {
        this.sede = sede;
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the sede
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }

    /**
     * @return the data_entrada
     */
    public String getData_entrada() {
        return data_entrada;
    }

    /**
     * @return the data_saida
     */
    public String getData_saida() {
        return data_saida;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param data_entrada the data_entrada to set
     */
    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    /**
     * @param data_saida the data_saida to set
     */
    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}