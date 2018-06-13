/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denner
 */
public class EnderecoDAO {
    private List<Endereco> lista = null;

    public EnderecoDAO() {
        lista = new ArrayList<Endereco>();
    }
    
    public void inserirEndereco(Endereco cliente)
    {
        lista.add(cliente);
    }
    
    public Endereco buscarEndereco(int numero)
    {
        Endereco end = null;
        for(Endereco endereco: lista)
        {
            if(endereco.getNumero() == numero)
                end = endereco;
        }
        
        return end;
    }
    
    public void removerEndereco(int numero)
    {
        Endereco end = buscarEndereco(numero);
        if(end != null)
        {
            lista.remove(end);
        }
    }
    
    public void alterarEndereco(int numero)
    {
        Endereco end = buscarEndereco(numero);
        if(end != null)
        {
            int pos = lista.indexOf(end);
            lista.set(pos, end);
        }
    }
    
    public List<Endereco> todosEndereco()
    {
        return lista;
    }
}
