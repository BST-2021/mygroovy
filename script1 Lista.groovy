//por defecto es una ArrayList
def list = [] as LinkedList

LinkedList list1 = []
//Lista de enteros
def intList = [1,2,3]

//Lista de string
def stringList = ['Hola','Wordls']

//Listas anidadas
def nesteList = [1,2,[3,4],5,6]

//def variadas
def varList = [2,['desarrollo'],2.5, [name:'Bruno']]
@groovy.transform.ToString
//Lista de Objetos
class Person {
    String name
    int age
}

List<Person> pepoleList = [[name:'Brunos', age: 44],[name:'Daniela',age:9],
                            [name:'Ana', age:12],[name:'Bea',age:9],[name:'Ana', age:12]]

println pepoleList.findAll {p-> p.age>9 } //devuelve una lista de personas de la lisa que cumplen la condición.D
println pepoleList
println pepoleList.unique()//elementos unicos 
println pepoleList.unique{ a,b-> a.age <=> b.age } //elementos unicos por una propiedad
println pepoleList.sort{it.name} //ordena por una propiedad
println pepoleList.reverse() // la muestra alreves
 Person person = pepoleList.find {it.name.startsWith('D')} //buscar un elemento segun el criterio, startsWith pilla el primero que encuentre
 println person

assert intList instanceof ArrayList
assert stringList instanceof ArrayList
assert nesteList instanceof ArrayList
assert varList instanceof ArrayList


println intList.getAt(2) // el indice 2
println intList[2] // el inidice 2
println intList[-1]//último
println intList.pop() // devuelve el primero y lo quita de la lista
println intList.size()// devuelve la cantidad de elemento de la lista

//agrega elemento a la lista
intList.add(5)
intList << 10 // se pueden pasra otros tipos de elementos 

//Buscar elementos en la lista
assert intList.contains(10)

//restar elementos de la lista
def list = [1,5,6,70,5,6]

//println list - [5,70]

println list.unique()//devuelve los elementos unicos del arreglo.


