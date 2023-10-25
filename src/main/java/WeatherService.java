import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherService {
  private static final String API_KEY = "b762a725129606be4481817a8bdd68a9";
  private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

  public String getWeatherByCity(String city) throws IOException {
    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url(BASE_URL + "?q=" + city + "&appid=" + API_KEY)
            .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }
}
