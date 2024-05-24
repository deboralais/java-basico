import java.util.Scanner;

/** classe**/

 class Produto {
    String nome
    Int codigo
    Double preco
 }

public class MeuProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto ();
        Produto p2 = new Produto ();
        Produto p3 = new Produto ();

        p1.nome = "shampoo";
        p1.codigo = 001;
        p1.preco = 18.20;

        p2.nome = "condicionador";
        p2.codigo = 002;
        p2.preco = 20.50;

        p3.nome = "hidratacao";
        p3.codigo = 003;
        p3.preco = 39.99;

        Produto [] produtos = new Produto [3];

        produtos[0] = p1;
        produtos [1] = p2;
        produtos [2] = p3;

        for (i = 0; i < produtos.lenght; i++){
            System.out.println(produtos[i].nome);
            System.out.println(produtos[i].codigo);
            System.out.println(produtos[i].preco);
        }

    }


}