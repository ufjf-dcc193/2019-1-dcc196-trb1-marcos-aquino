package br.ufjf.dcc193.patas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sede
 */
@Entity
@Table(name = "sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome_fantasia;
    private String estado;
    private String cidade;
    private String bairro;
    private int telefone;
    private String endereco;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Atuacao> atuacoes;

    public Sede() {

    }

    public Sede(String nome_fantasia, String estado, String cidade, String bairro, int telefone, String endereco) {
        this.nome_fantasia = nome_fantasia;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    /**
     * @param atuacoes the atuacoes to set
     */
    public void setAtuacoes(List<Atuacao> atuacoes) {
        this.atuacoes = atuacoes;
    }

    /**
     * @return the atuacoes
     */
    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    @Override
    public String toString() {
        return super.toString();
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
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the nome_fantasia
     */
    public String getNome_fantasia() {
        return nome_fantasia;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @param nome_fantasia the nome_fantasia to set
     */
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int totalHoras() {
        int total = 0;
        for (int i = 0; i < getAtuacoes().size(); i++) {
            total += atuacoes.get(i).getTotal_horas();
        }
        return total;
    }
}