/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.wsci;

import java.util.Random;

/**
 *
 * @author Francisco
 */
public class Tabuleiro {

    private int numLinhas = 8;
    private int numColunas = 8;
    private char[][] tabuleiro;
    private int numNavios;

    public Tabuleiro(int numNavios) {
        tabuleiro = new char[numLinhas][numColunas];
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                tabuleiro[i][j] = 0;
            }
        }
        this.numNavios = numNavios;
        inserirNavios();
    }

    private void inserirNavios() {
        Random aleatorio = new Random();
        Random aleatorio1 = new Random();

        for (int a = 0; a < numNavios; a++) { //Para cada navio
            //Navio navio = null; //coordenada
            int x = aleatorio.nextInt(numLinhas);
            int y = aleatorio1.nextInt(numColunas);
            if (tabuleiro[x][y] == 0) { //verifica se a posição está vazia, se sim, insere um novo navio
                tabuleiro[x][y] = 1;
                System.out.println("Posição X:" + x + " Y:" + y);
            }
        }

    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getNumNavios() {
        return numNavios;
    }

    public void setNumNavios(int numNavios) {
        this.numNavios = numNavios;
    }

}
