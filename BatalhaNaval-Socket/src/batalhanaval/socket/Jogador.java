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
public class Jogador {
    
    private String nome;
    private int pontuacao;
    private Tabuleiro tabuleiro;

    public Jogador(String nome, int pontuacao,int numLinhas, int numColunas, int numNavios) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        tabuleiro = new Tabuleiro(numLinhas, numColunas, numNavios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
