
class RelogioI(var hora:Int, var minutos:Int) {
    override fun toString() : String {
        return "Hora($hora : $minutos)";
    }
    fun copia() : RelogioI { 
        return RelogioI(hora,minutos)
    }
}


fun tick(r:RelogioI) {
    r.minutos++
    if (r.minutos>=60) {
        r.minutos -= 60
        r.hora++
        if (r.hora>=12) {
            r.hora -= 12
        }
    }
}

class RelogioF(val hora:Int, val minutos:Int) {
    override fun toString() : String {
        return "Hora($hora : $minutos)";
    }
    
}
fun tick(r:RelogioF):RelogioF {
    if (r.minutos < 59)
       return RelogioF(r.hora, r.minutos+1)
    else if (r.hora<11)
       return RelogioF(r.hora+1, 0)
    else 
       return RelogioF(0,0)
}

    
fun main2() {
    var h1 = RelogioF(10,59)
    println("h1 = $h1")
    h1 = tick(h1)
    println("h1 = $h1")
    //println("h2 = $h2")
    
}

fun main() {
    var h1 = RelogioF(10,59)
    var h2 = h1
    println("h1 = $h1")
    println("h2 = $h2")
    h1 = tick(h1)
    println("tick h1 ")
    println("h1 = $h1")    
    println("h2 = $h2")    
}


