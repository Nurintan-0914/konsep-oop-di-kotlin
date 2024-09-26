package id.ac.polbeng.depandi.test_kelas

data class Student(val name: String, val age: Int)
fun main (){
    val boni = Student ("Boni", 21)
    val meri = Student ("Meri", 20)
    println("Student Name is : ${boni.name}")
    println("Student age is : ${boni.age}")
    println("Student name is : ${meri.name}")
    println("Student age is: ${meri.age}")
}