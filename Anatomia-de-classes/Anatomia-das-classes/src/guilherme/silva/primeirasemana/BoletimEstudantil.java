package guilherme.silva.primeirasemana;


public class BoletimEstudantil {
  public static void main(String[] args){
      int mediaFinal = 7;
      if(mediaFinal<6)
         System.out.println("REPROVADO");
      else if (mediaFinal == 6)
         System.out.println("PROVA MINVERVA");
      else
         System.out.println("APROVADO");
    }
}
