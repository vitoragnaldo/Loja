import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VitorExpress {

    private List<Produto> produtos;

    public VitorExpress() {
        produtos = new ArrayList<>();
        // Adicionando alguns produtos ao estoque
        produtos.add(new Produto("Samsung S25", "Todas as especificações e descrições fornecidas aqui podem ser diferentes das especificações e descrições reais do produto", 10000.00));
        produtos.add(new Produto("Apple iPhone 16 Pro Max", "iPhone com iOS 18 Cabo para recarga com conector USB-C (1m) Documentação", 20000.00));
        produtos.add(new Produto("Smartphone Motorola Edge 50 Fusion", "Resistente à Água, Dual SIM, Tela sensível ao toque, GPS integrado, Processador Octa Core", 2000));
    }

    // Exibe todos os produtos disponíveis
    public void listarProdutos() {
        System.out.println("Produtos disponíveis para compra:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(i + 1 + ". " + produtos.get(i));
        }
    }

    // Realiza a compra de um produto
    public void realizarCompra(int indiceProduto) {
        if (indiceProduto < 1 || indiceProduto > produtos.size()) {
            System.out.println("Opção inválida.");
            return;
        }
        Produto produto = produtos.get(indiceProduto - 1);
        System.out.println("Você comprou o produto: " + produto.getNome());
        System.out.println("Valor total: R$ " + produto.getPreco());
    }

    // Método principal para interação com o usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VitorExpress loja = new VitorExpress();

        while (true) {
            System.out.println("\nBem-vindo à Vitor Express!");
            loja.listarProdutos();
            System.out.print("Digite o número do produto que você deseja comprar (0 para sair): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Obrigado por visitar a Vitor Express. Até logo!");
                break;
            }

            loja.realizarCompra(escolha);
        }

        scanner.close();
    }
}
