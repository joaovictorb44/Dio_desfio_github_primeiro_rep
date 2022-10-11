package SOBREGARGA_METODOS;

public class Main {
  
  public static void main(String[] args) {
     
    //chama o metodo Calcula area, que retorna o valor da area do quadrado e printa no terminal
    double quadrado = CalculaArea.calculaArea(5);
    System.out.println("A area do quadrado equivale a " + quadrado);

    //chama o metodo Calcula area, que retorna o valor da area do retangulo e printa no terminal
    double retangulo = CalculaArea.calculaArea(5, 2);
    System.out.println("A area do retangulo equivale a " + retangulo);

    //chama o metodo Calcula area, que retorna o valor da area do poligono e printa no terminal
    double poligono = CalculaArea.calculaArea(4, 6, 8);
    System.out.println("A area do poligono equivale a " + poligono);

  }
}