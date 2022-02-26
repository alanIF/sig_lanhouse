/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 * * padrao strategy

 * @author AlandeMedeiros
 */
public class Adulto implements PermissaoAcesso{

    @Override
    public void gerarPermissaoCliente() {
        System.out.println("Pode acessar qualquer tipo de site");
    }
    
}
