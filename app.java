import java.net.URI;
import java.net.http.httpClient;

public class app {
    public static void main (String[] args) throws Exception 

    {
        System.out.println("Hello, World!");

        // Fazer uma conexão HTTP e Buscar os top 250 FIlmes
        String url = "https://imdb-api.com/en/API/Top250Movies/k_xz3krpo1";
        URI endereco  URI.create(url);
        var client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        // Extrair só os dados que interessam (titulo, poster, classificação)

        // exibir e manipular os dados
    }
}