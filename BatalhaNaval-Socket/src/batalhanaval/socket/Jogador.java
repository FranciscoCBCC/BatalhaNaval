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
    private int numNavios;
    private Tabuleiro tabuleiro;
    private char[][] tabuleiroOponente;

    public Jogador(String nome, int pontuacao, int numNavios) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numNavios = numNavios;
        tabuleiro = new Tabuleiro(numNavios);
    }
    
    
    
    public void atirar(Jogador jogadorOponente, int x, int y){
        tabuleiroOponente = jogadorOponente.tabuleiro.getTabuleiro();
        if (tabuleiroOponente[x][y]==1){
           System.out.println("Você Acertou um navio!");
           tabuleiroOponente[x][y]='N';
           
           //System.out.println("Pontua antes "+ this.pontuacao);
           //System.out.println("Navio antes "+ jogadorOponente.numNavios);
           jogadorOponente.numNavios--;
           System.out.println("Navios do Oponente: "+ jogadorOponente.numNavios);
           
           this.pontuacao++;
           System.out.println("Sua Pontuação: "+ this.pontuacao);
        }
        
        else if (tabuleiroOponente[x][y]==0){
            System.out.println("Tiro na água!");
            tabuleiroOponente[x][y] = '~';
        }
        
        else{
            System.out.println("Esta posição já foi marcada ");
        }
        mostrarTabuleiro();
    }
    
    public void mostrarTabuleiro(){
        System.out.print("     0    1    2    3    4    5    6    7    ");
        System.out.println("    ");
        for(int i=0; i<8; i++){
            System.out.print(i);
            for(int j=0; j<8; j++){
                System.out.print("    "+tabuleiroOponente[i][j]);
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

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
