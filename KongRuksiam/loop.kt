//  Loop & Range

fun main(args: Array<String>) {
    var number = 1..5

    for(num in number){
        print("${num} ")
    }

    println("\n-------------------------------")
    
    var number1 = 10 downTo 5

    for(num in number1){
        print("${num} ")
    }

    println("\n-------------------------------")
    
    var number2 = 10 downTo 5

    for(num in number2.reversed()){
        print("${num} ")
    }

    println("\n-------------------------------")
    
    var number3 = 10 downTo 1

    for(num in number3 step 2){
        print("${num} ")
    }

    println("\n-------------------------------")
    
    var number4 = 1 until 20

    for(num in number4 step 2){
        print("${num} ")
    }

    println("\n-------------------------------")
    
    var string = 'A'..'D'

    for(num in string){
        print("${num} ")
    }
    print(string.count())
}