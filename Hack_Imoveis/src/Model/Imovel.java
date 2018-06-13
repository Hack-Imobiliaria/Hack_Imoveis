/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wagner
 */
public class Imovel {
    private Endereco endereco;
    private float valorImovel;
    private String nome;
    private int numeroImovel;

    public int getNumeroImovel() {
        return numeroImovel;
    }

    public void setNumeroImovel(int numeroImovel) {
        this.numeroImovel = numeroImovel;
    }
    

    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public float getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(float valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
}
