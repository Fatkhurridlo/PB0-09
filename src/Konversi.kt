internal object GFG {

    fun ConvertSectoJam(n: Int) {
        var n = n
        val hour = n / 3600
        n %= 3600
        val minutes = n / 60
        n %= 60
        val seconds = n
        println(
            hour.toString()  + hour
                    + " " + "Jam " + minutes + " "
                    + "menit " + seconds + " "
                    + "detik"
        )
    }


    @JvmStatic
    fun main(args: Array<String>) {

        val n = 80000
        ConvertSectoJam(n)
    }
}
