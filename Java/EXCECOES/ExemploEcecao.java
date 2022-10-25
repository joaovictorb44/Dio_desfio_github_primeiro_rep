package EXCECOES;

public class ExemploEcecao extends Exception {

    public static String validaCep(String cep) throws CepInvalidoException{

        if(cep.length() != 8)
            throw new CepInvalidoException();

        else{
            
            for(int i = 0; i <= 7; i++){
                if(i == 7){
                    System.out.println("-" + cep.charAt(i));
                    break;
                }
                
                System.out.print(cep.charAt(i));
            }
        }
        
        return("Cep Verificado!");
    }

    public static void main(String[] args){
        String cep = ("12345678");
        String formatado;

        try{
        formatado = validaCep(cep);
        System.out.println(formatado);
        }

        catch(CepInvalidoException x){
            System.out.println(x);
        }

    }
    
}
