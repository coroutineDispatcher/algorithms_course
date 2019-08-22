package kotlin_version.arrays

fun main() {
    val startTime = System.nanoTime()
    mergeSort(arrayOfInts, 0, arrayOfInts.size)
    println("Sorted: ${System.nanoTime() - startTime}")
    arrayOfInts.forEach {
        println(it)
    }
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
    if (array[mid - 1] <= array[mid]) {
        return
    }

    var i = start
    var j = mid
    var tempIndex = 0
    val tempArray = IntArray(end - start)

    while (i < mid && j < end) {
        tempArray[tempIndex++] = if (array[i] <= array[j]) array[i++] else array[j++]
    }

    System.arraycopy(array, i, array, start + tempIndex, mid - i)
    System.arraycopy(tempArray, 0, array, start, tempIndex)
}