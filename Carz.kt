import ru.itis.firsttrialandroid.Car

class Carz (val brand: String, val model: String, val year: Int, val speed: Int)
{
    open fun displayInfo()
    {
        println("Brand: $brand, Model: $model, Year: $year, Speed: $speed")
    }
    class Sedan(brand: String, model: String, year: Int, speed: Int, val trunkSize: Int) : Car(brand, model, year, speed) {
        override fun displayInfo() {
            super.displayInfo()
            println("Trunk Size: $trunkSize")
        }
    }

    class SUV(brand: String, model: String, year: Int, speed: Int, val driveType: String, val enginePower: Int) : Car(brand, model, year, speed) {
        override fun displayInfo() {
            super.displayInfo()
            println("Drive Type: $driveType, Engine Power: $enginePower")
        }
    }

    class Truck(brand: String, model: String, year: Int, speed: Int, val payloadCapacity: Int) : Car(brand, model, year, speed) {
        override fun displayInfo() {
            super.displayInfo()
            println("Payload Capacity: $payloadCapacity")
        }
    }

    class Coupe(brand: String, model: String, year: Int, speed: Int, val hasSunroof: Boolean) : Car(brand, model, year, speed) {
        override fun displayInfo() {
            super.displayInfo()
            println("Has Sunroof: $hasSunroof")
        }
    }
}