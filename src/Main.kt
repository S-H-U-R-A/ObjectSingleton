import java.lang.NumberFormatException
import javax.xml.bind.ValidationEvent

fun main(args: Array<String>) {

    println("Ingresa tu contraseña: ")
    //Leer de la consola
    val password: String = readLine()?.toString() ?: ""
    println(Validaciones.passwordValida(password))

    println("\nIngresa cualquier cosa: ")
    try {
        val numero: Any = readLine()?.toInt() ?: ""
        println(numero)
        println(Validaciones.esNumero(numero))
    }catch (e: NumberFormatException){
        println("Error: $e")
    }

    val claseUniversalEnMain: ClaseUniversal = ClaseUniversal.create()

}

fun prueba(){
    val claseUniversalData: ClaseUniversal = ClaseUniversal.create()
}