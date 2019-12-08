// Function

fun main(args: Array<String>) {
    add(12, 12)
    add(1, 9)

    println("Max: " + max(12,23))

    message("Test mesage")
}

fun add(a: Int, b: Int){
    println("Result: " + (a+b))
}

fun max(a: Int, b: Int): Int = if(a>b) a else b

fun message(text: String){
    print(text)
}