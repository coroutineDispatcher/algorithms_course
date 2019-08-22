package kotlin_version.arrays

fun main() {
    println("Factorial: ${recursiveFactorial(6)}")
    println("Factorial: ${iterativeFactorial(6)}")
}

fun recursiveFactorial(number: Int): Int = if (number == 0) {
    1
} else {
    number * recursiveFactorial(number - 1)
}

fun iterativeFactorial(number: Int): Int {
    if (number == 0) {
        return 1
    }

    var factorial = 1

    for (i in 1..number) {
        factorial *= i
    }

    return factorial
}
