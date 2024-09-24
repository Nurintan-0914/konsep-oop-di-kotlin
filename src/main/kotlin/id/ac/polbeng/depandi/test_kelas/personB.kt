package id.ac.polbeng.depandi.test_kelas

class PersonB(_firstName: String, _lastname: String, _age: Int){
    var firstName:String = _firstName
    var lastName:String = _lastname
    var age: Int = _age
}

fun main(){
    val budi = PersonB("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}