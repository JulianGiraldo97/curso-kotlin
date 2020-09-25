fun main() {
    //darNombre()
    //darApellido()
    //darEdad()
    //darFuncionConParametros("julian", "Giraldo", 23)
   print(add(2,3))
}

fun darNombre(){
    print("Julian")
}
fun darApellido(){
    print("Giraldo")
}
fun darEdad(){
    print("Tengo 23 años")
}

/**
 * Funcion con parametros de entrada
 */
fun darFuncionConParametros(name : String , apellido : String , edad : Int){
    print("me llamo $name $apellido y tengo $edad años")

}

/**
 * funcion con parametros de salida
 */
fun add(firsNumber: Int, secondNumber: Int) : Int{
    return firsNumber + secondNumber
}