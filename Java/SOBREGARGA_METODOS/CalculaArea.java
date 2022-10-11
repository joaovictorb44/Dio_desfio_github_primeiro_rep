package SOBREGARGA_METODOS;

public class CalculaArea {

        //metodo para calcular a area do quadrado
    public static double calculaArea(double x){
        System.out.println(Math.pow(x, 2));
        return Math.pow(x, 2);
      }
       //metodo para calcular a area do quadrado
      public static double calculaArea(double a, double b){
        return (a *b);
      }
        //metodo para calcular a area do poligono
      public static double calculaArea(double h, double baseMenor, double baseMaior){
        return((baseMaior + baseMenor)/2)*h;
      }
    }
    

