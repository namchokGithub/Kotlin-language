// When Expression

fun main(args: Array<String>) {
    var number = 3
    
    when(number){
        1 -> print("One")
        2 -> print("Two")
        else -> print("Else")
    }

    var string = "men"

    when(string){
        "men" -> print("Men")
        "women" -> print("Women")
    }
}