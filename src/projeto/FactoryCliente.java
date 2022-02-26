/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author AlandeMedeiros
 */
public class FactoryCliente extends CriadorCliente{

    @Override
    public Cliente getCliente(String nome, String sexo,int idade,int tipo) {
        if(tipo==1){
            return new ClienteComum(nome, sexo,idade);
       
        }else{
            return new ClienteEspecial(nome, sexo,idade);
        
        }
    }
    
}
