public class HotWeather implements ClothingStrategy {
  @Override
  public String suggestClothing(WeatherData data) {
    StringBuilder suggestion = new StringBuilder();

    // Temperature-based suggestions
    if (data.temp > 30) {
      suggestion.append("It's scorching hot! Opt for lightweight, breathable clothes in light colors to reflect sunlight. ");
    } else if (data.temp > 24) {
      suggestion.append("It's warm outside. Shorts and a t-shirt or tank top are ideal. ");
    }

    // Humidity-based suggestions
    if (data.humidity > 80) {
      suggestion.append("Due to high humidity, consider moisture-wicking fabrics that dry quickly. ");
    } else if (data.humidity < 40) {
      suggestion.append("Stay hydrated as the air is dry. A hat could also be beneficial. ");
    }

    // Wind-based suggestions
    if (data.windSpeed > 10) {
      suggestion.append("There's a breeze, so you might appreciate a light jacket or a hat to shield from the wind. ");
    }

    // Rain-based suggestions
    if (data.rain > 0) {
      suggestion.append("Rain is in the forecast. Be sure to have water-resistant shoes and an umbrella on hand. ");
    }

    return suggestion.toString();
  }
}