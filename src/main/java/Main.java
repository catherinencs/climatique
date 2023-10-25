import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    WeatherService weatherService = new WeatherService();
    ClothingSuggestion clothingService = new ClothingSuggestion(weatherService);

    String city = "Boston";
    String suggestion = clothingService.getClothingSuggestion(city);

    System.out.println("Clothing suggestion for " + city + ": " + suggestion);
  }
}

