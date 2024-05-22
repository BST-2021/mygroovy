// por defecto es un LinkedHasMap
def map = [:] 

def a= 'brunos'
def map1 = [(a):45] //para que evalue la variable a se debe poner en parenticis.

//formas de meter valores
map.put('name','Brunos') //la mas vieja
map['name']='Yari'//formas de insertar
map.age=44//formas de insertar

//formas de obtener
println map.get('age')
println map['age']
println map.age

println map1

def people =[:]
people << [name:'Brunos', age:44, username:'bsto']

println people

def people =[
    1:[name:'Brunos', age:44, username:'bsto'],
    2:[name:'Daniela', age:9, username:'dso']]

println people
println people.get(1)
println people.get(2)

//eliminar
//people.remove(1)
//people.minus (1:[name:'Brunos', age:44, username:'bsto']) // esto devuelve el mapas menos este registro.
//people.plus (1:[name:'Brunos', age:44, username:'bsto']) // esto devuelve la suma de los dos mapas.
//def m =people - [1:[name:'Brunos', age:44, username:'bsto']]// esto devuelve el mapas menos este registro.
def m1 =people + [3:[name:'Yehirisbel', age:15, username:'ybsa']]// esto devuelve la suma de los dos mapas.
println m1

def person = [name:'Brunos', age:44, username:'bsto']

//Devuelve tru o folsi si existen las llaves
println person.containsKey('age')// true si existe
println person.containsKey('email')//false si no existe

//Devuelve arreglo de llaves
println person.keySet()// devuelve un areglo de llaves
println person.size() // tamaño del mapa

person.each{
    println it
}

person.each{ e ->
    println "Key:${e.key} - value : ${e.value}"
}

def person = [name:'Brunos', age:44, username:'bsto']

//filtros
def filtro = person.find{ e -> e.value == 'Brunos'}// busca un elemento que la value se Brunos

def allEntries = person.findAll{e-> e.key.contains('m')//busca todos los registros que su key contenga la letra m

}
println allEntries

def people =[
    1:[name:'Brunos', age:44, username:'bsto'],
    2:[name:'Daniela', age:9, username:'dso'],
    3:[name:'Yehirisbel', age:15, username:'ybsa'],
    4:[name:'Yehirisbel', age:25, username:'ybsa']]

    //def names = people.collect{e-> e.value.name} //devuele todos lo name de los regostros
    //def names2 = people.collect([] as HashSet){e-> e.value.name} //devuele todos lo name distintos de los regostros

   // println names
   // println names2

    //agrupar

    //def grouped =people.groupBy{e -> e.value.age > 30}
    def grouped1 =people.groupBy{e -> e.value.name}//agrupa por el nombre
    //println grouped1

    //Orderna de mayor a menor porque esta el signo menos, esto solo funciona con los valores nuemericos
    def sorted = people.sort { 
        e-> -e.value.age
    }
    //Este ordena de mayor a menor o vosebersa e1 e2 A-Z y e2 e1 es de Z-a por el operador <=>
    def sorted1 = people.sort { 
        e1 , e2-> e2.value.name <=> e1.value.name
    }

    println sorted1








