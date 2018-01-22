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

    private static int numNavios = 3;
    private static int pontuacao = 0;
    private boolean vez = false;
    private boolean terminou = true;
    private int entradaJogador2;
    private ArrayList<Jogador> jogadores;
    private static int numJogadores = 0;
    private static int numMaxJogadores = 2;

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
        jogador.minhaVez=true;
    }    
    
}
