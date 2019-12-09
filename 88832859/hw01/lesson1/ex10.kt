/*
 * Lesson01 : ex10
 * Name: Namchok Singhachai
 */
class Students {
    private var name: String = ""
    private var position: String = ""
    private var grade: String = ""
    private var score: Double = 0.0

    constructor(name: String, score: Double){
        this.name = name
        this.score = score
    }

    public fun getName() = this.name
    public fun getScore() = this.score
    public fun getPosition() = this.position
    public fun getGrade(): String{
        if(this.score>=80){ return "A" } else
        if(this.score>=75){ return "B+" } else
        if(this.score>=70){ return "B" } else
        if(this.score>=65){ return "C+" } else
        if(this.score>=60){ return "C" } else
        if(this.score>=55){ return "D+" } else
        if(this.score>=50){ return "D" } else { return "F" }
    }
} 
// Class Students

fun main(args: Array<String>) {
    var students: Array<Students> = arrayOf(Students("Namchok Singhachai",100.0)
                                            ,Students("Chatchalerm Wasuanunkul",90.0)
                                            ,Students("Kittisak Noidonpri",80.0)
                                            ,Students("Komsan Tesana",70.0)
                                            ,Students("Varthinee Tangthong",60.0)
                                            ,Students("Jutamas Saikaew",50.0)
                                            ,Students("Narumon Saribut",40.0)
                                            ,Students("Chomphunut Pitathawatcha",30.0)
                                            ,Students("Phannita Khanthasorn",20.0)
                                        )
    for(student in students){
        println("My name is ${student.getName()} I got ${student.getScore()} My grade is ${student.getGrade()}")
    }
    
}
// kotlinc ex10.kt -include-runtime -d ex10.jar && java -jar ex10.jar