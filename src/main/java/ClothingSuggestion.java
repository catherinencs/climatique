import java.io.IOException;

public class ClothingSuggestion {

  private final WeatherService weatherService;

  public ClothingSuggestion(WeatherService weatherService) {
    this.weatherService = weatherService;
  }

  public String getClothingSuggestion(String city) throws IOException {
    String weatherResponse = weatherService.getWeatherByCity(city);
    WeatherData weatherData = new WeatherData(weatherResponse);

    ClothingStrategy strategy = determineStrategy(weatherData);

    return strategy.suggestClothing(weatherData);
  }

  private ClothingStrategy determineStrategy(WeatherData weatherData) {
    // Criteria for hot weather
    if (weatherData.temp > 25) {
      return new HotWeather();
    }
    // Add more here
    return null;
  }
}
