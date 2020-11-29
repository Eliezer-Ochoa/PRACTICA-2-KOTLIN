/* 
class Persona{
    var nombre:String = ""
    var apellido:String = ""
    constructor()
    {
    }
    constructor(n:String, a:String):this()
    {
    nombre=n
    apellido=a
    }
   }
   fun main()
   {
    var persona = Persona("Eliezer","Hernandez")
    var nueva = Persona()
    nueva.nombre = "Juan"
    nueva.apellido = "Lopez"
    println(persona.nombre)
    println(nueva.nombre)
   }
*/

   fun main(){
    class Persona(var nombre:String, var apellido:String)
    var persona = Persona("Eliezer","Hernandez")
    println(persona.nombre)
    println(persona.apellido)
   }
  