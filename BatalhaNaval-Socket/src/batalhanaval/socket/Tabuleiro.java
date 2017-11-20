package batalhanaval.socket;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Francisco
 */

public class Tabuleiro {
    private int numLinhas;
    private int numColunas;
    private int numNavios;
    private Navio matriz[][];

    public Tabuleiro(int numLinhas, int numColunas, int numNavios) {
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        this.numNavios = numNavios;
        inserirNavios();
    }
    
    
    
    private void inserirNavios(){
        Random aleatorio = new Random(); 
        Random aleatorio1 = new Random();
       
        for(int a = 0; a < numNavios; a++){ //Para cada navio
            Navio navio = new Navio(1); //tamanho
            int x  = aleatorio.nextInt(numLinhas);
            int y  = aleatorio1.nextInt(numColunas);
            if(matriz[x][y]==null){ //verifica se a posição está vazia, se sim, insere um novo navio
                matriz[x][y] = navio;
            }
        }
        
    }
    
    public int getNumLinhas() {
        return numLinhas;
    }

    public void setNumLinhas(int numLinhas) {
        this.numLinhas = numLinhas;
    }

    public int getNumColunas() {
        return numColunas;
    }

    public void setNumColunas(int numColunas) {
        this.numColunas = numColunas;
    }
    
     public int getNumNavios() {
        return numNavios;
    }

    public void setNumNavios(int numNavios) {
        this.numNavios = numNavios;
    }
    
}
