import java.util.*

data class Account(val phoneNumber: String, val pin: String, var balance: Double = 4500.0)

class Nequi {
    private val scanner = Scanner(System.`in`)
    private lateinit var account: Account

    fun run() {
        println("Bienvenido a Nequi Colombia")
        login()

        var continueApp = true
        while (continueApp) {
            println("\nSaldo Disponible: ${account.balance}")
            println("Seleccione una opción:")
            println("1. Saca")
            println("2. Envía")
            println("3. Recarga")
            println("4. Salir")

            when (val option = scanner.nextInt()) {
                1 -> withdraw()
                2 -> sendMoney()
                3 -> recharge()
                4 -> {
                    println("Gracias por usar Nequi. Hasta pronto.")
                    continueApp = false
                }
                else -> println("Opción inválida.")
            }
        }
    }

    private fun login() {
        var attempts = 3
        while (attempts > 0) {
            println("\nIngrese su número de celular:")
            var phoneNumber = scanner.next()
            println("Ingrese su PIN de 4 dígitos:")
            var pin = scanner.next()


            account = Account(phoneNumber, pin)
            if (isValidCredentials()) {
                println("¡Bienvenido a Nequi!")
                return
            } else {
                attempts--
                if (attempts > 0) {
                    println("¡Upps! Parece que tus datos de acceso no son correctos. Tienes $attempts intentos más.")
                } else {
                    println("Lo siento, tus datos de acceso son incorrectos. Inténtalo más tarde.")
                    System.exit(0)
                }
            }
        }
    }

    private fun isValidCredentials(): Boolean {



            return true








    }

    private fun withdraw() {
        println("\nSeleccione una opción:")
        println("1. Cajero")
        println("2. Punto físico")

        when (val option = scanner.nextInt()) {
            1, 2 -> {
                if (account.balance < 2000) {
                    println("No te alcanza para hacer el retiro.")
                } else {
                    println("Ingrese el valor a retirar:")
                    val amount = scanner.nextDouble()
                    if (amount <= account.balance) {
                        account.balance -= amount
                        println("Retiro exitoso. Código de retiro: ${generateCode()}")
                    } else {
                        println("No tienes suficiente saldo para este retiro.")
                    }
                }
            }
            else -> println("Opción inválida.")
        }
    }

    private fun generateCode(): Int {
        return (100_000..999_999).random()
    }

    private fun sendMoney() {
        println("\nIngrese el número de teléfono al que desea enviar dinero:")
        val phoneNumberToSend = scanner.next()

        println("Ingrese el valor a enviar:")
        val amountToSend = scanner.nextDouble()

        if (amountToSend <= account.balance) {
            account.balance -= amountToSend
            println("Envío exitoso. Saldo restante: ${account.balance}")
        } else {
            println("No tienes suficiente saldo para enviar este monto.")
        }
    }

    private fun recharge() {
        println("\nIngrese el valor a recargar:")
        val rechargeAmount = scanner.nextDouble()

        println("¿Desea realizar la recarga? (s/n)")
        val confirm = scanner.next()

        if (confirm.equals("s", ignoreCase = true)) {
            account.balance += rechargeAmount
            println("Recarga exitosa. Saldo actual: ${account.balance}")
        } else {
            println("Recarga cancelada.")
        }
    }
}

fun main() {
    val nequi = Nequi()
    nequi.run()
}