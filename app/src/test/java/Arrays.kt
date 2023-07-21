class Arrays{

}
fun main(){
var pets= arrayOf("dog","cat","canary")
    print(pets.contentToString())
    println()
    print(pets[1])
    pets[2]=("Parrot")
    println()
    print(pets.contentToString())
    println()
for ((index, elements) in pets.withIndex()) {
    print(" la mascota en la pocision  $index  es  $elements\n")
}
    var instruments =   mutableListOf("trumpet","piano","violin")
      var instrumentos:List<String> = listOf("trumpet","pienano","violin")
    print(instruments)
    println()
    print(instruments)
    println()
    print(instruments[1])
    instruments[2]=("PIANOS")
    print(instruments)
    println()
    //primero
    print(instruments.first())
    println()
    //ultimo
    print(instruments.last())
    //agregar
    instruments.add("loslocos")
    print(instruments)
    //remover index
    instruments.removeAt(1)

    println(instruments)
    //buscar
    println(instruments.find{it == "trumpet"})
    instruments.remove("tru")
    //borrar lista completa
    instruments.clear()
    println()
    print(instruments)

}

