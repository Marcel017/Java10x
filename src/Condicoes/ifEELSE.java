package Condicoes;

public class ifEELSE {
    public static void main(String[] args) {

        /*
        usando IF e Else = condições
        else if
        obejetivo: Passar o ninja de nivel de acordo com o numero de missoes
         */

        //Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        //se(condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
