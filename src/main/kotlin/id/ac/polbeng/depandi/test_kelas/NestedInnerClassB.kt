package id.ac.polbeng.depandi.test_kelas

fun main(){
    var programmer: Human = object : Human{
        override fun think(){
            print("I am example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

interface Human{
    fun think()
}