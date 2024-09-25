package id.ac.polbeng.depandi.test_kelas

open class Mahasiswa(var nama: String, var nrp: Int){
    open fun info(){
        println(nama + '\n' + nrp);
    }
    override fun toString(): String{
        return "Mahasiswa{nama = $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp){
    override fun info(){
        println(nama + '\n' + nrp +'\n' + jurusan);

    }
}

fun main (){
    val budi = Mahasiswa("Budi Gunawan", 1106123)
    val anton = KetuaHima("Anton", 1106789, "teknik informatika")
    println(anton.toString());

    println()
    anton.info()
    println("Jenis kelas = " + budi.javaClass.simpleName)
    val ucok = KetuaHima("Ucok", 1105239, "teknik elektro")
    println()
    ucok.info()
    println("Jenis kelas = " + ucok.javaClass.simpleName)
}