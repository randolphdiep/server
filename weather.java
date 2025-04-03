public class Weather {
    private double temperature;
    private String condition;
    private double humidity;
    private double windSpeed;
    private String alert;

    public Weather(double temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
        this.humidity = 0.0;
        this.windSpeed = 0.0;
        this.alert = null;
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

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getWeatherSummary() {
        return String.format("Current weather: %s with temperature %.1f°C", condition, temperature);
    }

    public double convertToFahrenheit() {
        return (temperature * 9/5) + 32;
    }

    public String getDetailedWeatherReport() {
        StringBuilder report = new StringBuilder();
        report.append(String.format("Temperature: %.1f°C (%.1f°F)\n", temperature, convertToFahrenheit()));
        report.append(String.format("Condition: %s\n", condition));
        report.append(String.format("Humidity: %.1f%%\n", humidity));
        report.append(String.format("Wind Speed: %.1f km/h", windSpeed));
        
        if (alert != null) {
            report.append("\nAlert: ").append(alert);
        }
        
        return report.toString();
    }

    public boolean isSevereWeather() {
        return (windSpeed > 50.0 || temperature < -10.0 || temperature > 40.0 || 
                condition.equalsIgnoreCase("Thunderstorm") || 
                condition.equalsIgnoreCase("Tornado"));
    }

    public static void main(String[] args) {
        Weather currentWeather = new Weather(25.5, "Sunny");
        currentWeather.setHumidity(65.0);
        currentWeather.setWindSpeed(15.0);
        currentWeather.setAlert("High UV index warning");
        
        System.out.println(currentWeather.getWeatherSummary());
        System.out.println("\nDetailed Weather Report:");
        System.out.println(currentWeather.getDetailedWeatherReport());
        System.out.println("\nSevere Weather Warning: " + currentWeather.isSevereWeather());
    }
}
