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
public class EstadoOcupado implements  EstadoComputador{
    String estado="o";

    @Override
    public String estado() {
        System.out.println("Computador ocupado");
        return "o";
    }
    
}
