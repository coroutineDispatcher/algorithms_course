package kotlin_version.arrays

import java_version.arrays.Utils

val arrayOfIntegers: IntArray = Utils.arrayOfMillions()

fun main() {
    val startTime = System.nanoTime()

    mergeSort(arrayOfIntegers, 0, arrayOfIntegers.size)

    println("Sorted: ${System.nanoTime() - startTime}")
}

fun mergeSort(array: IntArray, start: Int, end: Int) {
    if (end - start < 2) {
        return
    }

    val mid = (start + end) / 2

    mergeSort(array, start, mid)
    mergeSort(array, mid, end)
    merge(array, start, mid, end)
}

fun merge(array: IntArray, start: Int, mid: Int, end: Int) {
    if (array[mid - 1] < array[mid]) {
        return
    }

    var i = start
    var j = mid
    var tempIndex = 0
    val tempArray = IntArray(end - start)

    while (i < mid && j < end) {
        tempArray[tempIndex++] = if (arrayOfIntegers[i] < arrayOfIntegers[j]) arrayOfIntegers[i++] else arrayOfIntegers[j++]
    }

    System.arraycopy(array, i, array, start + tempIndex, mid - i)
    System.arraycopy(tempArray, 0, array, start, tempIndex)
}