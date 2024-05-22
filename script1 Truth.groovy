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
