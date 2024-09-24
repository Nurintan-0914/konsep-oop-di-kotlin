//package id.ac.polbeng.depandi.test_kelas
//
////child class (initializes the parent class)
//class LaptopB : Computer{
//    val batteryLife: Double
//
//    //calls super() to initialize the parent class
//    constructor(name: String, brand: String, batteryLife: Double): super(name, brand){
//        this.batteryLife = batteryLife
//    }
//
//    //Calss another constructor (which calls super())
//    constructor(name: String, brand: String): this(name, brand, 0.0){
//
//    }
//
//    fun info(){
//        println("Name : $name")
//        println("Brand : $brand")
//        println("Battery life : $batteryLife")
//    }
//}
//
//fun main(){
//    val myLaptop = LaptopB("Asus Think Pad", "Asus")
//    println(mylaptop.info())
//}