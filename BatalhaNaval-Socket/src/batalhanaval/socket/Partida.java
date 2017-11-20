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
public class Partida {
    
    static int numLinhas;
    static int numColunas;
    static int numNavios;
    
    public Partida(){
        
    }
    public void iniciarPartida(){
        Jogador jogador1 = new Jogador("Jogador1", 0, 5, 5, 5);
        Jogador jogador2 = new Jogador("Jogador2", 0, 5, 5, 5);
    }
    
}
