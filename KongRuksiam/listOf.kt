//  ListOf

fun main(args: Array<String>) {
    var student = listOf("Namchok", "Namchok2", "Namchok3")

    for(name in student){
        print("${name} ")
    }

    for(name in student.withIndex()){
        print("${name} ")
    }
}