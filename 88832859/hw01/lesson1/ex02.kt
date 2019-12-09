/*
 * Lesson01 : EX02
 * Name: Namchok Singhachai
 */
fun main(args: Array<String>) {
    var height1: String = "180"     // String
    var height2: String = "150"     // String

    println("Average of height is " + ((height1.toInt()+height2.toInt())/2).toString())
}
// kotlinc ex02.kt -include-runtime -d ex02.jar && java -jar ex02.jar