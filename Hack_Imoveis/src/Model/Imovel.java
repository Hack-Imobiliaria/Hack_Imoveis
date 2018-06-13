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
public class Imovel {
    private Endereco endereco;
    private float valorImovel;
    private String nome;
    private String numeroImovel;
    private String sala;
    private String quartos;
    private String cozinha;
    private String banheiro;
    private String garagem;
    private String porao;
    private String terraco;
    private String quital;
    private String jardim;
    private String picina;
    private String quadraEsporte;
    private String areaServico;
    private String andar;
    private String varanda;
    private String escada;
    private String elevador;

    public Imovel(Endereco endereco, float valorImovel, String nome, String sala, String quartos, String cozinha, String banheiro, String garagem, String porao, String terraco, String quital, String jardim, String picina, String quadraEsporte, String areaServico, String andar, String varanda, String escada, String elevador) {
        this.endereco = endereco;
        this.valorImovel = valorImovel;
        this.nome = nome;
        this.sala = sala;
        this.quartos = quartos;
        this.cozinha = cozinha;
        this.banheiro = banheiro;
        this.garagem = garagem;
        this.porao = porao;
        this.terraco = terraco;
        this.quital = quital;
        this.jardim = jardim;
        this.picina = picina;
        this.quadraEsporte = quadraEsporte;
        this.areaServico = areaServico;
        this.andar = andar;
        this.varanda = varanda;
        this.escada = escada;
        this.elevador = elevador;
    }
    public Imovel(){
        endereco = new Endereco();
    }

    
    // metodo toString
    @Override
    public String toString(){
        String str = "";
        str = str + "\n:endereço -->"+endereco;
        str = str + "\n:Valor do Imovel -->"+valorImovel;
        str = str + "\n:Nome -->"+nome;
        str = str + "\n:Quantidade de Salas -->"+sala;
        str = str + "\n:Quantidade de Quartos -->"+quartos;
        str = str + "\n:Quantidade de Cozinhas -->"+cozinha;
        str = str + "\n:Quantidade de Banheiros -->"+banheiro;
        str = str + "\n:Numero de vagas na Garagem -->"+garagem;
        str = str + "\n:Tamanho do Porão -->"+porao;
        str = str + "\n:Tamanho do Terraço -->"+terraco;
        str = str + "\n:Tamanho do QuStringal -->"+quital;
        str = str + "\n:Tamanho do Jardim -->"+jardim;
        str = str + "\n:Tamanho do Picina -->"+picina;
        str = str + "\n:Tamanho do Quadra de Esportes -->"+quadraEsporte;
        str = str + "\n:Tamanho do Area de Serviço -->"+areaServico;
        str = str + "\n:Numer de Andares -->"+andar;
        str = str + "\n:Tamanho do Varanda -->"+varanda;
        str = str + "\n: -->"+escada;
        str = str + "\n: -->"+elevador;
        
        return str;
    }
    
    public String getAndar() {
        return andar;
    }    

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getVaranda() {
        return varanda;
    }

    public void setVaranda(String varanda) {
        this.varanda = varanda;
    }

    public String isEscada() {
        return escada;
    }

    public void setEscada(String escada) {
        this.escada = escada;
    }

    public String isElevador() {
        return elevador;
    }

    // metodos get e set
    public void setElevador(String elevador) {
        this.elevador = elevador;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public float getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(float valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getQuartos() {
        return quartos;
    }

    public void setQuartos(String quartos) {
        this.quartos = quartos;
    }

    public String getCozinha() {
        return cozinha;
    }

    public void setCozinha(String cozinha) {
        this.cozinha = cozinha;
    }

    public String getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(String banheiro) {
        this.banheiro = banheiro;
    }

    public String getGaragem() {
        return garagem;
    }

    public void setGaragem(String garagem) {
        this.garagem = garagem;
    }

    public String getPorao() {
        return porao;
    }

    public void setPorao(String porao) {
        this.porao = porao;
    }

    public String getTerraco() {
        return terraco;
    }

    public void setTerraco(String terraco) {
        this.terraco = terraco;
    }

    public String getQuital() {
        return quital;
    }

    public void setQuital(String quital) {
        this.quital = quital;
    }

    public String getJardim() {
        return jardim;
    }

    public void setJardim(String jardim) {
        this.jardim = jardim;
    }

    public String getPicina() {
        return picina;
    }

    public void setPicina(String picina) {
        this.picina = picina;
    }

    public String getQuadraEsporte() {
        return quadraEsporte;
    }

    public void setQuadraEsporte(String quadraEsporte) {
        this.quadraEsporte = quadraEsporte;
    }

    public String getAreaServico() {
        return areaServico;
    }

    public void setAreaServico(String areaServico) {
        this.areaServico = areaServico;
    }
     public String getNumeroImovel() {
        return numeroImovel;
    }

    public void setNumeroImovel(String numeroImovel) {
        this.numeroImovel = numeroImovel;
    }
    
    
}
