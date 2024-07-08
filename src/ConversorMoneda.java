import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoneda {

    private String moneda;
    private String convertirMoneda;
            ;

    public Moneda consultar(int opcion, Double monto) {
        establecerMonedas(opcion);
        URI url = URI.create("https://v6.exchangerate-api.com/v6/1e50aec24c2aba868bca8a8b/pair/" + moneda + "/" + convertirMoneda
                + "/" + monto + "/");
        String responseBody = realizarSolicitud(url);
        return new Gson().fromJson(responseBody, Moneda.class);
    }

    private void establecerMonedas(int opcion) {
        switch (opcion) {
            case 1 -> {
                moneda = "USD";
                convertirMoneda
                        = "ARS";
            }
            case 2 -> {
                moneda = "ARS";
                convertirMoneda
                        = "USD";
            }
            case 3 -> {
                moneda = "USD";
                convertirMoneda
                        = "BRL";
            }
            case 4 -> {
                moneda = "BRL";
                convertirMoneda
                        = "USD";
            }
            case 5 -> {
                moneda = "USD";
                convertirMoneda
                        = "COP";
            }
            case 6 -> {
                moneda = "COP";
                convertirMoneda
                        = "USD";
            }
            case 7 -> {
            }
            default -> throw new IllegalArgumentException("Opción no válida: " + opcion);
        }
    }

    private String realizarSolicitud(URI url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al realizar la solicitud: " + e.getMessage());
        }
    }
}
