package task3;

class TemperatureAdapter implements TemperatureSensor {
    private FahrenheitSensor fahrenheitSensor;

    public TemperatureAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperature() {
        double temperatureFahrenheit = fahrenheitSensor.getTemperatureFahrenheit();
        return (temperatureFahrenheit - 32) * 5 / 9;
    }
}
