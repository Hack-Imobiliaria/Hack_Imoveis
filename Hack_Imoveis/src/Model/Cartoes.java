/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author wagner
 */
public class Cartoes {
    private String nomeTitular ;
    private String numeroCartao;
    private Date dataValidade;
    private int codigoVerificacao;

    // construtor

    public Cartoes() {
    }
    
    
    public Cartoes(String nomeTitular, String numeroCartao, Date dataValidade, int codigoVerificacao) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoVerificacao = codigoVerificacao;
    }
    
    
    
    // metodo get e set 
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodigoVerificacao() {
        return codigoVerificacao;
    }

    public void setCodigoVerificacao(int codigoVerificacao) {
        this.codigoVerificacao = codigoVerificacao;
    }
    
    
}
