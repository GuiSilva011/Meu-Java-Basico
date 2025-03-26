package guilherme.silva.segundasemana;
//Estrutura

public class MinhaClasse {
    public static void main(String[] args){
        String primeiroNome = "Guilherme";
        String segundoNome = "Silva";

        String nomeCopleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCopleto);
    }

    public static String nomeCompleto(String primeiroNome,String segundoNome){
      return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
