import kotlin.math.*

class Triangle(_name: String, var _sideA: Double, var _sideB: Double, var _sideC: Double): Shape(_name) {

    fun setDimensions(sideA: Double, sideB: Double, sideC: Double) {
        _sideA = sideA
        _sideB = sideB
        _sideC = sideC
    }
    override fun getArea(): Double {
        val s: Double = ((_sideA + _sideB + _sideC)/2)
        return sqrt(s*(s-_sideA)*(s-_sideB)*(s-_sideC))
    }

    override fun printDimensions() {
        println("Side A: ${_sideA}, Side B: ${_sideB}, Side C: ${_sideC}")
    }
}