class Square(_name: String, var _length: Double, var _height: Double) : Shape(_name) {

    fun setDimensions(length: Double, height: Double) {
        _length = length
        _height = height
    }

    override fun getArea(): Double {
        return _length * _height;
    }

    override fun printDimensions() {
        println("height: ${_height}")
    }
}