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
public class ClienteComum extends Cliente{
    public ClienteComum(String nome,String sexo,int idade){
        this.nome=nome;
        this.sexo=sexo;
        this.idade=idade;
        System.out.println("Nome: "+nome+" Tipo de Cliente : Comum. Sem descontos");
        this.g= new GerenciadorPermissao(this);

    }
}
