
public class Produto {
    int id;
    String nome;
    double preco;
    int quantidade;

    public void exibirDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

}
