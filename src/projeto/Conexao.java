/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *implementação padrao sigleton
 * @author AlandeMedeiros
 */
public class Conexao {
    private static Conexao c= null;
    private Conexao(){}
    
    public static Conexao getConexao(){
        if(c==null){
            c= new Conexao();
        }
        return c;
    }
    public void iniciarConexaoBD(){
        System.out.println("Iniciando conexao BD da lanhouse");
    
    }
}
