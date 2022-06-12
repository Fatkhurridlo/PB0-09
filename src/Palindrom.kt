fun main(args: Array<String>) {
    var num = 6000
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = num

    // reversed integer is stored in variable
    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }


    if (originalInteger == reversedInteger)
        println("$originalInteger  Bilangan Simetris (Palindrom)")
    else
        println("$originalInteger Bukan Bilangan Simetris (Palindrom)")
}