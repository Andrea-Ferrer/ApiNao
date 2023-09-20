package model;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ScholarModel {
    private static final String API_KEY = "faf8ad7142ae099e73069e817e5d67f7ecd5e2da53e977625410a95c1d3f46ac"; // Reemplaza con tu propia clave API
    private static final String API_URL = "https://serpapi.com/search.json?engine=google_scholar&q=";

    public String consultarAutor(String nombreAutor) {
        OkHttpClient cliente = new OkHttpClient();

        // Construir la URL de la consulta
        String url = API_URL + "?author=" + nombreAutor + "&api_key=" + API_KEY;

        // Crear la solicitud GET
        Request solicitud = new Request.Builder()
                .url(url)
                .build();

        try {
            // Realizar la solicitud
            Response respuesta = cliente.newCall(solicitud).execute();
            ResponseBody cuerpoRespuesta = respuesta.body();

            if (cuerpoRespuesta != null) {
                // Obtener el JSON de la respuesta y convertirlo en una cadena
                String jsonRespuesta = cuerpoRespuesta.string();
                
                // Mostrar la respuesta JSON en la consola
                System.out.println("Resultado de la consulta:");
                System.out.println(jsonRespuesta);

                return jsonRespuesta;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}