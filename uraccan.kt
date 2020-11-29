class Persona (var nombre:String, var apellido:String)

fun main(){
    var lista_personas = ArrayList<Persona>() 

    var Estudiante = Persona ("Eliezer", "Hernandez",)
    var Profesores = Persona ("Elias", "Lopez")
    var Administrativos = Persona ("Pablo", "Catedra")

    lista_personas.add(Estudiante)
    lista_personas.add(Profesores)
    lista_personas.add(Administrativos)
    for( e in 0..2)
    {
        println(" Estudiantes : ${lista_personas[e].nombre} ${lista_personas[e].apellido} ")
        println("Profesores : ${lista_personas[e].nombre} ${lista_personas[e].apellido} ")
        println(" Administrativos: ${lista_personas[e].nombre} ${lista_personas[e].apellido} ")
    }
}