class noe {
}
fun main(){
    var alea=(1..4).random()
    print("Digite el Valor de su compra para ver si ceunta con descuenta o no")
    var valC = readLine()!!.toInt();
    if(valC >= 50000)
        when(alea){
            1 -> {print("El lanzamiento arrojo resultado de  bolita roja");
                var descuento=(valC*10)/100;
                var t=valC-descuento;
                print("El descuento fue $descuento lo que quiere decir total de su compra es $t")}
            2 -> {
                print(" El lanzamietno arrojo resultado de la bolita azul")
                var descuento=(valC*30)/100;
                var t=valC-descuento;
                print("El descuento fue $descuento lo que quiere decir total de su compra es $t")}
            3 -> {print("El lanzamiento arrojo  bolita amarilla");
                var descuento=(valC*50)/100;
                var t=valC-descuento;
                print("El descuento fue $descuento lo que quiere decir total de su compra es $t")}
            4 -> {print("EL tesultafo arrojo  la bolita blanca");
                print(" Se lleva la compra es gratis")}
        }
    else{
        print(" sin descuento valor de la compra $valC")
    }
}