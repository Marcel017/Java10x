package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /**
         * Lacos de repeticao: Vao repetir infinitamente ou ate atingir o numero de parametro Desejado.
         * WHILE = FOR
         */

        // While
        // while (condicao) {tudo aqui vai acontencer}

        /**
         * adicinei um pouco de condicional, não estava no roteiro da aula, mas como a materia estava fresca na minha cabeça eu aprovei oque tinha aprendido para
         * arrumar o erro de semantica e deixar o codigo em si mais intuitivo.
         */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            while (numeroDeClones > 40) {
                System.out.println("Naruto tentou fazer o clone " + numeroDeClones + ", mas está sem Chakra e Desmaiou!");
                break;
            }

            if (numeroDeClones <= 40) {
                if (numeroDeClones == 1) {
                    System.out.println("Naruto fez: " + numeroDeClones + " clone da sombra");
                } else {
                    System.out.println("Naruto fez: " + numeroDeClones + " clones da sombra");
                }
            }
        }


    }
}
