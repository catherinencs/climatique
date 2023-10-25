public class MildWeather implements ClothingStrategy {
  @Override
  public String suggestClothing(WeatherData data) {
    StringBuilder suggestion = new StringBuilder();

    // Temperature-based suggestions
    if (data.temp > 15 && data.temp <= 24) {
      suggestion.append("The temperature is mild. A long-sleeve shirt and pants would be comfortable. ");
    } else if (data.temp <= 15) {
      suggestion.append("It's a bit on the cooler side. A sweater or a light jacket is recommended. ");
    }

    // Cloud-based suggestions
    if (data.clouds > 80) {
      suggestion.append("The sky is mostly overcast, so you might not need sunglasses or a hat. ");
    }

    // Wind-based suggestions
    if (data.windSpeed > 15) {
      suggestion.append("It's quite windy. Consider wearing a medium-weight jacket or a scarf to stay warm. ");
    }

    // Rain-based suggestions
    if (data.rain > 0) {
      suggestion.append("There's a possibility of rain. Carrying an umbrella or wearing a rain jacket would be wise. ");
    }

    return suggestion.toString();
  }
}
