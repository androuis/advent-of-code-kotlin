fun main() {
    fun part1(input: List<String>) =
        input.map { it.toInt() }
            .zipWithNext { previous, current ->
                previous < current
            }.count { it }


    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
