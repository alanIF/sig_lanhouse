/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;

/**
 *conclusao padrao flyweigth
 * @author AlandeMedeiros
 */
public class FlyweigthFactory {
    protected ArrayList<ComputadorFlyweigth> l;
    public FlyweigthFactory(){
        l= new ArrayList<ComputadorFlyweigth>();
        l.add(new ComputadorFlyweigthConcrete(0,"SamSung"));
        l.add(new ComputadorFlyweigthConcrete(1, "HP"));
        l.add(new ComputadorFlyweigthConcrete(2, "Lenovo"));
        l.add(new ComputadorFlyweigthConcrete(3, "Dell"));
        l.add(new ComputadorFlyweigthConcrete(4, "Acer"));
    }
    public ComputadorFlyweigth getComputador(int id){
        return l.get(id);
    }
}
