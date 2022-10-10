public class Tipos_De_Dados{
    public static void main(String[] args){
        //print
        System.out.println("hello world");

        /* tipos de variaveis 
        nt myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
         */

        //atribuindo variaveis / boas praticas = notação camelo
        int num = 10;
        int i = 3;
        int teste;
        teste = num++; // teste recebe num e num receber num + 1
        teste += num; // teste recebe = teste + num


        //tuplas (boa pratica - todas as letras maiusculas)
        final int TUPLA_BRABA = 200;

        /*Casting (conversao de variavel)
        Upcast(implícito) ex: byte para int
        long x; int i = 100; x = i

        Downcast(explicito) havera perda de informaçoes...
        ex: long para int
        int x; float f =10.5f; i = (int) f;
        */


        //prints 
        System.out.println(num);
        System.out.println(TUPLA_BRABA);
        System.out.println(teste);
        System.out.println(10 - 5 * 2 + --i);
    }
}