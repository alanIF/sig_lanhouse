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
public class ComputadorFlyweigthConcrete extends ComputadorFlyweigth{
    public ComputadorFlyweigthConcrete(int id,String marca){
        this.id=id;
        this.marca=marca;
        this.f=new Fonte();
        this.m=new Monitor();
        this.g=new gabinete();
        this.c= new ContextoEstadoComputador();
    }
    @Override
    public void ligar() {
        this.f.ligarFonte();
        this.g.ligarGabinete();
        this.m.ligarMonitor();
    }

    @Override
    public void encerrar() {
        this.g.desligarGabinete();
        this.m.desligarMonitor();
        this.f.desligarFonte();
    }
    
}
