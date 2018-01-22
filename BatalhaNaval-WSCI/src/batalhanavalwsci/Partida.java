package batalhanavalwsci;

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

    public Partida() {

    }

    public void iniciarPartida(Jogador jogador1, Jogador jogador2){

        //Jogador jogador1 = new Jogador("Jogador1", pontuacao, numNavios);
        //Jogador jogador2 = new Jogador("Jogador2", pontuacao, numNavios);
        Scanner entrada = new Scanner(System.in);
        int linha, coluna;
        do {
            System.out.println("Vez do jodador 1: ");
            System.out.println("Digite o numero da linha: ");
            linha = entrada.nextInt();
            System.out.println("Digite o numero da coluna: ");
            coluna = entrada.nextInt();
            jogador1.atirar(jogador2, linha, coluna);

            System.out.println("Vez do jodador 2: ");
            System.out.println("Digite o numero da linha: ");
            linha = entrada.nextInt();
            System.out.println("Digite o numero da coluna: ");
            coluna = entrada.nextInt();
            jogador2.atirar(jogador1, linha, coluna);

        } while (terminou);
    }
    
}
