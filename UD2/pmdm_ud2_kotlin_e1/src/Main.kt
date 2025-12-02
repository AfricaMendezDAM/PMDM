

fun main() {
    val listaPersonas = mutableListOf<Persona>()
    val p1: Persona= Persona ("Africa", 28)
    val p2: Persona
    val p3: Persona
    val p4: Persona

    p2 = p1.copy(age=2)
    p3 = p1.copy("Maribel")
    p4 = p1.copy()

    listaPersonas.add(p1)
    listaPersonas.add(p2)
    listaPersonas.add(p3)
    listaPersonas.add(p4)


}