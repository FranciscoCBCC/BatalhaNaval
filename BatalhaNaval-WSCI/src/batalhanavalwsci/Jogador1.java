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

        //Scanner entrada = new Scanner(System.in);
        Jogador jogador = new Jogador("Jogador1", 0, 3);
        
        partida.conectarPartida(jogador);
        partida.jogar(jogador, 1, 1);

    }
}
