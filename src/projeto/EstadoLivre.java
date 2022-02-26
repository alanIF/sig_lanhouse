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
public class EstadoLivre implements EstadoComputador{
    @Override
    public String estado() {
        System.out.println("Computador livre para uso");
        return "l";
    }
    
}
