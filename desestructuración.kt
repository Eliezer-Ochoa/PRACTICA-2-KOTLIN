fun main() {
    val mango = mango(1, "uno")
    val manzana= manzana(2,"dos")
    val (num, nombre) = mango
    val (num2, nombre2) = manzana

    println("numero = $num, nombre = $nombre")
    println("numero = $num2, nombre = $nombre2")
}

class Par<K, V>(val primerFruta: K, val segundoFruta: V) 
{
operator fun component1(): K
{
return primeroFruta
}
operator fun component2():
V
{
return segundoFruta
}
}