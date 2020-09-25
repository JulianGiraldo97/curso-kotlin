fun main() {
    // así se crea un array y se le asignan valores
    val diasSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println(diasSemana.get(0))
    println(diasSemana.get(1))
    println(diasSemana.get(2))
    println(diasSemana.get(3))
    println(diasSemana.get(4))
    println(diasSemana.get(5))
    println(diasSemana.get(6))

    if (diasSemana.size >= 8){
        println(diasSemana.get(7))
    }else{
        println("no tiene mas parametros el array")
    }

    //Para modificar un array es el siguiente
    diasSemana.set(0, "Horrible lunes")
    diasSemana.set(4, "por fin viernes")

    //Para recorrer un array usamos un for
    for ((posicion, valor) in diasSemana.withIndez()){
        println("la posicion $posicion contiene el valor $valor")
    }
}