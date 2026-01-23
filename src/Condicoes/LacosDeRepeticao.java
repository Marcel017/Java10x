package Condicoes;

public class LacosDeRepeticao {
    // psvm -> atalho para criar essa linha abaixo
    public static void main(String[] args) {

        int chakraMaximo = 40;
        int clonesFeitos = 0;

        // Vamos usar o FOR, que é mais comum quando sabemos o limite (40)
        // for (inicio; condição; incremento)
        for (int i = 1; i <= chakraMaximo + 1; i++) {
            clonesFeitos = i;

            // Se passou do limite (41)
            if (clonesFeitos > chakraMaximo) {
                System.out.println("Naruto tentou fazer o clone " + clonesFeitos + ", mas está sem Chakra e Desmaiou!");
                break; // Sai do laço FOR imediatamente
            }

            String tipoClone = (clonesFeitos == 1) ? "clone" : "clones";

            System.out.println("Naruto fez: " + clonesFeitos + " " + tipoClone + " da sombra");
        }
    }
}