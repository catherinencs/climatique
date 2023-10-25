import org.json.JSONObject;

public class WeatherData {
  public final double lon;
  public final double lat;
  public final String mainWeather;
  public final String description;
  public final double temp;
  public final double feelsLike;
  public final double tempMin;
  public final double tempMax;
  public final int pressure;
  public final int humidity;
  public final int visibility;
  public final double windSpeed;
  public final int windDeg;
  public final double windGust;
  public final int clouds;
  public final double rain;
  public final double snow;

  public WeatherData(String jsonResponse) {
    JSONObject obj = new JSONObject(jsonResponse);

    this.lon = obj.getJSONObject("coord").getDouble("lon");
    this.lat = obj.getJSONObject("coord").getDouble("lat");
    this.mainWeather = obj.getJSONArray("weather").getJSONObject(0).getString("main");
    this.description = obj.getJSONArray("weather").getJSONObject(0).getString("description");
    this.temp = obj.getJSONObject("main").getDouble("temp");
    this.feelsLike = obj.getJSONObject("main").getDouble("feels_like");
    this.tempMin = obj.getJSONObject("main").getDouble("temp_min");
    this.tempMax = obj.getJSONObject("main").getDouble("temp_max");
    this.pressure = obj.getJSONObject("main").getInt("pressure");
    this.humidity = obj.getJSONObject("main").getInt("humidity");
    this.visibility = obj.getInt("visibility");
    this.windSpeed = obj.getJSONObject("wind").getDouble("speed");
    this.windDeg = obj.getJSONObject("wind").getInt("deg");
    this.windGust = obj.getJSONObject("wind").has("gust") ? obj.getJSONObject("wind").getDouble("gust") : 0;
    this.clouds = obj.getJSONObject("clouds").getInt("all");
    this.rain = obj.has("rain") && obj.getJSONObject("rain").has("1h") ? obj.getJSONObject("rain").getDouble("1h") : 0;
    this.snow = obj.has("snow") && obj.getJSONObject("snow").has("1h") ? obj.getJSONObject("snow").getDouble("1h") : 0;
  }
}
