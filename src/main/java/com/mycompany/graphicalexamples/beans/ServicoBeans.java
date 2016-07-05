/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphicalexamples.beans;

import java.util.HashMap;

/**
 *
 * @author Jhonatan
 */
public class ServicoBeans {
    
    private int quantidadeServico;
    private String nomeServico;
    private String identeficacaoServico;
    private HashMap<String,Integer> identficacao;
    
    public void setQuantidade(int quantidade){
        this.quantidadeServico = quantidade;
    }
    
    public Integer getQuantidade(){
        return this.quantidadeServico;
    }
    
    public void setNomeServico(String nomeServico){
        this.nomeServico = nomeServico;
    }
    
    public String getNomeServico(){
    
        return this.nomeServico;
          
    }
    
    public void setIndetificacaoServico(String identicacao){
        this.identeficacaoServico = identicacao;
    }
    
    public String getIdentificacaoServico(){
        return this.identeficacaoServico;
    }
    
    public void setIdentificacao(HashMap<String,Integer> mapa){
        this.identficacao = mapa;
    }
    
    public HashMap<String,Integer> getIdentificacao(){
        return this.identficacao;
    }
    
    
    
}
