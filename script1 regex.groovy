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