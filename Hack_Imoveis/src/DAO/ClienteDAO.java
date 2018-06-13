/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denner
 */
public class ClienteDAO {
    private List<Cliente> lista = null;

    public ClienteDAO() {
        lista = new ArrayList<Cliente>();
    }
    
    public void inserirCliente(Cliente cliente)
    {
        lista.add(cliente);
    }
    
    public Cliente buscarCliente(String cpf)
    {
        Cliente cli = null;
        for(int i =0; i<lista.size();i++)
        {
            if(lista.get(i).getCpf().equals(cpf))
                cli = lista.get(i);
        }
        
        return cli;
    }
    
    public void removerCliente(String cpf)
    {
        Cliente cli = buscarCliente(cpf);
        if(cli != null)
        {
            lista.remove(cli);
        }
    }
    
    public void alterarCliente(String cpf)
    {
        Cliente cli = buscarCliente(cpf);
        if(cli != null)
        {
            int pos = lista.indexOf(cli);
            lista.set(pos, cli);
        }
    }
    
    public List<Cliente> todosClientes()
    {
        return lista;
    }
}
