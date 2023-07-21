
class Ciclos {
}
fun main() {
var contp:Int=0
    var coni:Int=0
    var acumpare:Int=0
    var acumim:Int=0


    var i: Int = 1

    while(i==1) {
        print("Digite un numero: ")
        var a:Int= readLine()!!.toInt();
        if (a <= 0) {
          continue

        } else {
            var mod:Int=a%2
        if (mod==0){
            contp=contp+1
            print("Es par $a")
            acumpare=acumpare+a
            println()
        }
            else{
                print("Es impar $a")
                coni=coni+1
                acumim=acumim+a
                println()
            }

        }
        print("Desea ejecutar otra vez 1-si, 2-no")
        i= readLine()!!.toInt()
    }
    if (contp!=0 || coni!=0) {
        print("Hay esta cantidad de numero pares: $contp y suman  $acumpare")
        println()
        print("Hay esa cantidad de numeros impares:  $coni y suman  $acumim")

    }
    else{

        print("Sin numero negativos o 0")
    }
}