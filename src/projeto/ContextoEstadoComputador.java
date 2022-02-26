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
public class ContextoEstadoComputador {
    public final EstadoComputador o= new EstadoOcupado();
    public final EstadoComputador l= new EstadoLivre();
    private EstadoComputador c;
    /*
        Ao computador iniciar no flyweight sera iniciado no estado livre
    */
    public ContextoEstadoComputador(){
        this.c=l;
    
    }
    public void setEstado(EstadoComputador e){
        this.c=e;
    }
    public String getEstado(){
        return c.estado();
    }
    
}
