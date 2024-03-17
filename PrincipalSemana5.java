import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;


        // 3) Criar interface
public class PrincipalSemana5 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Livro livroUm = new Livro();
        livroUm.setNome("Senhor dos Aneis");
        livroUm.setIsbn("1a2b3c4d");

        Cliente clienteUm = new Cliente();
        clienteUm.setNomeCLiente("Osvaldo");
        clienteUm.setCpf("231.435.258-24");

        System.out.println(livroUm.identifcar());
        System.out.println(clienteUm.identifcar());

 //----------------------------------------------------------------------------
         //4) Leitura de dados

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o id do produtop: ");
        int idProduto = leitura.nextInt();
        System.out.println("Id digitado: " + idProduto);

//----------------------------------------------------------------------------
        // 5) Tratar uma possivel exceção

        try {
            Scanner leituraUm = new Scanner(System.in);
            System.out.println("Digite o id do produtop: ");
            int idProdutoUM = leituraUm.nextInt();
            System.out.println("Id digitado: " + idProdutoUM);

        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite um valor numérico");
        }

//----------------------------------------------------------------------------
        // 6) Fazer consulta para a API

//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://fakestoreapi.com/products/1"))
//                .build();
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());

//----------------------------------------------------------------------------
        // 7) Fazer consulta para a API com uri dinamica

        try {
            Scanner leituraUm = new Scanner(System.in);
            System.out.println("Digite o id do produto: ");
            int idProdutoUM = leituraUm.nextInt();

            String endereco = "https://fakestoreapi.com/products/" + idProdutoUM;


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite um valor numérico");
        }


    }


}
