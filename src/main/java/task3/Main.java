package task3;

public class Main {
    public static void main(String[] args) {
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
        TemperatureSensor adapter = new TemperatureAdapter(fahrenheitSensor);
        System.out.println("Температура в Цельсіях: " + adapter.getTemperature());
    }
}
