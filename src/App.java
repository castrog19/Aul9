import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do ingresso: ");
        float valor = leitor.nextFloat();
          Ingresso Ing = new Ingresso(valor);
          System.out.println(Ing.toString());


          System.out.println("Informe o valor adicional: ");
          float valorAdicional = leitor.nextFloat();
          IngressoVIP IngVip = new IngressoVIP(valorAdicional, valor);
          System.out.println(IngVip.toString());



leitor.close();    }
}
