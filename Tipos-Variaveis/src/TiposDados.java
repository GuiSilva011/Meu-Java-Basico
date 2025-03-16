public class TiposDados {
  public static void main(String[] args){
   //ATENÇÃO AS PECULIARIDADE A TRABALHAR COM ALGUNS TIPOS DE DADOS
   //ESPECÍFICOS.Observe no exemplo abaixo:

   byte idade = 123;
   short ano = 2021;
   int cep = 21070333; //se começar com zero, talvez tenha que ser outro tipo
   long cpf = 98765432109L; //Se começar com zero ,talvez tenha que ser outro tipo
   float pi =3.14F;
   double salario = 1275.33;

   //TIPOSEVariaveis.java

   short numeroCurto = 1;
   int numeroNormal = numeroCurto;
   short numeroCurto2 = (short)numeroNormal;

   int numero = 5;

   numero = 10;

   System.out.println(numero);
   final double VALOR_DE_PI = 3.14; // não pode ser alterado
   //VALOR_DE_PI = 10.75; // erro de compilação
 

  }
      
}
