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
public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private String estadoCivil;
    private Endereco enderecoCli;   // atual entereco do cliente
    private Cartoes cartaoCli;

    public Cliente(String cpf, String nome, String telefone, String email, String estadoCivil, Endereco enderecoCli) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.enderecoCli = enderecoCli;
    }

    public Cliente() {
    }
    
    // metodo toString
    @Override
    public String toString()
    {
        String str = "CPF: " + cpf;
        str += "\nNOME: " + nome;
        str += "\nEMAIL: " + email;
        str += "\nTELEFONE: " + telefone;
        str += "\nESTADO CIVIL: " + estadoCivil;
        str += "\n---------- ENDERREÇO ----------- ";
        str += "\nLOGRADOURO: " + enderecoCli.getLogradouro();
        str += "\nCIDADE: " + enderecoCli.getCidade();
        str += "\nESTADO: " + enderecoCli.getEstado();
        str += "\nCEP: " + enderecoCli.getCep();
               
        return str;
        
    }


// metodos get set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEnderecoCli() {
        return enderecoCli;
    }

    public void setEnderecoCli(Endereco enderecoCli) {
        this.enderecoCli = enderecoCli;
    }
    public Cartoes getCartaoCli() {
        return cartaoCli;
    }
    public void setCartaoCli(Cartoes cartaoCli) {
        this.cartaoCli = cartaoCli;
    }
    
   
    
    
    
    
}
