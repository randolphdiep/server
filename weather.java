public class Weather {
    private double temperature;
    private String condition;

    public Weather(double temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getWeatherSummary() {
        return String.format("Current weather: %s with temperature %.1f°C", condition, temperature);
    }

    public static void main(String[] args) {
        Weather currentWeather = new Weather(25.5, "Sunny");
        System.out.println(currentWeather.getWeatherSummary());
    }
}
