package kotlin_version.arrays

import java_version.arrays.Utils

val arrayOfInts = intArrayOf(56, 24, -25, 1, 15, -5, 100)


fun main() {

    val startTime = System.nanoTime()

    for (unsortedIndex in arrayOfInts.size - 1 downTo 1) {
        for (i in 0 until unsortedIndex) {
            if (arrayOfInts[i] > arrayOfInts[i + 1]) {
                Utils.swap(arrayOfInts, i, i + 1)
            }
        }
    }

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfInts.forEach {
        println(it)
    }
}