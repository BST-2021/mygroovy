----------- Fuente : C:\Users\0019109\Desktop\Groovy\my_archivo_generado.groovy---------
--------------------------------------------
----------- Fuente : C:\Users\0019109\Desktop\Groovy\script1 Clourse.groovy---------
class MyFirstClass{
    public static void  main(String[] args) {
        System.out.println("Hola mundo Grrovy")
    }
}

def dd = { p ->
println p;
println p.class.name
}

def something = 1
dd(something)
println dd.class.name

something = 1.0
println something;
println something.class.name

something = "Esto es una cadena"
println something;
println something.class.name

--------------------------------------------
----------- Fuente : C:\Users\0019109\Desktop\Groovy\script1 regex.groovy---------
import java.util.regex.Pattern
import java.util.regex.Matcher

List names = ["Joegre", "Bruno","Daniela","Yarinelis"];

Map people = [bruno:44, yari:37]

//Expreciones regulares en Groovy
 
String mesg = 'Este textos para test regex'
/*
def pattern = ~'test'
def matcher = mesg =~ 'test'


assert pattern instanceof Pattern
assert matcher instanceof Matcher

if (matcher) {
    println "Contiene el text"
}else{
    println "No Contiene el text"
}

//Groovy
def pattern = /test/
if (mesg =~pattern) {
    println "Contiene el text"
}else{
    println "No Contiene el text"
}

def movilRegex = /(\d{3})-(\d{3})-(\d{4})/

List moviles = [
    '123-569-9632',
    '154-321-2587',
    '1234-254-254'
]

moviles.each {movil ->
assert movil ==~ movilRegex
}
*/
class Person {

    String name
    int age
    String movil

   void setMovil(String movil){
        if (movil ==~ /(\d{3})-(\d{3})-(\d{4})/ ){
          this.movil = movil;
          return;
        }        
        throw new RuntimeException('Movil invalido');
   }

}

Person person = new Person ()
person.with {
    name = "Bruno"
    age = 44
    movil = "152-254-1236"

}

println person.movil
--------------------------------------------
----------- Fuente : C:\Users\0019109\Desktop\Groovy\script1 Truth.groovy---------
class Person {

    String name
    int age

    boolean asBoolean() { age > 18  }

    String toString() { name }

}

/* groovylint-disable-next-line CompileStatic */
Person person = new Person()
person.with {
    name = 'Bruno'
    age = 12
}
//person = null

//println person ? person : "La persona en menor de edad"

println person ?: 'La persona en menor de edad'

assert person.name.contains('t')
--------------------------------------------
----------- Fuente : C:\Users\0019109\Desktop\Groovy\script1.groovy---------
import groovy.io.FileType

File archivo = new File('C:/Users/0019109/Desktop')

File dir = new File('C:/Users/0019109/Desktop/Groovy/')

File readme = new File('C:/Users/0019109/Desktop/Groovy/readme.md')

File outputFile = new File ('C:/Users/0019109/Desktop/Groovy/my_archivo_generado.groovy')
def outputDriWriter = outputFile.newPrintWriter();

/*
archivo.eachFile{
    println it.name
}
// it solo es C:\Users\0019109\Desktop\auditar.xlsx
//it.name es : auditar.xlsx
*/
//devuelve una lista con el nombre y extencion de los archivos
//println archivo.list()

List<String> nombreArchivos = []
List<String> nombreDir = []

String[] str = readme as String[]
println "este es readme : $str "


String regex = /.*\.groovy/
/*
dir.eachFile{ a ->
    if (a.isFile()){
        nombreArchivos << a.name
    }
}

dir.eachFileMatch(~regex) { a ->
        nombreArchivos << a.name
    }
*/
dir.eachFileMatch(~regex) { a->     
        //println a.name
        // escribir en archivo de salida
        outputDriWriter.println "----------- Fuente : ${a.getPath()}---------"
        a.eachLine { l->
        outputDriWriter.println l
        }
        outputDriWriter.println "--------------------------------------------"

    }

outputDriWriter.close()

//como filtrs por directorios con la clase FileType(DIRECTORIES, FILES, ANY)
archivo.eachFile(FileType.DIRECTORIES){ d ->
nombreDir << d.name
}

//nombreDir = dir.list() - nombreArchivos
//println "Archivos: $nombreArchivos"
println "Directorios: $nombreDir"

String lines = readme as String[]
println lines

byte[] contentBytes = readme.bytes
println contentBytes

--------------------------------------------
----------- Fuente : C:\Users\0019109\Desktop\Groovy\script1_ciclos.groovy---------
List names = ["Joegre", "Bruno","Daniela","Yarinelis"];
/*
//Forma clasica
for (int i = 0; i < names.size(); i ++){
    println names[i]
}

for (String name in names){
    println "Aqui esta mejor:  $name"
}
*/

Map people = [bruno:44, yari:37]
/*
for (i in 'aa'..'az'){
    println i
}

for (i in people) {
    
    println "${i.key} - ${i.value}"
}*/

//clourse
/*
names.each{ //o pongo yo el var p -
    println it
}

names.each{ name ->
    println name
}

people.each{ 
    println "${it.key} - ${it.value}"
}

people.each{ r->
    println "${r.key} - ${r.value}"
}

people.each{ llave, valor ->
    println "${llave} - ${valor}"
}

('A'..'D').each { r ->
    println r
}

"Ejemplo de ciclo con string".each{
    println "${it}-${it.class.name}"
}


1.step(10,2){println it}

10.step(1,-2){println it}
*/
1.upto(10){println it}

10.downto(1){println it}
--------------------------------------------
