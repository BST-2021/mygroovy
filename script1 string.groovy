def mesg = "Anita lava la tina"

def reverse = mesg.reverse()

def cleanString = {str ->
str.replace(' ','')
}
assert cleanString(mesg).equalsIgnoreCase(cleanString(reverse))

println """
    Mensaje : $mesg
    Reversa : $reverse
    ---------------------------
    Mensaje Clean : ${cleanString(mesg)}
    Reversa Clean : ${cleanString(reverse)}
"""