/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author wagner
 */
public class Venda {
    private static int autoIncremento =0;
    private Cliente cliente;
    private float valorVenda;
    private Date dataVenda;
    private List<Aluguel> lista;
    private List<Imovel> listaVenda;

    
public Venda(){
    autoIncremento++;
    lista = new ArrayList<Aluguel>();
    listaVenda = new ArrayList<Imovel>();
    dataVenda = new Date();
}
    public void inserirAluguel(Aluguel aluguel)
    {
        lista.add(aluguel);
    }
    
    public void inserirVenda(Imovel vendaImovel)
    {   
        listaVenda.add(vendaImovel);
    }
    
   // public Aluguel buscarAlug( numeroContrato)
    

public static int getAutoIncremento() {
        return autoIncremento;
    }

    public static void setAutoIncremento(int autoIncremento) {
        Venda.autoIncremento = autoIncremento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<Aluguel> getLista() {
        return lista;
    }

    public void setLista(List<Aluguel> lista) {
        this.lista = lista;
    }

    public List<Imovel> getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(List<Imovel> listaVenda) {
        this.listaVenda = listaVenda;
    }
        
}
