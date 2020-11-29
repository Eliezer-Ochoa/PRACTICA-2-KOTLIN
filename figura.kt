
open class Figura 
{     
open fun Dibujar() 
{      
println("Soy una figura") 
} 
} 
class Cuadrado:Figura() 
{   
override fun Dibujar() 
{     
println("Soy un cuadro") 
} 
} 
class Circulo:Figura() 
{
override fun Dibujar() 
{
println("Soy un circulo") 
}
}
class Triangulo:Figura() 
{
override fun Dibujar() 
{
println("Soy un triangulo") 
} 
    
} 

class Rectangulo:Figura() 
{
override fun Dibujar() 
{
println("Soy un rectangulo") 
} 


} 
fun main()
{
var lista_figuras = ArrayList<Figura>() 
var cuadro = Cuadrado() 
var circulo = Circulo() 
var triangulo = Triangulo() 
var rectangulo = Rectangulo()
lista_figuras.add(cuadro) 
lista_figuras.add(circulo)
lista_figuras.add(triangulo) 
lista_figuras.add(rectangulo)
for(fig in lista_figuras) 
{  
fig.Dibujar() 
} 
}
