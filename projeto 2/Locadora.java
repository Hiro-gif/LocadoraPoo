
import java.util.Scanner;

public class Locadora {


    private String nome_filme;
    private String cliente;


    
    //Construtor que associa cliente com filme escolhido
    public Cliente(String nome, String nome_filme){
        this.nome = nome;
        this.nome_filme = new Filme(numero);
        this.conta.setCliente(this);
    }

    public String getNome() {
        return this.nome_filme;
    }
    
    public Filme getFilme() {
    	return this.filme;
    }

    public void operaLocacao (){
    	

        double valor;
        System.out.print ("Digite um valor do filme: R$");
        valor = scan.nextDouble();

        if (valor <= 0) {
            System.out.print("Digite um valor positivo maior que zero!");
        } else {
            conta.depositaValor(valor);
        }
    }

    public void confereCliente (){

        System.out.print  ("Digite o nome de um cliente: ");
        cliente = scan.nextDouble();
        
        if (cliente != None)  {
            System.out.print("N�o foi poss�vel encontrar o cliente!");
        } else {
            System.out.print("o Cliente"+ cliente.nome "foi encontrado");
        }
    }
}