fun main() {
    val likes: Int = 25;
    var result: String = "людей";

    if (likes % 10 == 1 || likes % 100 == 12 || likes % 100 == 13 || likes % 100 == 14) {
            result = "человек"
    }
      else if  (likes % 10 == 2 || likes % 10 == 3 || likes % 10 == 4) {
            result = "человека"
    }
    else {
        result = "людей"

    }
    println(result);

}


