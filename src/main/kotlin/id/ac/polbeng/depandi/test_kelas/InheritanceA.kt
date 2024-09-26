package id.ac.polbeng.depandi.test_kelas

//Parents class
open class Computer(val name: String,
                        val brand: String){

}

//chld class (initializes the parent class)
class Laptop(name: String,
            brand: String,
            val batteryLife: Double) : Computer(name, brand){
                fun info(){
                    println("Name : $name")
                    println("Brand : $brand")
                    println("Baterry Life : $batteryLife")
                }
            }
fun main(){
    val myLaptop = Laptop("acer aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}
