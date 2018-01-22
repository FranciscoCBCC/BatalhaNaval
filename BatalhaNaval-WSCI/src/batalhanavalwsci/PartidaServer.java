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

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface PartidaServer {
    @WebMethod
    public void iniciarPartida();
    
    /*@WebMethod
    public void mostrarTabuleiro();
    
    @WebMethod
    public String getNome();
    
    @WebMethod
    public void setNome(String nome);
    
    @WebMethod
    public int getPontuacao();
    
    @WebMethod
    public void setPontuacao(int pontuacao);
*/
            
}
