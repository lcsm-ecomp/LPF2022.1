
val pi = 3.14f





fun main() {
    var x: Int  = 10
    fun soma(a:Int, b:Int) : Int {
        fun produto(a:Int, b:Int) = a * b
        return a + b
    }

    println(x+1)    
    
    println("""
       o valor de x é "$x" 
       o seu sucessor é '${x+1}'
    """.trimIndent());    
    println("soma 2 e 3 = ${soma(2,3)}")

    for (y in 1..4) {
       for (x in 1..4)  
          print(" ($x,$y) ")
       println()
    }

}
