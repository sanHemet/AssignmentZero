import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("Enter a length for a square: ")
    val sqLength:Double = scanner.nextDouble()
    print("Enter a height for a square: ")
    val sqHeight:Double = scanner.nextDouble()

    val square = Square("Square1", 0.0, 0.0)
    square.setDimensions(sqLength, sqHeight)
    println("\nname: ${square.name} area: ${square.getArea()}")
    square.printDimensions()

    print("\nEnter a radius for a circle: ")
    val crRadius:Double = scanner.nextDouble()

    val circle = Circle("Circle1", 0.0)
    circle.setDimensions(crRadius)
    println("name: ${circle.name} area: ${circle.getArea()}")
    circle.printDimensions()

    print("\nEnter a length for a triangle: ")
    val trLength:Double = scanner.nextDouble()
    print("Enter a base for a triangle: ")
    val trBase:Double = scanner.nextDouble()
    print("Enter a height for a triangle: ")
    val trHeight:Double = scanner.nextDouble()

    val triangle = Triangle("Triangle1", 0.0, 0.0, 0.0)
    triangle.setDimensions(trLength, trBase, trHeight)
    println("name: ${triangle.name} area: ${triangle.getArea()}")
    triangle.printDimensions()

    print("\nEnter a length for an equilateral triangle: ")
    val eqSides:Double = scanner.nextDouble()

    val equilateralTriangle = EquilateralTriangle("EquilateralTriangle1", 0.0)
    equilateralTriangle.setDimensions(eqSides)
    println("name: ${equilateralTriangle.name} area: ${equilateralTriangle.getArea()}")
    equilateralTriangle.printDimensions()
}