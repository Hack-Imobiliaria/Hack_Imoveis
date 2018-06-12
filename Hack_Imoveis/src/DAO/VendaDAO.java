/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denner
 */
public class VendaDAO {
    private List<Venda> lista = null;

    public VendaDAO() {
        lista = new ArrayList<Venda>();
    }
    public void inserirVenda(Venda venda)
    {
        lista.add(venda);
    }
    
    public Venda buscarVenda(int numero)
    {
        Venda v = null;
        for(Venda venda: lista)
        {
            if(venda.getNumero() == numero)
                v = venda;
        }
        
        return v;
    }
    
    public void removerVenda(int numero)
    {
        Venda venda = buscarVenda(numero);
        if(venda != null)
        {
            lista.remove(venda);
        }
    }
    
    public void alterarVenda(int numero)
    {
        Venda venda = buscarVenda(numero);
        if(venda != null)
        {
            int pos = lista.indexOf(venda);
            lista.set(pos, venda);
        }
    }
    
    public List<Venda> todosVendas()
    {
        return lista;
    }
}
