import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherService {
  private static final String API_KEY = "b762a725129606be4481817a8bdd68a9";
  private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
  private final OkHttpClient client = new OkHttpClient();

  public String getWeatherByCity(String city) throws IOException {
    HttpUrl url = HttpUrl.parse(BASE_URL).newBuilder()
            .addQueryParameter("q", city)
            .addQueryParameter("appid", API_KEY)
            .addQueryParameter("units", "metric")
            .build();

    Request request = new Request.Builder().url(url).build();

    try (Response response = client.newCall(request).execute()) {
      if (response.body() != null) {
        return response.body().string();
      } else {
        throw new IOException("Empty response from server");
      }
    }
  }
}
