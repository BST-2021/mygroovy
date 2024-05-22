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

