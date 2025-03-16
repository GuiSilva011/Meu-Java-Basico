package Operadores;

public class Operadores {
  //Símbolos especiais que representam operações
  public static void main(String[] args) {
    //Operadores Aritméticos
    int a = 10;
    int b = 20;
    int c = 25;
    int d = 25;
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("b / a = " + (b / a));
    System.out.println("b % a = " + (b % a));
    System.out.println("c % a = " + (c % a));
    System.out.println("a++   = " +  (a++));
    System.out.println("b--   = " +  (a--));
    // Verificar a diferença no valor de c e d
    System.out.println("c++   = " +  (c++));
    System.out.println("d--   = " +  (d--));
    System.out.println("d   = " +  (d));
    //Operadores Relacionais
    System.out.println("a == b = " + (a == b));
    System.out.println("a != b = " + (a != b));
    System.out.println("a > b = " + (a > b));
    System.out.println("a < b = " + (a < b));
    System.out.println("b >= a = " + (b >= a));
    System.out.println("b <= a = " + (b <= a));
    //Operadores Lógicos
    boolean x = true;
    boolean y = false;
    System.out.println("x && y = " + (x&&y));
    System.out.println("x || y = " + (x||y));
    System.out.println("!(x && y) = " + !(x && y));
    //Classe Operadores.java
    String nome = "Guilherme";
    int idade = 20;
    double peso = 65.0;
    char sexo = 'M';
    boolean doadorOrgao = false;
    
    //Atenção ao operador de adição (+), quando utilizado em textos, pois ele concatenara os valores
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);
    String concatenacao = "?";
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);
    concatenacao= 1+"1"+1+1;
    System.out.println(concatenacao);
    concatenacao= 1+"1"+1+"1";
    System.out.println(concatenacao);
    concatenacao="1"+(1+1+1);
    System.out.println(concatenacao);

  }
}
