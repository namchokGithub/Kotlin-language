/*
 * Lesson01 : EX01
 * Name: Namchok Singhachai
 */
fun main(args: Array<String>) {
    val half = 0.5
    var base: Double
    var height: Double

    print("Please enter base: ")
    base = readLine()!!.toDouble()
    print("Please enter height: ")
    height = readLine()!!.toDouble()
    
    println("Triangle area is " + (base*height*half).toString())
}
// kotlinc ex01.kt -include-runtime -d ex01.jar && java -jar ex01.jar