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

    /**
     * obtiene trimestre
     */
    fun getMonth(month : Int){

        when (month) {

                1,2,3 -> print("Primer trimestre del año")

                4,5,6 -> print("segundo trimestre del año")

                7,8,9 -> print("tercer trimestre del año")

                10,11,12 -> print("cuarto trimestre del año")

        }
    }

    /**
     * obtiene semestre con in
     */
    fun obtenerMesIntervalo(mes: Int){
        when (mes){
            in 1..6 -> print("primer semestre")
            in 6..12 -> print("Segundo semestre")
            !in 1..12 -> print("no es un mes valido")
        }

    }

    /**
     * el metodo anterior pero guardando en una variable el resultado
     */
    fun resultado(mes: Int){
        val response : String = when(mes){
            in 1..6 -> "primer semestre"
            in 7..12 -> "Segundo semestre"
            !in 1..12 -> "no es un mes valido"
            else -> "error"
        }
    }

}