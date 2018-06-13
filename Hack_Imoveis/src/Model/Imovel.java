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
    private int numeroImovel;
    private int sala;
    private int quartos;
    private int cozinha;
    private int banheiro;
    private int garagem;
    private int porao;
    private int terraco;
    private int quital;
    private int jardim;
    private int picina;
    private int quadraEsporte;
    private int areaServico;
    private int andar;
    private int varanda;
    private boolean escada;
    private boolean elevador;

    public Imovel(Endereco endereco, float valorImovel, String nome, int sala, int quartos, int cozinha, int banheiro, int garagem, int porao, int terraco, int quital, int jardim, int picina, int quadraEsporte, int areaServico, int andar, int varanda, boolean escada, boolean elevador) {
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
        str = str + "\n:Tamanho do Quintal -->"+quital;
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
    
    
    // metodos get e set 
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

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getCozinha() {
        return cozinha;
    }

    public void setCozinha(int cozinha) {
        this.cozinha = cozinha;
    }

    public int getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
    }

    public int getGaragem() {
        return garagem;
    }

    public void setGaragem(int garagem) {
        this.garagem = garagem;
    }

    public int getPorao() {
        return porao;
    }

    public void setPorao(int porao) {
        this.porao = porao;
    }

    public int getTerraco() {
        return terraco;
    }

    public void setTerraco(int terraco) {
        this.terraco = terraco;
    }

    public int getQuital() {
        return quital;
    }

    public void setQuital(int quital) {
        this.quital = quital;
    }

    public int getJardim() {
        return jardim;
    }

    public void setJardim(int jardim) {
        this.jardim = jardim;
    }

    public int getPicina() {
        return picina;
    }

    public void setPicina(int picina) {
        this.picina = picina;
    }

    public int getQuadraEsporte() {
        return quadraEsporte;
    }

    public void setQuadraEsporte(int quadraEsporte) {
        this.quadraEsporte = quadraEsporte;
    }

    public int getAreaServico() {
        return areaServico;
    }

    public void setAreaServico(int areaServico) {
        this.areaServico = areaServico;
    }
     public int getNumeroImovel() {
        return numeroImovel;
    }

    public void setNumeroImovel(int numeroImovel) {
        this.numeroImovel = numeroImovel;
    }
    
}
