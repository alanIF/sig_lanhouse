/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;

/**
 *
 * @author AlandeMedeiros
 */
public class lanhouse {
    ArrayList<Cliente> l= new ArrayList<Cliente>();
    ArrayList<Locacao> ativos= new ArrayList<Locacao>();
    Conexao c;
    FlyweigthFactory f= new FlyweigthFactory();
    public lanhouse(){
        c= Conexao.getConexao();
    
    }
    public void adicionarCliente(String nome,String sexo, int idade,int tipo){
        CriadorCliente c= new FactoryCliente();
        Cliente n= c.getCliente(nome, sexo, idade,tipo);
        l.add(n);
        this.c.iniciarConexaoBD();
        System.out.println("Cliente cadastrado com sucesso!");
    } 
    public void listarClientes(){
        this.c.iniciarConexaoBD();

        for(Cliente c:l){
            System.out.println("Nome: "+c.nome+"; Sexo: "+c.sexo+"; Idade: "+c.idade);
        
        }
    
    }
    public void removerCliente(String nome){
        for(Cliente c:l){
            if(c.nome.equals(nome)){
                l.remove(c);
                this.c.iniciarConexaoBD();

                System.out.println("Cliente removido com sucesso.");
                return;
            }
        
        }
        System.out.println("Cliente não existe");
    }
    public void listarEstadoComputadores(){
        for(ComputadorFlyweigth c:f.l){
            System.out.print("Id:"+c.id+" ");
            c.c.getEstado();
        
        }
    }
    public Cliente buscarCliente(String nome){
        for(Cliente c:l){
            if(c.nome.equals(nome)){
                return c;
            }
        }
        System.out.println("Cliente nao encontrado!");
        return null;
    }
    public void alocarClienteaComputador(String nomeCliente,int idComputador,int tempo,double preco){
       if((buscarCliente(nomeCliente)!=null)&&(idComputador<5)){
           Cliente cliente= buscarCliente(nomeCliente);
           ComputadorFlyweigth computador = f.getComputador(idComputador);
           if(computador.c.getEstado().equals("l")){
               Locacao locacao= new Locacao();
               locacao.c=cliente;
               locacao.ca=computador;
               locacao.preco=preco;
               locacao.tempo=tempo;
               //setando estdado do computador para ocupado
               f.getComputador(idComputador).c.setEstado(f.getComputador(idComputador).c.o);
               ativos.add(locacao);
               System.out.println("Locação feita com sucesso");
               System.out.println("Cliente: "+cliente.nome+" , tantos minutos: "+locacao.tempo);
               computador.ligar();
           }else{
               System.out.println("Computador indisponivel!!");
               
           }
       }else{
           System.out.println("Alocação nao realizada!");
       }
    }
    public void desalocarClienteaComputador(String nomeCliente,int idComputador){
        for(Locacao a:ativos){
            if((a.c.nome.equals(nomeCliente))&&(a.ca.id==idComputador)){
                f.getComputador(idComputador).c.setEstado(f.getComputador(idComputador).c.l);
                ativos.remove(a);
                System.out.println("Locação removida com sucesso");
                 f.getComputador(idComputador).encerrar();
                return ;
            }
        }
        System.out.println("Não existe tal locacao!");
    }
    
    public void listarClientesAtivos(){
        if(!ativos.isEmpty()){
            for(Locacao a:ativos){
                System.out.println("Cliente: "+a.c.nome+" ;Computador: "+a.ca.id+";  Tempo: "+a.tempo);
            }
        }else{
            System.out.println("Não existe ninguem utilizando os computadores");
        
        }
    }
    public void listarComputadores(){
        for(ComputadorFlyweigth c:f.l){
               System.out.println("Id:"+c.id+" Marca "+c.marca);
           }
    
    }
    
}
