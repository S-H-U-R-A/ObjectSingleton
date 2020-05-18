//Singleton basicamente es un objeto que solo se puede instanciar una vez
class ClaseUniversal {
    companion object{
        public fun create(): ClaseUniversal = ClaseUniversal()
    }
}