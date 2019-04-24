package br.ufjf.dcc193.patas.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Atuacao
 */
@Entity
@Table(name = "atuacao")
public class Atuacao{    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)    
    private Sede sede;
    private String titulo;
    private String descricao;
    private String data_inicio;
    private String data_fim;
    private int hora_assistencial;
    private int hora_juridica;
    private int hora_executiva;
    private int hora_financeira;

    public Atuacao() {
    }

    public Atuacao(String titulo, String descricao, String data_inicio, String data_fim, int hora_assistencial,
            int hora_juridica, int hora_executiva, int hora_financeira) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.hora_assistencial = hora_assistencial;
        this.hora_juridica = hora_juridica;
        this.hora_executiva = hora_executiva;
        this.hora_financeira = hora_financeira;
    }

    public Atuacao(Sede sede, String titulo, String descricao, String data_inicio, String data_fim,
            int hora_assistencial, int hora_juridica, int hora_executiva, int hora_financeira) {
        this.sede = sede;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.hora_assistencial = hora_assistencial;
        this.hora_juridica = hora_juridica;
        this.hora_executiva = hora_executiva;
        this.hora_financeira = hora_financeira;
    }

    public int getTotal_horas(){
        return this.hora_assistencial+this.hora_juridica+this.hora_executiva+this.hora_financeira;
    }
    /**
     * @return the hora_assistencial
     */
    public int getHora_assistencial() {
        return hora_assistencial;
    }

    /**
     * @return the hora_executiva
     */
    public int getHora_executiva() {
        return hora_executiva;
    }

    /**
     * @return the hora_financeira
     */
    public int getHora_financeira() {
        return hora_financeira;
    }

    /**
     * @return the hora_juridica
     */
    public int getHora_juridica() {
        return hora_juridica;
    }

    /**
     * @param hora_assistencial the hora_assistencial to set
     */
    public void setHora_assistencial(int hora_assistencial) {
        this.hora_assistencial = hora_assistencial;
    }

    /**
     * @param hora_executiva the hora_executiva to set
     */
    public void setHora_executiva(int hora_executiva) {
        this.hora_executiva = hora_executiva;
    }

    /**
     * @param hora_financeira the hora_financeira to set
     */
    public void setHora_financeira(int hora_financeira) {
        this.hora_financeira = hora_financeira;
    }

    /**
     * @param hora_juridica the hora_juridica to set
     */
    public void setHora_juridica(int hora_juridica) {
        this.hora_juridica = hora_juridica;
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
     * @return the data_fim
     */
    public String getData_fim() {
        return data_fim;
    }

    /**
     * @return the data_inicio
     */
    public String getData_inicio() {
        return data_inicio;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}