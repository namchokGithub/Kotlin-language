/*
 * Lesson01 : ex08
 * Name: Namchok Singhachai
 */

fun main(args: Array<String>) {
    var student = listOf("Namchok", "Chatchalerm", "Kittisak", "Komsan", "Varthinee", "Jutamas", "Narumon", "Chomphunut", "Phannita")

    for(name in student.withIndex()){
        println(name)
    }
}
// kotlinc ex08.kt -include-runtime -d ex08.jar && java -jar ex08.jar