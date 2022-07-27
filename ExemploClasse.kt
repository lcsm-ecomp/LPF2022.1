
class Ponto(val x:Float, val y:Float)

class Rect(val p1:Ponto, val p2:Ponto)


open class Pessoa(val nome:String, val idade:Int) {
   open fun imprimeM() {
      println("pessoa $nome idade $idade")
   }
}
open class Estudante(nome:String, idade:Int, val curso:String) 
      : Pessoa(nome,idade) {
   override fun imprimeM() {
      println("estudante $nome idade $idade que faz $curso")
   }
}

class EstudantePos(nome:String, idade:Int, curso:String,val grad:String) 
    : Estudante(nome,idade,curso) {

    }

fun imprimeP(p:Pessoa) {
   if (p is Estudante) {
      println("estudante ${p.nome} idade ${p.idade} que faz ${p.curso}")   
   } else
      println("pessoa ${p.nome} idade ${p.idade}")
}
fun imprimeP2(p:Pessoa) {
   when (p) {
      is Estudante -> println("estudante ${p.nome} idade ${p.idade} que faz ${p.curso}")   
      else -> println("pessoa ${p.nome} idade ${p.idade}") 
   }
}

val p = Pessoa("joao",25)
val e = Estudante("maria",20,"Computação")
fun main2() {
   p.imprimeM()
   imprimeP(p)
   e.imprimeM()
   imprimeP(e)
}

var p2 : Pessoa? = null//Pessoa("pedro",30)

fun main() {
   println(p2?.nome)
}
