fun main() {
    fun part1(input: List<String>): Int {
        val pair = input.map { it.toCharArray().map { it.toString().toInt() } }
            .reduce { sums, list -> sums.mapIndexed { index, i -> i + list[index] } }
            .map { it > input.size / 2 }
            .fold("" to "") { gamaEpsilonPair, isOneMostCommon ->
                if (isOneMostCommon) {
                    gamaEpsilonPair.copy(gamaEpsilonPair.first + "1", gamaEpsilonPair.second + "0")
                } else {
                    gamaEpsilonPair.copy(gamaEpsilonPair.first + "0", gamaEpsilonPair.second + "1")
                }
            }
        return pair.first.toInt(2) * pair.second.toInt(2)
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
