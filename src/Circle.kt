import kotlin.math.*

class Circle(_name: String, var _radius: Double): Shape(_name) {

    fun setDimensions(radius: Double) {
        _radius = radius
    }

    override fun getArea(): Double {
        return PI * _radius * _radius;
    }

    override fun printDimensions() {
        println("radius: ${_radius}")
    }
}