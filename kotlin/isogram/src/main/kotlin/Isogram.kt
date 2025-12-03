object Isogram {

    fun isIsogram(input: String): Boolean {
        val map = mutableMapOf<Char, Boolean>();
        for (char in input) {
            if (map.contains(char.lowercaseChar()) && char.isLetter()) return false
            else map[char.lowercaseChar()] =  true
        }
        return true
    }
}
