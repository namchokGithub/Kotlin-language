
class Student {
    public var name: String = ""
    public var score: Double = 0.0
    public var grade: String = ""

    constructor(){}

    constructor(name:String, score:Double){
        this.name = name
        this.score = score
    }

    public fun print(){
        println("${this.name} grade ${this.grade}")
    }

    public fun calculateGrade(){
        if(this.score>=80){
            this.grade = "A"
        }else if(this.score>=75){
            this.grade = "B+"
        }else if(this.score>=75){
            this.grade = "B"
        }else if(this.score>=75){
            this.grade = "C+"
        }else if(this.score>=75){
            this.grade = "C"
        }else if(this.score>=75){
            this.grade = "D+"
        }else if(this.score>=75){
            this.grade = "D"
        }else{
            this.grade = "F"
        }
    }
}

fun main(args: Array<String>) {

    var s1 = Student("Namchok", 100.0)
    var s2 = Student("Athiruj", 40.0)

    s1.calculateGrade()
    s2.calculateGrade()

    s1.print()
    s2.print()
}