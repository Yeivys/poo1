import classes.Persona
import classes.Vehiculo

fun main() {
    // Crear un objeto de classes.Vehiculo y setear los datos de tu coche
    val miCoche = Vehiculo()
    miCoche.modelo="Civic"
    miCoche.placas="HYAK JAS"
    miCoche.color="Azul"
    miCoche.marca="Honda"


    // Checar si el coche está encendido, encender el coche y volver a checar
    miCoche.checarEstado()
    miCoche.encender()
    miCoche.checarEstado()

    // Verificar el nivel del tanque, recargar unos cuantos litros y después volver a consultar
    println("Nivel del tanque antes de recargar: ${miCoche.gasolina} litros")
    miCoche.recargar(5.0)
    println("Nivel del tanque después de recargar: ${miCoche.gasolina} litros")
    miCoche.gastarGasolina()
    println("Nivel del tanque después de gastar gasolina: ${miCoche.gasolina} litros")

    // Crear un objeto de Person y setear los datos
    val persona = Persona("Juan", "Perez", "Masculino", 1.75)
    println("\nDatos de la persona:")
    println("Nombre: ${persona.nombre}")
    println("Apellidos: ${persona.apellidos}")
    println("Sexo: ${persona.sexo}")
    println("Altura: ${persona.altura} metros")
}