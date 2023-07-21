class consesionarioArray {
}
fun main(){
    var i:Int=1
    var cars = mutableListOf("mazda")

    while (i==1) {
        println("Digite 1 para registrar, 2.para mostar los autos,3.Buscar auto,4 para modificar,5 para eliminar el auto")
        var a: Int = readLine()!!.toInt();
        if (a == 1) {
            println("Digite la marca del auto")
            var carrito = readLine()
            val found = cars.any { carrito == it }
            if (found == true) {
                println("No pude registar un auto que ya existe")
            } else {
                cars.add(carrito.toString())
                println("Se registro el carro")

            }
        }
        if (a == 2) {
            print(cars)
        }
        if (a == 3) {
            println("Digite el auto que desa buscar")
            var carrito = readLine()
            val found = cars.any { carrito == it }
            if (found == true) {
                println("El auto $carrito ya existe ")
            } else {
                cars.add(carrito.toString())
                println("El auto $carrito no existe ")

            }


        }
        if (a == 4) {
            println("Digite la marca que desea modificar")
            val marca = readLine()
            val index = cars.indexOfFirst { it == marca }
            if (index != 1) {
                print("Digita la nueva marca: ")
                val nmarca = readLine()
                cars[index] = nmarca.toString()
                println("Se modifico exitosamente")
            }
        }
        if (a == 5) {
            println("Digite el auto que desea eliminar")
            val marca = readLine()
            val index = cars.indexOfFirst { it == marca }
            if (index != 1) {
                cars.removeAt(index)
                println("Se elimo exitosamente")
            }


        }
        if (a == 6) {
            cars.clear()
            println("se elimo exitosamente")

        }
        println("Desa hacer otro proceso")
        print("Desea ejecutar otra vez 1-si, 2-no")
        i = readLine()!!.toInt()
    }
}




