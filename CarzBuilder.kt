import ru.itis.firsttrialandroid.Car

class CarzBuilder (private val brand: String)
{
    private var model: String = ""
    private var year: Int = 0
    private var speed: Int = 0
    private var type: String = "Sedan"

    fun setModel(model: String) = apply { this.model = model }
    fun setYear(year: Int) = apply { this.year = year }
    fun setSpeed(speed: Int) = apply { this.speed = speed }
    fun setType(type: String) = apply { this.type = type }

    fun build(): Car {
        return when (type) {
            "SUV" -> Carz.SUV(brand, model, year, speed, "4WD", 300)
            "Truck" -> Carz.Truck(brand, model, year, speed, 10000)
            "Coupe" -> Carz.Coupe(brand, model, year, speed, true)
            else -> Carz.Sedan(brand, model, year, speed, 500)
        }
    }
}