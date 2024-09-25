package id.ac.polbeng.depandi.test_kelas

private class privateExample {
    private val i = 1
    private fun doSomething(){
        println("welcome to psrivate access!")
        println("private access : $i")
    }

    fun calldoSomething(){
        doSomething();
    }
}

open class C(){
    protected val i = 1
}

class D : C(){
    fun getValue() : Int{
        println("welcome to protected access")
        return i
    }
}

class internalExample{
    internal val i = 1
    internal fun doSomething(){
        println("welcome to internal accsess!")
        println("Internal access : $i")
    }
}

class publicExample{
    val i=1
    fun doSomething(){
        println("welcome to public access")
        println("public access : $i")
    }
}

fun main (){
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}