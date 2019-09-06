package kotlin_version.arrays

import java_version.arrays.Utils

fun main() {
    val startTime = System.nanoTime()

    for (unsortedIndex in (arrayOfIntegers.size - 1) downTo 0) {
        var indexOfLargestNumber = 0

        for (i in 1..unsortedIndex) {
            if (arrayOfIntegers[i] > arrayOfIntegers[indexOfLargestNumber]) {
                indexOfLargestNumber = i
            }
        }

        Utils.swap(arrayOfIntegers, indexOfLargestNumber, unsortedIndex)
    }

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfIntegers.forEach {
        println(it)
    }
}