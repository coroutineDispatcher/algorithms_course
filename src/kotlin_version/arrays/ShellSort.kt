package kotlin_version.arrays

fun main() {
    val startTime = System.nanoTime()

    var gap = arrayOfIntegers.size / 2

    while (gap > 0) {
        for (i in gap until arrayOfIntegers.size) {
            val newValue = arrayOfIntegers[i]
            var j = i

            while (j >= gap && arrayOfIntegers[j - gap] > 0) {
                arrayOfIntegers[j] = arrayOfIntegers[j - gap]
                j -= gap
            }
            arrayOfIntegers[j] = newValue
        }
        gap /= 2
    }

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfIntegers.forEach {
        println(it)
    }
}