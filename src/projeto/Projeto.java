
package projeto;

import java.util.Scanner;

/**
 *
 * @author AlandeMedeiros
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        lanhouse l= new lanhouse();
        System.out.println("Bem vindo ao sistema de lan house!");
        int op=0;
        while(op!=-1){
            System.out.println("Digite: (1)-Adicionar Cliente;(2)-Listar Clientes;(3)-Remover Clientes;(4)-Listar os estados dos computadores;(5)-Alocar um Cliente ao Computador;(6)-Deslocar um Cliente do Computador;(7)-Listar Computadores;(8)-Listar usuarios ativos;(-1)-Sair");
            op=s.nextInt();
            if(op==1){
                System.out.println("Adicionar Cliente!");
                System.out.println("Digite o nome: ");
                String nome=s.next();
                System.out.println("Digite o sexo : (M)- Masculino;(F)- Feminino");
                String sexo=s.next();
                System.out.println("Digite a idade: ");
                int idade=s.nextInt();
                System.out.println("Digite o tipo de cliente: (1)- Comum;(2)- Especial");
                int tipo=s.nextInt();
                l.adicionarCliente(nome, sexo, idade,tipo);
            }
            else if(op==2){
                System.out.println("Lista de Clientes!");
                l.listarClientes();
            }
            else if(op==3){
                System.out.println("Remover Cliente!");
                System.out.println("Digite o nome do Cliente: ");
                String nome=s.next();
                l.removerCliente(nome);
            }else if(op==4){
                l.listarEstadoComputadores();
            }else if(op==5){
                System.out.println("Alocando Cliente a um computador!");
                System.out.println("Digite o nome do Cliente: ");
                String nome=s.next();
                System.out.println("Digite o id do computador: ");
                int id=s.nextInt();
                System.out.println("Digite o tempo que o cliente quer: ");
                int tempo=s.nextInt();
                System.out.println("Digite o valor: ");
                double preco=s.nextDouble();
                l.alocarClienteaComputador(nome, id, tempo, preco);
            }else if(op==6){
                System.out.println("Deslocando um Cliente a um computador!");
                System.out.println("Digite o nome do Cliente: ");
                String nome=s.next();
                System.out.println("Digite o id do computador: ");
                int id=s.nextInt();
                l.desalocarClienteaComputador(nome, id);
            }else if(op==7){
                System.out.println("Listar Computadores!");
                l.listarComputadores();
            }else if(op==8){
                l.listarClientesAtivos();
            }
            else if(op==-1){
                System.out.println("Saindo do Sistema!!");
            }
            else{
                System.out.println("Opção Inválida!!!");
            }
        }
    }
    
}
