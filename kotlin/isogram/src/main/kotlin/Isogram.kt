object Isogram {
    fun isIsogram(input: String) = input.toLowerCase()
        .filter(Char::isLetter)
        .let { it.toSet().size == it.length }
}