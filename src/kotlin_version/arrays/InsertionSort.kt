package kotlin_version.arrays


fun main() {
    val startTime = System.nanoTime()

    for (unsortedIndex in 1 until arrayOfInts.size) {
        val newValueToSort = arrayOfInts[unsortedIndex]

        var i = unsortedIndex

        while (i > 0 && arrayOfInts[i - 1] > newValueToSort) {
            arrayOfInts[i] = arrayOfInts[i - 1]
            i--
        }

        arrayOfInts[i] = newValueToSort

    }

    val endTime = System.nanoTime()

    println("Execution time: ${endTime - startTime}")

    arrayOfInts.forEach {
        println(it)
    }
}