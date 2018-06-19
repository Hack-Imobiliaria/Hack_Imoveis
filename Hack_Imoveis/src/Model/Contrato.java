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
public class Contrato {
    private String contratoAluguel;
    private String contratoCompra;

    public Contrato() {
    }
    

    public Contrato(String contratoAluguel, String contratoCompra) {
        this.contratoAluguel = contratoAluguel;
        this.contratoCompra = contratoCompra;
    }

    public String getContratoAluguel() {
        return contratoAluguel;
    }

    public void setContratoAluguel(String contratoAluguel) {
        this.contratoAluguel = contratoAluguel;
    }

    public String getContratoCompra() {
        return contratoCompra;
    }

    public void setContratoCompra(String contratoCompra) {
        this.contratoCompra = contratoCompra;
    }
    
    
    
}
