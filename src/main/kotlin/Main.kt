fun main(args: Array<String>) {
    val temperature = Temperature(32.0, Temperature.TempType.FAHRENHEIT)

    println("Temperature in Fahrenheit: ${temperature.getTemperatureInF()} °F")
    println("Temperature in Celsius: ${temperature.getTemperatureInC()} °C")
    println("Temperature in Kelvin: ${temperature.getTemperatureInK()} K")

    // Example of changing the temperature
    temperature.setTemperature(32.0)
    println("Updated Temperature in Fahrenheit: ${temperature.getTemperatureInF()} °F")
}