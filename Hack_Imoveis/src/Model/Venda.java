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
    private List<Imovel> listaAluguel; // mudar para imovle > listaAluguel
    private List<Imovel> listaVenda;

    
public Venda(){
    autoIncremento++;
    listaAluguel = new ArrayList<Imovel>();
    listaVenda = new ArrayList<Imovel>();
    dataVenda = new Date();
}
    public void inserirAluguel(Imovel aluguelImovel )
    {
        listaAluguel.add(aluguelImovel);
    
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

    public List<Imovel> getListaAluguel() {
        return listaAluguel;
    }

    public void setListaAluguel(List<Imovel> listaAluguel) {
        this.listaAluguel = listaAluguel;
    }

    public List<Imovel> getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(List<Imovel> listaVenda) {
        this.listaVenda = listaVenda;
    }

    public int getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
