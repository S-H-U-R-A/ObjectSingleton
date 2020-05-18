//Se puede crear un objeto singleton
object Validaciones{

    /*public fun passwordValida(psw: String): Boolean{
        // Esta es la forma normalita que se usaria
        /*if(psw.length > 0 && psw.length > 10){
            return true
        }else{
            return false
        }*/

        //Eliminando la estructura if
        //return psw.length > 0 && psw.length > 10

        //Recordar que en kotlin everything es un objeto
        //Entonces es mejor para esta compacion usar
        //el metodo .isNotEmpty()
        return psw.isNotEmpty() && psw.length > 10

    }*/

    //Ejemplo de la anterior funcion pero ahora en una sola linea
    public fun passwordValida(psw: String) =  psw.isNotEmpty() && psw.length > 10

    /*public fun esNumero(dato: Any){
        //Ejemplo simplificando un if por nosotrtos
        //if(dato is Int) true else false

        //Simplificado por kotlin
        dato is Int
    }*/

    //Simplificando la funcion anterior
    public fun esNumero(dato: Any) = dato is Int


}