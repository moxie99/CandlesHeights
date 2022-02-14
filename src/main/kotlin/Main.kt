import java.util.*

fun main(args: Array<String>) {

   var candles = arrayOf(1,11,2,3,4,5,6,10,8,8,9,8,10,3,4,5,8,9,3,4,6,8,9,10, 10)
    var max: Int = 0
    var count: Int = 0
    for (i in candles){
        if(i > max) max = i
    }
    println(max)
    for (i in candles){
        if(max == i){
            count++
        }
    }
    println(count)
}