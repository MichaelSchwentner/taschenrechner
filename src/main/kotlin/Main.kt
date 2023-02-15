fun main() {
    println("Willkommen beim Taschenrechner!")
    print("Bitte geben Sie die erste Zahl ein: ")
    val num1 = readLine()!!.toDouble()
    print("Bitte geben Sie die Operation (+, -, *, /) ein: ")
    val operation = readLine()!!
    print("Bitte geben Sie die zweite Zahl ein: ")
    val num2 = readLine()!!.toDouble()

    val result = calculate(operation, num1, num2)
    println("Ergebnis: $result")
}

fun calculate(operation: String, num1: Double, num2: Double): Double {
    when (operation) {
        "+" -> return num1 + num2
        "-" -> return num1 - num2
        "*" -> return num1 * num2
        "/" -> return num1 / num2
        else -> throw IllegalArgumentException("Ungültige Operation")
    }
}