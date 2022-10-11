package SobrecargaMetodos;

public class CalculaArea {
    public static void calculaArea(double x){
        System.out.println(Math.pow(x, 2));
      }
    
      public static void calculaArea(double a, double b){
        System.out.println(a *b);
      }
    
      public static void calculaArea(double h, double baseMenor, double baseMaior){
        System.out.println(((baseMaior + baseMenor)/2)*h);
      }
    }
    

