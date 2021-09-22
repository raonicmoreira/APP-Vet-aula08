import java.util.Scanner;

import modelo.Motorista;
import modelo.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Não podemos instanciar Pessoa por se tratar de uma classe abstract
        Pessoa p1 = new Pessoa();
        */

        Scanner ler = new Scanner(System.in);

        String palavra = "raoni";
        int[] v1 = new int[3];
  
        Passageiro[] v = new Passageiro[2];


        // utilizando vetor de Passageiro
        for(int i = 0; i < v.length; i++){
            Passageiro p1 = new Passageiro();
            System.out.println("informe nome do passageiro :");
            p1.setNome(ler.next());
            System.out.println("informe cpf do passageiro :");
            p1.setCodigoCliente(ler.nextInt());

            v[i] = p1;
             
        }

        System.out.println("-----------imprimindo vetor de passageiros-----------");
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i].getNome());
            System.out.println("----------------------------------------");
            System.out.println(v[i].getCodigoCliente());
            System.out.println("----------------------------------------");
        }


        
        // utilizando vetor de inteiro
        for(int i = 0; i < v1.length; i++){
            System.out.println("informe um numero");
            v1[i] = ler.nextInt();
             
        }

        System.out.println("-----------imprimindo vetor em ordem crescente-----------");
        for(int i = 0; i < v1.length; i++){
            System.out.println(v1[i]);
            System.out.println("----------------------------------------");
        }

        System.out.println("-----------imprimindo vetor em ordem decrescente-----------");
        for(int i = v1.length-1; i >= 0 ; i--){
            System.out.println(v1[i]);
            System.out.println("----------------------------------------");
        }

        System.out.println("-----------imprimindo vetor pelo indice-----------");
        System.out.println(v1[1]);
        System.out.println("----------------------------------------");
        System.out.println(v1[0]);
        System.out.println("----------------------------------------");
        System.out.println(palavra);
        

        
        Motorista m1 = new Motorista();
        Passageiro p1 = new Passageiro();

        System.out.println(m1.comprimentar());
        System.out.println(m1.getNome());
        System.out.println("--------------------");
        System.out.println(p1.comprimentar());
        
    }
}
