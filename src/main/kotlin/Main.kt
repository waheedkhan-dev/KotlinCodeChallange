fun main() {
    val input = "The cat and the hat."
    val wordCounts = countUniqueWords(input)

    for ((word, count) in wordCounts) {
        println("$word: $count")
    }
}

private fun countUniqueWords(input: String): Map<String, Int> {
    val wordCounts = mutableMapOf<String, Int>()

    // Split the input string into words while ignoring punctuation and converting to lowercase
    val words = input.split(Regex("\\W+")).filter { it.isNotBlank() }.map { it.lowercase() }

    // Count the occurrences of each unique word
    for (word in words) {
        wordCounts[word] = wordCounts.getOrDefault(word, 0) + 1
    }

    return wordCounts
}