/*
 * Lesson01 : EX01
 * Name: Namchok Singhachai
 */
fun main(args: Array<String>) {
    val half = 0.5
    var base: Double
    var height: Double                  // Variable of Triagle area

    print("Please enter base: ")        
    base = readLine()!!.toDouble()      // Read file
    print("Please enter height: ")
    height = readLine()!!.toDouble()    // Read file
    
    println("Triangle area is " + (base*height*half).toString())
}
// kotlinc ex01.kt -include-runtime -d ex01.jar && java -jar ex01.jar