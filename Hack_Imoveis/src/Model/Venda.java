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
    private List<Venda> listaVenda;
    
    
public Venda(){
    autoIncremento++;
    lista = new ArrayList<Aluguel>();
    listaVenda = new ArrayList<Venda>();
    dataVenda = new Date();
}
    public void inserirAluguel(Aluguel aluguel)
    {
        lista.add(aluguel);
    }
    
    public void inserirVenda(Venda venda)
    {   
        listaVenda.add(venda);
    }
    
    
}
