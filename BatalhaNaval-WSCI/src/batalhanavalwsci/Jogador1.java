/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanavalwsci;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Jogador1 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1:9876/batalhanavalwsci?wsdl");
        QName qname = new QName("http://batalhanavalwsci/", "PartidaService");
        Service ws = Service.create(url, qname);
        PartidaServer partida = ws.getPort(PartidaServer.class);

        Scanner entrada = new Scanner(System.in);
        Jogador jogador = new Jogador("Jogador1", 0, 3);
        /*
        do {
            System.out.println("1 - Iniciar partida");
            System.out.println("2 - Sair do Jogo");
            int opcao;
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    partida.conectarPartida(jogador);
                    do {
                        if (jogador.conectado && jogador.minhaVez == true) {
                            System.out.println("Sua vez");
                            System.out.println("Digite o numero da linha: ");
                            int linha = entrada.nextInt();
                            System.out.println("Digite o numero da coluna: ");
                            int coluna = entrada.nextInt();
                            jogador.atirar(jogador.oponente, linha, coluna);
                            jogador.mostrarTabuleiro();
                        }
                        //} while ((jogador.getNumNavios() == 0) || (jogador.oponente.getNumNavios() == 0));
                    } while (jogador.getNumNavios() == 0);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao inválida");
                    break;
            }

        } while (true);
         */
        partida.conectarPartida(jogador);

        if (jogador.conectado && jogador.minhaVez == true) {
            System.out.println("Sua vez");
            System.out.println("Digite o numero da linha: ");
            int linha = entrada.nextInt();
            System.out.println("Digite o numero da coluna: ");
            int coluna = entrada.nextInt();
            jogador.atirar(jogador.oponente, linha, coluna);
            jogador.mostrarTabuleiro();
            jogador.minhaVez = false;

        } else {
            System.out.println("Aguarde a sua vez!!!");
        }
    }
}
