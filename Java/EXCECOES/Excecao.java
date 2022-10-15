package EXCECOES;
import java.util.Scanner;
import java.util.Locale;

public class Excecao {
    public static void main(String[] args){
        //Cria o objeto scanner que pega imputs do terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            try{

            // atribui uma string a variavel nome, digitada pelo usuario
            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            // atribui uma string a v(ariavel sobrenome, digitada pelo usuario
            System.out.println("Digite o seu Sobrenome");
            String sobrenome = scanner.next();

            // atribui um int a variavel idade, digitada pelo usuario
            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            // atribui um int a variavel altura, digitada pelo usuario
            System.out.println("Digite sua altura em centimetros: ");
            int altura = scanner.nextInt();

            // area de print das informaçoes capturadas
            System.out.println("seu nome é " + nome + " " + sobrenome);
            System.out.println("sua idade é de " + idade + " anos e altura de " + altura + " centimetros");
            
            }
            // Trata a excecao caso o usuario inclua um valor diferente de inteiros nos campos altura e idade.
            catch(java.util.InputMismatchException imputsInteiros){
                System.out.println("Os campos idade e altura devem ser preenchidos com numeros inteiros!\nTente novamente.");
            }

        scanner.close();
    }
    
}
