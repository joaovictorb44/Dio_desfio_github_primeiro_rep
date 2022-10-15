package REPETICAO;
import java.util.Scanner;

public class Main {
    public static void breakLine(){
        for(int i = 1; i <= 3; i++){
            switch(i){
                case 1:
                case 3:
                System.out.println("\n");
                continue;
            }
            System.out.println("-------------------------------------------------------------");
        }
    }
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        // Estrutura de repetição for
        for(int i = 1; i <= 10; i++){
            System.out.println(i);;
        }
        
        breakLine();

        // Estrutura de repetição while
        int x = 1;
        while(x++ < 10){
            System.out.println(x);
        
        }

        breakLine();

        // FOR EM ARRAY
        String jogadores [] = {"João" , "Marcos", "Pedro", "Isabela", "Leticia"};

        for(int cont = 0; cont < jogadores.length; cont++){
            System.out.println("O jogador no indice " + cont + " = " + jogadores[cont] + "\n");
        }

        breakLine();

        // FOR EM ARRAY (diferente
        // a cada execução, a variavel time ira receber um novo valor de acordo com o array jogadores
        for(String nome : jogadores){
            System.out.println("nome do jogador: " + nome);
        }

        breakLine();

        //Laço Do while
        
        int verificador;

       System.out.println("digite '1' para continuar: ");
       verificador = leitor.nextInt();

        do{ 
            
            if(verificador != 1){
            System.out.println("Você digitou uma opsão invalida!\nDigite novamente: ");
            verificador = leitor.nextInt();
            }

        }while(verificador != 1); 

        leitor.close();
        
    }
    
}
