package id.ac.polbeng.depandi.test_kelas

interface A{
    fun demo(){
        println("from Interface A")
    }
}

interface B{
    fun demo(){
        println("From interface B")
    }
}

class MyClassB: A, B{
    override fun demo(){
        super<A>.demo()
        super<B>.demo()
    }
}

fun main(){
    val obj = MyClassB()
    obj.demo()
}