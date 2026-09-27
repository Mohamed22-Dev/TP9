fun main (){
    print("entrez note de premier exame")
    var note1 =
        readln().toDouble()
    print("entrez note de deuxieme exame")
    val note2 =
        readln().toDouble()
    print("entrez note de troisieme exame")
    val note3 =
        readln().toDouble()
    val moyene = (note1 + note2 + note3) / 2
    println("moyenne : %.2f%%".format(moyene))
    when {
        moyene>= 80 -> {
            println("Réussi avec mention excellente")
        }
    moyene>= 50 -> {
        println("Réussi")}
    else -> {
        println("Échoué")
        }

    }
    }