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

public class Jogador2 {

    public static void main(String[] args) throws Exception{
        URL url = new URL("http://127.0.0.1:9876/batalhanavalwsci?wsdl");
        QName qname = new QName("http://batalhanavalwsci/", "PartidaService");
        Service ws = Service.create(url, qname);
        PartidaServer partida = ws.getPort(PartidaServer.class);  
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("1 - Iniciar partida");
            System.out.println("2 - Sair do Jogo");
            int opcao;
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    Jogador jogador = new Jogador();
                    partida.iniciarPartida(jogador, jogador);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Opcao inválida");
            }

        } while (true);
    }
}
