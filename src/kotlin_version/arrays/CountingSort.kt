package kotlin_version.arrays

fun main() {
    val startTime = System.nanoTime()

    val arrayOfInts = intArrayOf(1, 3, 45, 151, 13, 1, 5, 2, 4, 5, 6, 7, 8, 10)

    countingSort(arrayOfInts, arrayOfInts.min()!!, arrayOfInts.max()!!)

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfInts.forEach {
        println(it)
    }
}

fun countingSort(array: IntArray, minVal: Int, maxVal: Int) {
    val countingArray = IntArray(maxVal - minVal + 1)

    array.forEach {
        countingArray[it - minVal]++
    }

    var j = 0

    for (i in minVal..maxVal) {
        while (countingArray[i - minVal] > 0) {
            array[j++] = i
            countingArray[i - minVal]--
        }
    }
}