public class ColdWeather implements ClothingStrategy {
  @Override
  public String suggestClothing(WeatherData data) {
    StringBuilder suggestion = new StringBuilder();

    // Temperature-based suggestions
    if (data.temp < 0) {
      suggestion.append("It's freezing out! Wear heavy layers, thermal wear, a winter coat, gloves, and a beanie. ");
    } else if (data.temp >= 0 && data.temp <= 10) {
      suggestion.append("It's cold. A medium to heavy jacket, a hat, and gloves are recommended. ");
    }

    // Snow-based suggestions
    if (data.snow > 0) {
      suggestion.append("Snow detected. Wear waterproof boots and be cautious as conditions might be slippery. ");
    }

    // Wind-based suggestions
    if (data.windSpeed > 10) {
      suggestion.append("There's a significant wind chill. Consider a windproof jacket or adding another layer. ");
    }
    if (data.windGust > 20) {
      suggestion.append("Beware of sudden gusts of wind. Secure your scarves, hats, and other loose items. ");
    }

    // Visibility-based suggestions
    if (data.visibility < 1000) {
      suggestion.append("Visibility is low, potentially due to fog or heavy snowfall. Exercise caution if you're traveling. ");
    }

    return suggestion.toString();
  }
}
