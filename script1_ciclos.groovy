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
