package metodos;

public class Mensagem {

    public static void obterMensagem(int hora){
        if(hora <= 12 && hora >= 6){
            System.out.println("bom dia");
        }

        else if((hora < 6 && hora >= 0) || (hora >= 18 && hora <= 23)){
            System.out.println("boa noite");
        }
        
        else if(hora > 12 && hora < 18){
            System.out.println("boa tarde");
        }

        else{
            System.out.println("hora invalida!");
        }
    }
    
}
