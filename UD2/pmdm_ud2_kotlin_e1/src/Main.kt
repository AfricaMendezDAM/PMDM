

fun main() {
    val listaPersonas = mutableListOf<Persona>()
    val p1: Persona= Persona ("Africa", 28, 1399.46)
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

    listaPersonas.filter({persona: Persona -> persona.age >= 18}).forEach({persona: Persona-> println(persona)})

    listaPersonas.filter({persona: Persona -> persona.name.lowercase().startsWith("m")})

    listaPersonas.map {p: Persona -> p.salario }

    val sumaSalarios = listaPersonas.map{ p:Persona -> p.salario}
        .reduce{total, salario -> total + salario} //no se por que pero entiende total sin declararla previamente
    println("sumaSalarios: $sumaSalarios")


}