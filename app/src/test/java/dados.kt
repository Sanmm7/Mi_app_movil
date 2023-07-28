import java.util.*

class dados {
}

fun main() {
    println("¡Bienvenido a Craps! Lanza dos dados para jugar.")
    val scanner = Scanner(System.`in`)
    var playAgain = true

    while (playAgain) {
        println("Presiona Enter para lanzar los dados...")
        scanner.nextLine()

        val dice1 = rollDice()
        val dice2 = rollDice()

        val total = dice1 + dice2
        println("Has obtenido: $dice1 y $dice2 (total: $total)")

        when (total) {
            2, 12 -> println("¡Felicidades! Ganaste con un total de $total.")
            3, 11 -> println("¡Felicidades! Ganaste con un total de $total.")
            7 -> println("¡Felicidades! Ganaste con un total de $total.")
            1 -> println("¡Felicidades! Ganaste con un par de unos.")
            else -> println("Lo siento, has perdido.")
        }

        println("¿Quieres jugar de nuevo? (s/n)")
        val answer = scanner.nextLine()
        playAgain = answer.equals("s", ignoreCase = true)
    }
}

fun rollDice(): Int {
    return (1..6).random()
}