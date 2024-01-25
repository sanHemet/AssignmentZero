import kotlin.math.*

class EquilateralTriangle(_name: String, var _sides: Double): Shape(_name) {

    fun setDimensions(sides: Double) {
        _sides = sides
    }

    override fun getArea(): Double {
        val s: Double = ((_sides * 3)/2)
        return sqrt(s*(s-_sides)*(s-_sides)*(s-_sides))
    }

    override fun printDimensions() {
        println("Sides: ${_sides}")
    }
}