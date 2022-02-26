/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 * padrao strategy
 * @author AlandeMedeiros
 */
public class GerenciadorPermissao {
    private PermissaoAcesso p;
    public GerenciadorPermissao(Cliente c){
        if(c.idade>18){
            p= new Adulto();
        }
        else{
            p= new MenorIdade();
        }
        p.gerarPermissaoCliente();

    }
}
