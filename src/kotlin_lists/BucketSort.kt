package kotlin_lists

import kotlin.collections.ArrayList

fun main() {
    val array = intArrayOf(35, 14, 123, 125, 12, 1, 123, 3, 51, 98, 15)

    bucketSort(array)

    array.forEach {
        println(it)
    }
}

fun bucketSort(array: IntArray) {
    val bucket = arrayOfNulls<ArrayList<Int>>(100)

    for (i in bucket.indices) {
        bucket[i] = ArrayList()
    }

    for (i in array.indices) {
        bucket[getDigit(array[i])]?.add(array[i])
    }

    bucket.forEach {
        it?.sort()
    }

    var j = 0
    for (i in bucket.indices) {
        bucket[i]?.forEach {
            array[j++] = it
        }
    }

}

fun getDigit(value: Int): Int = value / 10