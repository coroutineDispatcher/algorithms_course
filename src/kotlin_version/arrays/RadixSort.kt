package kotlin_version.arrays

import kotlin.math.pow

fun main() {
    val array = intArrayOf(120, 154, 111, 520, 636, 989, 999, 100)
    radixSort(array, 10, 3)
    array.forEach {
        println(it)
    }
}

fun radixSort(array: IntArray, radix: Int, width: Int) {
    for (i in 0..width) {
        singleRadixSort(array, i, radix)
    }
}

fun singleRadixSort(array: IntArray, position: Int, radix: Int) {
    val numberOfItems = array.size
    val countingArray = IntArray(radix)

    array.forEach { value ->
        countingArray[getDigit(position, value, radix)]++
    }

    for (j in 1 until radix) {
        countingArray[j] += countingArray[j - 1]
    }

    val tempArray = IntArray(numberOfItems)
    for (tempIndex in tempArray.size - 1 downTo 0) {
        tempArray[--countingArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex]
    }

    tempArray.copyInto(destination = array, startIndex = 0, endIndex = numberOfItems)
}

private fun getDigit(position: Int, value: Int, radix: Int): Int =
        value / radix.toDouble().pow(position.toDouble()).toInt() % radix

