fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 9)
    for(number in numbers){
        if (number%3==0)
            print("$number \t")
    }
}