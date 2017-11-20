/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.socket;

/**
 *
 * @author Francisco
 */
public class Navio {
    private int tamanho;
    
    public Navio(int tamanho){
        this.tamanho = tamanho;
               
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
