fun main() {
    val likes: Int = 21;
    var result: String = "люди";

    if (likes % 10 == 1 && likes % 100 !== 11) {
            result = "человеку"
    }
    else {
        result = "людям"

    }
    println("Понравилось " + likes + " " + result);

}


