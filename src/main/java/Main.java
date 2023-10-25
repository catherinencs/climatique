import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    WeatherService service = new WeatherService();
    try {
      String jsonResponse = service.getWeatherByCity("Boston");
      WeatherData weatherData = new WeatherData(jsonResponse);

      System.out.println("Temperature: " + weatherData.temp);
      System.out.println("Weather Description: " + weatherData.description);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
