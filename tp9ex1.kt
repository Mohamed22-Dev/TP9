fun main(){
    println("entrez un nombre 1")
    val n1: Int =
     readln().toInt()
    println("entrez un nombre 2")
    val n2: Int =
    readln().toInt()
    println("addition ${n1 + n2}")
    println("la Soustraction ${n1 - n2}")
    println("la Multiplication ${n1 * n2}")
    if (n2 != 0) {
        println("la Division ${n1 / n2}")
    }
    else{
        println("error")
    }
    if (n1 > n2){
        println("le nombre 1 est superiore")
    }
    else{
        println("le nombre 2 est superiore")
    }
    if (n1 % 2 == 0){
        println("le nombre est pair")
    }
    else {
        println("le nombre impaire")
    }

}