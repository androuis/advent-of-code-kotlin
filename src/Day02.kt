fun main() {
    fun part1(input: List<String>): Int {
        var direction = 0
        var depth = 0
        input.map { it.split(" ") }.forEach {
            when (it[0]) {
                "forward" -> direction += it[1].toInt()
                "up" -> depth -= it[1].toInt()
                "down" -> depth += it[1].toInt()
            }
        }
        return direction * depth
    }

    fun part2(input: List<String>): Int {
        var direction = 0
        var depth = 0
        var aim = 0
        input.map { it.split(" ") }.forEach {
            when (it[0]) {
                "forward" -> {
                    val value = it[1].toInt()
                    direction += value
                    depth += aim * value
                }
                "up" -> aim -= it[1].toInt()
                "down" -> aim += it[1].toInt()
            }
        }
        return direction * depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
