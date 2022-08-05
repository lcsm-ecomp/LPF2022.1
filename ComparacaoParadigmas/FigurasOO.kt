abstract class Figura {
    abstract fun area():Float 
    abstract fun perimetro():Float
}

class Circulo(var r:Float) : Figura {
    override fun area() : Float { return 3.14f*r*r }
    override fun perimetro() : Float { return 2*3.14f*r }
    
}
class Retangulo(var w:Float, var h:Float) : Figura {
    override fun area() : Float { return w*h }
    override fun perimetro() : Float { return 2*(w+h) }

}
