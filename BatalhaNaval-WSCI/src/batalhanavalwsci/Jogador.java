/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanavalwsci;

/**
 *
 * @author Francisco
 */


public class Jogador{

    private String nome;
    public int pontuacao;
    public int numNavios;
    

    private char[][] tabuleiro;
    public boolean conectado = false;
    public Jogador oponente;
    public boolean minhaVez;


    public Jogador(){
        
    }
    
    public Jogador(String nome, int pontuacao, int numNavios) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numNavios = numNavios;
        
    }

    public void mostrarTabuleiro() {
        System.out.print("     0    1    2    3    4    5    6    7    ");
        System.out.println("    ");
        for (int i = 0; i < 8; i++) {
            System.out.print(i);
            for (int j = 0; j < 8; j++) {
                System.out.print("    " + tabuleiro[i][j]);
            }
            System.out.println(" ");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
