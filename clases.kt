
class ImpresoraHola(var tam:Int)
{
fun imprimirHola() {
println("Hola mundo de kotlin!")
}
}
fun main()
{
    val impresora = ImpresoraHola(3)
    println(impresora.tam)
    impresora.imprimirHola() // imprime Hola!
   }

   
