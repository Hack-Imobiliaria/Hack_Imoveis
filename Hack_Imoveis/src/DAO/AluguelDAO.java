/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Aluguel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denner
 */
public class AluguelDAO {
    private List<Aluguel> lista = null;
    
    public AluguelDAO() {
        lista = new ArrayList<Aluguel>();
    }
    public void inserirVenda(Aluguel aluguel)
    {
        lista.add(aluguel);
    }
    public Aluguel buscarAluguel(int numero)
    {
        Aluguel a = null;
        for(Aluguel aluguel: lista)
        {
            if(aluguel.getNumero() == numero)
                a = aluguel;
        }        
        return a;
    }
    public void removerAluguel(int numero)
    {
        Aluguel aluguel = buscarAluguel(numero);
        if(aluguel != null)
        {
            lista.remove(aluguel);
        }
    }
    public void alterarAluguel(int numero)
    {
        Aluguel aluguel = buscarAluguel(numero);
        if(aluguel != null)
        {
            int pos = lista.indexOf(aluguel);
            lista.set(pos, aluguel);
        }
    }
    public List<Aluguel> todosAluguels()
    {
        return lista;
    }
    
}
