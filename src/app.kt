fun main() {
    val numbers: Array<Int> = arrayOf(5, 15, 4, 2, 3, 7)
    val num = 7
    numbersFun(numbers, num).forEach { i -> println("Индексы равны $i") }
/*
    outerLoop@ for ((index, number) in numbers.withIndex()) {
        for ((item, n) in numbers.withIndex()) {
            if (num == number + n) {
                println("индекс $index = $number, индекс 2 числа $item = $n")
                break@outerLoop
            }
        }
    }
    */

}

fun numbersFun(array: Array<Int>, num: Int): IntArray {
    for ((i, number) in array.withIndex()) {
        for ((j, n) in array.withIndex()) {
            if (number + n == num) return intArrayOf(i, j)
        }
    }
    throw  IllegalArgumentException("нет таких чисел")
}










