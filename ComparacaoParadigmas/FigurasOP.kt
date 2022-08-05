
abstract class Figura
class Circulo(var r:Float) : Figura
class Retangulo(var w:Float, var h:Float) : Figura

fun area(f:Figura):Float {
    when (f) {
      is Circulo -> return 3.14f*f.r*f.r
      is Retangulo -> return f.w * f.h
      else -> return 0f
    }
}
fun perimetro(f:Figura):Float {
    when (f) {
      is Circulo -> return 2f*3.14f*f.r
      is Retangulo -> return 2*(f.w + f.h)
      else -> return 0f
    }
}
