public class HotWeather implements ClothingStrategy {
  @Override
  public String suggestClothing(WeatherData data) {
    if (data.humidity > 80) {
      return "High humidity detected. Wear moisture-wicking clothes.";
    } else {
      return "It's hot! Wear lightweight and breathable clothes.";
    }
  }
}