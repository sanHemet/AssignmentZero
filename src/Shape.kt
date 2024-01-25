interface Dimensionable {
    fun printDimensions()
}

abstract class Shape (val name : String) : Dimensionable {
    open fun getArea(): Double {
        return 0.0;
    }
}

