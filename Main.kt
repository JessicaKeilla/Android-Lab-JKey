import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.itis.firsttrialandroid.Car
import ru.itis.firsttrialandroid.CarBuilder
import ru.itis.firsttrialandroid.R

class Main : AppCompatActivity()

{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun generateCars(count: Int): List<Car> {
        val carList = mutableListOf<Car>()
        val brands = listOf("Hilux4x4", "Bentley", "Mazerati", "BMW", "Mercedes")
        val models = listOf("Type1", "Type2", "Type3", "Type4", "Type5")
        val types = listOf("Sedan", "SUV", "Truck", "Coupe")

        for (i in 1..count) {
            val brand = brands.random()
            val model = models.random()
            val year = (2000..2024).random()
            val speed = (100..300).random()
            val type = types.random()

            val car = CarzBuilder(brand)
                .setModel(model)
                .setYear(year)
                .setSpeed(speed)
                .setType(type)
                .build()

            carList.add(car)
        }

        return carList
    }
}