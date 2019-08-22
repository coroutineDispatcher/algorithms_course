package kotlin_version.arrays

import java_version.arrays.Utils

fun main() {
    val startTime = System.nanoTime()

    for (unsortedIndex in (arrayOfInts.size - 1) downTo 0) {
        var indexOfLargestNumber = 0

        for (i in 1..unsortedIndex) {
            if (arrayOfInts[i] > arrayOfInts[indexOfLargestNumber]) {
                indexOfLargestNumber = i
            }
        }

        Utils.swap(arrayOfInts, indexOfLargestNumber, unsortedIndex)
    }

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfInts.forEach {
        println(it)
    }
}