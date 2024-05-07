import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = entrada.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }catch (NumerosIguaisException exception1){
            System.out.println("os parametros não podem ser iguais");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException, NumerosIguaisException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        if (parametroUm == parametroDois){
            throw new NumerosIguaisException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
   }
}
