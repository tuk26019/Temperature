class Temperature(Temperature: Double, Type: TempType) {
    private var temperature: Double = Temperature
    private var type: TempType = Type

    enum class TempType{
        FAHRENHEIT,
        CELSIUS,
        KELVIN
    }
    fun setTemperature(newTemperature: Double) {
        temperature = newTemperature
    }

    fun getTemperatureInF(): Double {
        return when (type) {
            TempType.FAHRENHEIT -> temperature
            TempType.CELSIUS -> CelsiusToFahrenheit(temperature)
            TempType.KELVIN -> KelvinToFahrenheit(temperature)
        }
    }

    fun getTemperatureInC(): Double {
        return when (type) {
            TempType.FAHRENHEIT -> FahrenheitToCelsius(temperature)
            TempType.CELSIUS -> temperature
            TempType.KELVIN -> KelvinToCelsius(temperature)
        }
    }

    fun getTemperatureInK(): Double {
        return when (type) {
            TempType.FAHRENHEIT -> FahrenheitToKelvin(temperature)
            TempType.CELSIUS -> CelsiusToKelvin(temperature)
            TempType.KELVIN -> temperature
        }
    }
    //Conversion Function
    private fun FahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }

    private fun CelsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9 / 5 + 32
    }

    private fun KelvinToCelsius(kelvin: Double): Double {
        return kelvin - 273.15
    }

    private fun CelsiusToKelvin(celsius: Double): Double {
        return celsius + 273.15
    }

    private fun FahrenheitToKelvin(fahrenheit: Double): Double {
        return CelsiusToKelvin(FahrenheitToCelsius(fahrenheit))
    }

    private fun KelvinToFahrenheit(kelvin: Double): Double {
        return CelsiusToFahrenheit(KelvinToCelsius(kelvin))
    }
    }