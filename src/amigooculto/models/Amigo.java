/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amigooculto.models;

/**
 *
 * @author norto
 */
public class Amigo {
    private String nome;
    
    public Amigo(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
}
