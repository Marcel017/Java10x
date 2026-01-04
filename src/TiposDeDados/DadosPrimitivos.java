package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        dados primitivos = int, double, float, char, boolean, short
        objetivo = criar um ninja
         */

        int idade = 17; // valor max de 32b
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; // Valor maximo de 64b

        System.out.println(idade); // comando de print
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldoBancario = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);

    }
}
