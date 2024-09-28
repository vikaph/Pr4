fun main() {
    println("Введите два числа и операцию (например: 5.0 3.0 +):")
    val x1 = readLine()
    if (x1 != null) {
        val parts = x1.split(" ")
        if (parts.size == 3) {
            val number1 = parts[0].toDoubleOrNull()
            val number2 = parts[1].toDoubleOrNull()
            val operation = parts[2]

            if (number1 != null && number2 != null) {
                val result = when (operation) {
                    "+" -> number1 + number2
                    "-" -> number1 - number2
                    "*" -> number1 * number2
                    "/" -> {
                        if (number2 != 0.0) {
                            number1 / number2
                        } else {
                            "Ошибка: деление на ноль"
                        }
                    }
                    else -> "Ошибка: неверная операция"
                }
                println("Результат: $result")
            } else {
                println("Ошибка: неверный ввод чисел")
            }
        } else {
            println("Ошибка: введите два числа и операцию, разделенные пробелами")
        }
    } else {
        println("Ошибка: пустой ввод")
    }
}