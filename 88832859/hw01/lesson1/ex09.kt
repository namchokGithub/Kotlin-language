/*
 * Lesson01 : ex09
 * Name: Namchok Singhachai
 */
fun main(args: Array<String>) {
    var questions = mapOf("Who is your Team Leader" to "Namchok"
                            ,"Who is your Plan Manager" to "Varthinee"
                            ,"Who is your Development Manager" to "Kittisak"
                            ,"Who is your Quality Manager" to "Phannita"
                            ,"Who is your Support Manager" to "Narumon"
                        )

    for(q in questions){
       println("Question = ${q.key} \nAnswer = ${q.value}\n")
    }

}
// kotlinc ex09.kt -include-runtime -d ex09.jar && java -jar ex09.jar