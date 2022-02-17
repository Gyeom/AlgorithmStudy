package sum_of_two_integers

fun getSum(a: Int, b: Int): Int {
    var a = a
    var b = b
    var c: Int
    while (b != 0) {
        c = a and b
        a = a xor b
        b = c shl 1
    }
    return a
}

