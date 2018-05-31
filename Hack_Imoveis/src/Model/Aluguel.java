/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wagner
 */
public class Aluguel extends Venda {
    /*
        a class aluguel nao precisa de um objeto enderecoe 
    * ele vendo da class imoveil
    */
    //private Endereco endereco; // objeto endereco 
    private List<Cliente> alugeulCliente; // lista de cliente que aluga imoveil
    private Imovel imovel;
    private float valorAlugel;
    private float diasAlugados;

//metodo da class aluguem 
    public void calcularValorAlugel()
    {   
        valorAlugel = imovel.getValorImovel() * diasAlugados ;
    }
// get e set
    public List<Cliente> getAlugeulCliente() {
        return alugeulCliente;
    }

    public void setAlugeulCliente(List<Cliente> alugeulCliente) {
        this.alugeulCliente = alugeulCliente;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public float getValorAlugel() {
        return valorAlugel;
    }

    public void setValorAlugel(float valorAlugel) {
        this.valorAlugel = valorAlugel;
    }

    public float getDiasAlugados() {
        return diasAlugados;
    }

    public void setDiasAlugados(float diasAlugados) {
        this.diasAlugados = diasAlugados;
    }


}
