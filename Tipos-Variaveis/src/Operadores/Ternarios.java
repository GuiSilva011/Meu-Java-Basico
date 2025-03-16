package Operadores;

public class Ternarios {
  public static void main(String[]args){
    int a,b;
    String resultado ="";
    a = 6;
    b = 6;
    resultado = a==b ? "verdadeiro" : "falso";
    System.out.println(resultado);
    
    //Mesma coisa que dizer que:
    /*
    if(a==b){
      resultado = "verdadeiro";
    else{
        resultado = "falso";
      }
    }
     */
   
  }
}
