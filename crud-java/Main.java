import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.id = 1;
        p1.nome = "Capa de celular";
        p1.preco = 9.99;
        p1.quantidade = 4;

        p2.id = 2;
        p2.nome = "Pelicula";
        p2.preco = 5.99;
        p2.quantidade = 2;

        listaProdutos.add(p1);
        listaProdutos.add(p2);

        // for (Produto produto : listaProdutos) {
        // produto.exibirDetalhes();
        // }

        String nomeBusca = "Pelicula";

        boolean nomeEncontrado = false;

        for (Produto produto : listaProdutos) {

            if (produto.nome.equals(nomeBusca)) {
                System.out.println(produto.id);
                System.out.println(produto.nome);
                System.out.println(produto.preco);
                System.out.println(produto.quantidade);

                nomeEncontrado = true;

            }

        }

        if (!nomeEncontrado) {
            System.out.println("Nome não encontrado na lista");
        }

        int buscaId = 2;
        boolean atualizado = false;

        for (Produto produto : listaProdutos) {
            if (produto.id == buscaId) {
                produto.nome = "pelicula renomeada";
                produto.preco = 10.88;
                produto.quantidade = 100;

                atualizado = true;

            }
        }

        if (!atualizado) {
            System.out.println("Id não encontrado");
        }

        int idDeletar = 2;

        boolean removido = listaProdutos.removeIf(produto -> produto.id == idDeletar);

        if (!removido) {
            System.out.println("id Não encontrado para remoção");
        }

        for (Produto produto : listaProdutos) {
            produto.exibirDetalhes();
        }
    }

}
