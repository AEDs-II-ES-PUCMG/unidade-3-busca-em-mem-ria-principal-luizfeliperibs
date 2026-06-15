import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public static void main(String [] args) {

    ArrayList listaDezMil = new ArrayList<>();

    ArrayList listaMil = new ArrayList<>();

    ABB abb = new ABB<Integer, Integer>();

    AVL avl = new AVL<Integer, Integer>();

    Random random = new Random(42);

    int valor;

    for (int i = 0; i < 10000; i++) {
        valor = random.nextInt();
        listaDezMil.add(valor);
        abb.inserir(valor, valor);
        avl.inserir(valor, valor);
    }

    int comparacoesABB = 0;
    double tempoABB = 0;
    int comparacoesAVL = 0;
    double tempoAVL = 0;

    for (int i = 0; i < 1000; i++) {
        valor = random.nextInt();
        listaMil.add(valor);

        abb.pesquisar(valor);
        comparacoesABB += abb.getComparacoes();
        tempoABB += abb.getTempo();

        avl.pesquisar(valor);
        comparacoesAVL += avl.getComparacoes();
        tempoAVL += avl.getTempo();

    }

    System.out.println("Comparacoes ABB = " + comparacoesABB);
    System.out.println("Tempo ABB = " + tempoABB);
    System.out.println("Comparacoes AVL = " + comparacoesAVL);
    System.out.println("Tempo AVL = " + tempoAVL);

    Collections.sort(listaDezMil);

    ABB abbCrescente = new ABB<Integer, Integer>();

    AVL avlCrescente = new AVL<Integer, Integer>();

    for (int i = 0; i < 10000; i++) {
        abbCrescente.inserir(listaDezMil.get(i), listaDezMil.get(i));
        avlCrescente.inserir(listaDezMil.get(i), listaDezMil.get(i));
    }

    comparacoesABB = 0;

    comparacoesAVL = 0;

    for (int i = 0; i < 1000; i++) {

        abbCrescente.pesquisar(listaMil.get(i));
        comparacoesABB += abb.getComparacoes();
        tempoABB += abb.getTempo();

        avlCrescente.pesquisar(listaMil.get(i));
        comparacoesAVL += avl.getComparacoes();
        tempoAVL += avl.getTempo();

    }

    System.out.println("Comparacoes ABB = " + comparacoesABB);
    System.out.println("Tempo ABB = " + tempoABB);
    System.out.println("Comparacoes AVL = " + comparacoesAVL);
    System.out.println("Tempo AVL = " + tempoAVL);

}