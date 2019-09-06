package kotlin_lists

fun main() {
    val array = intArrayOf(1, 3, 44, -5, 1, 12, 51)

    array.sort()

    println("Index where item is located: ${recursiveBinarySearch(array, 0, array.size, 44)}")
}

fun iterativeBinarySearch(array: IntArray, value: Int): Int {
    var start = 0
    var end = array.size

    while (start < end) {
        val midpoint = (start + end) / 2

        when {
            array[midpoint] == value -> return midpoint
            array[midpoint] < value -> start = midpoint + 1
            else -> end = midpoint
        }
    }

    return -1
}

fun recursiveBinarySearch(array: IntArray, start: Int, end: Int, value: Int): Int {
    if (start >= end) {
        return -1
    }

    val midpoint = (start + end) / 2

    return when {
        array[midpoint] == value -> return midpoint
        array[midpoint] < value -> recursiveBinarySearch(array, midpoint + 1, end, value)
        else -> recursiveBinarySearch(array, start, midpoint, value)
    }
}