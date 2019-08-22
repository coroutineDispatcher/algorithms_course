package kotlin_version.arrays

fun main() {
    val startTime = System.nanoTime()

    var gap = arrayOfInts.size / 2

    while (gap > 0) {
        for (i in gap until arrayOfInts.size) {
            val newValue = arrayOfInts[i]
            var j = i

            while (j >= gap && arrayOfInts[j - gap] > 0) {
                arrayOfInts[j] = arrayOfInts[j - gap]
                j -= gap
            }
            arrayOfInts[j] = newValue
        }
        gap /= 2
    }

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfInts.forEach {
        println(it)
    }
}