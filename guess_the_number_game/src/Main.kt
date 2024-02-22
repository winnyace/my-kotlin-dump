import kotlin.system.exitProcess

fun main() {
    var guessesRemaining = 5
    var currentGuess: Int
    val number: Int = (0..20).random()
    println("Guessing the number game!")
    println("Guess the number between 0 and 20.")
    do {
        print("\nTake a guess: "); currentGuess = readln().toInt()
        if (currentGuess == number) {
            print("\n\nCorrect! The number was $number")
            exitProcess(0)
        }
        print("\nNo, that's not it. My current is ")
        if (currentGuess > number)
            println("smaller than my current number")
        else
            println("bigger than my current number")
        guessesRemaining--
        println("You have $guessesRemaining guesses left.")
    } while (guessesRemaining != 0)
    println("Sorry. You couldn't guess my number. My number was $number. Better luck next time!")
}