class Persona (var nombre:String, var apellido:String)

fun main(){
    var lista_personas = ArrayList<Persona>() 

    var persona = Persona ("Eliezer", "Hernandez")
    var nueva = Persona ("Elias", "Lopez")
    var nueva1 = Persona ("Pablo", "Catedra")

    lista_personas.add(persona)
    lista_personas.add(nueva)
    lista_personas.add(nueva1)
    for( e in 0..2)
    {
        println("nombre : ${lista_personas[e].nombre} ${lista_personas[e].apellido} ")
    }

}
