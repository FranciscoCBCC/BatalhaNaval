/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.socket;

import java.util.Scanner;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Francisco
 */
public class Partida {
    
    private static int numNavios = 3;
    private static int pontuacao = 0;
    private boolean vez = false;
    private boolean terminou = true;
    private int entradaJogador2;
    
    

    
    
    public Partida(){
        
    }
 
    
    public void iniciarPartida() throws IOException{
        
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");
        
        Socket cliente = servidor.accept();
        System.out.println("Nova conexão com o cliente "
                + cliente.getInetAddress().getHostAddress()
        );

        Scanner s = new Scanner(cliente.getInputStream());
        while (s.hasNextLine()) {
            entradaJogador2 = Integer.parseInt(s.nextLine());
        }
        
        Jogador jogador1 = new Jogador("Jogador1", pontuacao, numNavios);
        Jogador jogador2 = new Jogador("Jogador2 (Cliente)", pontuacao, numNavios);
        Scanner entrada = new Scanner(System.in);
        int linha,coluna;
        do{
            System.out.println("Vez do jodador 1: ");
            System.out.println("Digite o numero da linha: ");
            linha = entrada.nextInt();
            System.out.println("Digite o numero da coluna: ");
            coluna = entrada.nextInt();
            jogador1.atirar(jogador2, linha, coluna);
            
            
            System.out.println("Vez do jodador 2 (Cliente): ");
            System.out.println("Digite o numero da linha: ");
            linha = entradaJogador2;
            System.out.println("Digite o numero da coluna: ");
            coluna = entrada.nextInt();
            jogador2.atirar(jogador1, linha, coluna);
            
        }while(terminou);
    }  
    
    
}
