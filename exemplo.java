class MinhaClasse {

    static class Outra {
        static int numero = 42;
    }

    String nome = "Mattheus";

    static void print(String conteudo) {
        System.out.println(conteudo);
    }

    public static void main(String[] args) {
        MinhaClasse meuObj = new MinhaClasse();
        print("O número é: " + Outra.numero);
        print("O nome é: " + meuObj.nome);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("-----");

        int x = 0;
        while (x < 10) {
            ++x;
        }
    }
}
