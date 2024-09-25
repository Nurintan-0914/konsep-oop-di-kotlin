package id.ac.polbeng.depandi.test_kelas

open class EmployeeF{
    open val baseSalary: Double = 10000.0
    open fun displayDetails(){
        println("i am an Employee")
    }
}

class Developer: EmployeeF(){
    override var baseSalary: Double = super.baseSalary + 10000.0
    override fun displayDetails(){
        super.displayDetails()
        println("i am a Developer")
    }
}

fun main (){
    val employeeF = EmployeeF()
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalary}")
    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    println(developer.displayDetails())
}