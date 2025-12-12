class Dna (val dnaSequence: String) {
    init {
        require(dnaSequence.all { c -> c in "ACGT" })
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val result =  mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0 )
            dnaSequence.forEach { char ->
                if (result.contains(char)) {
                    result[char] = result.getValue(char) + 1
                }
            }
            return result
        }
}
