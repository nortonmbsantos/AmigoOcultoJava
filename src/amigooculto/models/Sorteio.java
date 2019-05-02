/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amigooculto.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author norto
 */
public class Sorteio {
    private ArrayList<Amigo> amigos;
    
    public Sorteio(ArrayList<Amigo> amigos){
        this.amigos = amigos;
    }
    
    public ArrayList<Amigo> sorteia(){
        Collections.shuffle(amigos);
        return amigos;
    }
    
    public void imprime(){
        for(int i = 0; i < amigos.size(); i++){
            if(i != amigos.size()-1){
                System.out.println(amigos.get(i).getNome() + "->" + amigos.get(i+1).getNome());
            }else{
                System.out.println(amigos.get(i).getNome() + "->" + amigos.get(0).getNome());
            }
        }
    }
}
