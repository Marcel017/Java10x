package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
        Dados nao primitivos: String, Array, Class, enum
        objetivo: criar um ninja, e atribuir metodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase(); //ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CapsLock: " + nomeToUpperCase);
        System.out.println("Esse é um texto normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase();
        System.out.println(aldeiaEmCaixaBaixa);

    }
}
