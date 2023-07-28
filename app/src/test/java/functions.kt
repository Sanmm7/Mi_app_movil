import kotlin.system.exitProcess

class functions {

}
fun printhello(){
    println("Hello word")
}
fun perimetrociculo(){
    println("Digite el radio del circulo: ")
    var a:Double= readLine()!!.toDouble();
    var total: Double =2*3.14*a
println(" el perimetro del circulo es $total")

}
fun  areacirculo(){
    println("Digite el radio del cicculo: ")
    var a:Double= readLine()!!.toDouble()
    var total:Double= 3.1415*(a*a)
    println("El area del circual es: $total")
}
fun perimetrotri(lado1:Double,lado2:Double,lado3:Double): Unit{
    var total: Double =lado1+lado2+lado3
    println("El perimetro del triangulo es $total")

}
fun tipodetri(lado1:Double,lado2:Double,lado3:Double): Unit{

    if (lado1 === lado2 && lado2 === lado3) {
        println("El triángulo es equilátero");
    } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
        println("El triángulo es isósceles");
    } else {
        println("El triángulo es escaleno");
    }

}
fun areatri(base:Double,altura:Double): Unit{
    var total: Double =(base*altura)/2
    println("El total del area es $total")

}
fun arearec(b:Double,a:Double): Double {
    var total: Double =a*b
     return total
}
fun perirec(b:Double,a:Double): Double {
    var total: Double =b+b+a+a
    return total
}

fun main() {
    //FUNCION POR EXPRESION
    /*val temperatura=20
    val caliente=if(temperatura>40) true else false
        print (caliente)*/
    var i: Int = 1
    while (i == 1) {
        println("Digite la 1.para sacar el perimetro, 2.para sacar el area ,3.para sacar el perimetro del triangulo y el tipo de triangulo, 4.para sacar el area, 5.Area para rectangulo, 6 para Permimetro del triangulo: ")
        var b: Int = readLine()!!.toInt();

        if (b == 1) {
            perimetrociculo()
        }
        if (b == 2) {
            areacirculo()

        }
        if (b == 3) {
            println("Digite el lado 1 del triangulo: ")
            var l1: Double = readLine()!!.toDouble()
            println("Digite el lado 2 del triangulo: ")
            var l2: Double = readLine()!!.toDouble()
            println("Digite el lado 3 del triangulo: ")
            var l3: Double = readLine()!!.toDouble()
            perimetrotri(l1, l2, l3)
            tipodetri(l1,l2,l3)
        }
        if (b == 4) {
            println("Digite la base del triangulo: ")
            var b: Double = readLine()!!.toDouble()
            println("Digite la altura del triangulo: ")
            var a: Double = readLine()!!.toDouble()
            areatri(b, a)

        }
        if(b==5){
            println("Digite base  del rectangulo: ")
            var base: Double = readLine()!!.toDouble()
            println("Digite la altura del  rectangulo: ")
            var altura: Double = readLine()!!.toDouble()
            var total=arearec(base,altura)
            println("el area del triangulo $total")
        }
        if(b==6){
            println("Digite base  del rectangulo: ")
            var base: Double = readLine()!!.toDouble()
            println("Digite la altura del  rectangulo: ")
            var altura: Double = readLine()!!.toDouble()
            var total=perirec(base,altura)
            println("el area del triangulo $total")

        }
        if(b>6) {
            println("Seleccion no valida")
        }
        println("Digite 1.para volver a hacer el proceso, 2.para salir: ")
        i = readLine()!!.toInt()

    }
}
