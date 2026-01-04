package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        Ternaris: Maneiras de reduzir o codigo
        variavel = (codicao) ? valorSeVerdadeiro : valorSeFalso;
         */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);

    }
}
