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

