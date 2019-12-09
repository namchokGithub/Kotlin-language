/*
 * Lesson01 : ex07
 * Name: Namchok Singhachai
 */
class Students {
    private var name: String = ""
    private var position: String = ""
    private var grade: String = ""

    constructor(name: String, grade: String, position: String){
        this.name = name
        this.grade = grade
        this.position = position
    }

    public fun getName() = this.name
    public fun getGrade() = this.grade
    public fun getPosition() = this.position
} 
// Class Students

class Team{
    private var teamName: String = ""
    private var teamMember: Array<Students>

    constructor(teamMember: Array<Students>){
        this.teamMember = teamMember
    }

    public fun memberShow(){
        for(member in this.teamMember){
            println("${member.getName()} || Grade: ${member.getGrade()}")
        }
    }

    // Function Quality manager
    public fun findQM(){
        for(member in this.teamMember){
            when(member.getPosition()){
                "Quality manager" -> println("${member.getName()}")
            }
        }
    }
}
// Class Team

fun main(args: Array<String>) {

    var student: Array<Students> = arrayOf(Students("Namchok Singhachai","A","Team Leader")
                                            ,Students("Chatchalerm Wasuanunkul","A","Planner")
                                            ,Students("Kittisak Noidonpri","A","Development manager")
                                            ,Students("Komsan Tesana","A","Developer")
                                            ,Students("Varthinee Tangthong","A","Plan manager")
                                            ,Students("Jutamas Saikaew","A","Quality assurance")
                                            ,Students("Narumon Saribut","A","Support manager")
                                            ,Students("Chomphunut Pitathawatcha","A","Supporter")
                                            ,Students("Phannita Khanthasorn","A","Quality manager")
                                        )
    var team2 = Team(student)

    team2.findQM()
}
// kotlinc ex07.kt -include-runtime -d ex07.jar && java -jar ex07.jar