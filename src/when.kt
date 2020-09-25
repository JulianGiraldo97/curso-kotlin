fun main() {
    obtenerMes(8)
}

fun obtenerMes(mes: Int){
    when(mes){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> {
            print("no coresponde a ningún mes del año")
        }
    }

}