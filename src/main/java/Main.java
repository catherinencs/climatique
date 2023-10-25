import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    String city = "Boston";
    WeatherService weatherService = new WeatherService();
    ClothingSuggestion clothingService = new ClothingSuggestion(weatherService);
    String weatherResponse = weatherService.getWeatherByCity(city);

    String suggestion = clothingService.getClothingSuggestion(city);

    System.out.println(weatherResponse);
    System.out.println("Clothing suggestion for " + city + ": " + suggestion);
  }
}

