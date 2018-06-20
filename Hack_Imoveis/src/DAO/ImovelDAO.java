/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Imovel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denner
 */
public class ImovelDAO {
    private List<Imovel> lista = null;

    public ImovelDAO() {
        lista = new ArrayList<Imovel>();
    }
    
    public void inserirImovel(Imovel Imovel)
    {
        lista.add(Imovel);
    }
    
    public Imovel buscarImovel(int numero)
    {
        Imovel imovel = null;
        for(int i =0; i<lista.size();i++)
        {
            if(lista.get(i).getNumeroImovel() == numero)
                imovel = lista.get(i);
        }
        
        return imovel;
    }
    
    public void removerImovel(int numero)
    {
        Imovel imovel = buscarImovel(numero);
        if(imovel != null)
        {
            lista.remove(imovel);
        }
    }
    
    public void alterarImovel(int numero)
    {
        Imovel imovel = buscarImovel(numero);
        if(imovel != null)
        {
            int pos = lista.indexOf(imovel);
            lista.set(pos, imovel);
        }
    }
    
    public List<Imovel> todosImovels()
    {
        return lista;
    }
}
