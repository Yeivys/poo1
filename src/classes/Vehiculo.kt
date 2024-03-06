package classes
class Vehiculo{
    var color:String = ""
        get() = field
        internal set
    var marca:String = ""
        get() = field
        internal set
    var modelo:String = ""
        get() = field
        internal set
    var placas:String  = ""
        get() = field
        internal set
    var encendido:Boolean = false
        get() = field
        private set(value) {
            field = value
        }
    var gasolina:Double  = 0.0
        get() = field
        private set(value) {
            field = value
        }

    fun encender() {
        if (!encendido) {
            encendido = true
            println("El vehículo ha sido encendido.")
        } else {
            println("El vehículo ya está encendido.")
        }
    }

    fun apagar() {
        if (encendido) {
            encendido = false
            println("El vehículo ha sido apagado.")
        } else {
            println("El vehículo ya está apagado.")
        }
    }

    fun recargar(litros: Double) {
        gasolina += litros
        println("$litros litros han sido añadidos al tanque.")
    }

    fun checarEstado() {
        println("Estado del vehículo:")
        println("->Encendido: $encendido")
        println("->Cantidad de gasolina: $gasolina litros")
    }

    fun gastarGasolina(){
        gasolina--
        println("Se ha gastado 1 de gasolina")
    }

    fun gastarGasolina(cantidad:Int){
        gasolina-=cantidad
        println("Se ha gastado $cantidad de gasolina")
    }
}