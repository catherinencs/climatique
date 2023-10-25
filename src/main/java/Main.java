import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    WeatherService service = new WeatherService();
    try {
      String city = "Boston";
      String result = service.getWeatherByCity(city);
      System.out.println(result);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
