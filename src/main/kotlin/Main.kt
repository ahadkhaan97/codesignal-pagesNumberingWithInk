fun main() {
    print(solution(1, 5))
}

@Suppress("NAME_SHADOWING")
fun solution(current: Int, numberOfDigits: Int): Int {
    var current = current
    var numberOfDigits = numberOfDigits

    while (numberOfDigits - current.toString().length >= 0) {
        numberOfDigits -= current.toString().length
        current++
    }

    return current - 1
}
