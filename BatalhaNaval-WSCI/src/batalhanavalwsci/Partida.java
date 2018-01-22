package batalhanavalwsci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Francisco
 */

import java.util.Date;
import javax.jws.WebService;

@WebService(endpointInterface = "batalhanavalwsci.PartidaServer")
public class Partida implements PartidaServer{

    private boolean vez = false;
    private boolean terminou = true;
    private int entradaJogador2;
    private ArrayList<Jogador> jogadores;
    private static int numJogadores = 0;
    private static int numMaxJogadores = 2;
    private char[][] tabuleiroOponente;

    public Partida() {
        jogadores = new ArrayList();
    }

    public void conectarPartida(Jogador jogador){
        if(numJogadores==0){
            jogadores.add(jogador);
            jogador.conectado = true;
            jogador.oponente = null;
            numJogadores++;
        }
        else if (numJogadores == 1){
            jogadores.add(jogador);
            jogador.conectado = true;
            numJogadores++;
            jogador.oponente = (Jogador)jogadores.get(0);
            jogadores.get(0).oponente = jogador;
        }
        else{
            System.out.println("Numero Máximo de jogadores atingido.");
        }
    }    
    
    public void jogar(Jogador jogador, int x, int y) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        tabuleiroOponente = jogador.oponente.getTabuleiro();
        if (tabuleiroOponente[x][y] == 1) {
            System.out.println("Você Acertou um navio!");
            tabuleiroOponente[x][y] = 'N';

            jogador.oponente.numNavios--;
            System.out.println("Navios do Oponente: " + jogador.oponente.numNavios);

            jogador.pontuacao++;
            System.out.println("Sua Pontuação: " + jogador.pontuacao);
        } else if (tabuleiroOponente[x][y] == 0) {
            System.out.println("Tiro na água!");
            tabuleiroOponente[x][y] = '~';
        } else {
            System.out.println("Esta posição já foi marcada ");
        }
        jogador.mostrarTabuleiro();
    }
}
