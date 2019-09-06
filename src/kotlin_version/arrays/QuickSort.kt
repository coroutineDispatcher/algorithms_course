package kotlin_version.arrays

import java_version.arrays.Utils

val arrayOfSomeInts = Utils.arrayOfThousands()

fun main() {
    val startTime = System.nanoTime()

    quickSort(arrayOfSomeInts, 0, arrayOfSomeInts.size)

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")
}

fun quickSort(arrayOfInts: IntArray, start: Int, end: Int) {
    if (end - start < 2) {
        return
    }

    val pivot = findPivot(arrayOfInts, start, end)
    quickSort(arrayOfInts, start, pivot)
    quickSort(arrayOfInts, pivot + 1, end)
}

fun findPivot(arrayOfInts: IntArray, start: Int, end: Int): Int {
    val pivot = arrayOfInts[start]

    var i = start
    var j = end

    while (i < j) {
        while (i < j && arrayOfInts[--j] >= pivot);
        if (i < j) {
            arrayOfInts[i] = arrayOfInts[j]
        }

        while (i < j && arrayOfInts[++i] <= pivot);
        if (i < j) {
            arrayOfInts[j] = arrayOfInts[i]
        }
    }

    arrayOfInts[j] = pivot

    return j
}
