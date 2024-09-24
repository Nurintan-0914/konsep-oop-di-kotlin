package id.ac.polbeng.depandi.test_kelas

open class Teacher{
    open fun teach(){
        println("Teaching...")
    }

    fun info (){
        println("I'am a Teacher.")
    }
}

class MathsTeacher : Teacher(){
    //Must use "overide" modifier to override a base class function
    override fun teach(){
        println("teaching Maths...")
    }
}

fun main (){
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}