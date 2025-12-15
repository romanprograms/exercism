val codonAminoAcidMap = mapOf(
    "AUG" to "Methionine", "UUU" to "Phenylalanine",
    "UUC" to "Phenylalanine", "UUA" to "Leucine", "UUG" to "Leucine", "UCU" to "Serine",
    "UCC" to "Serine", "UCA" to "Serine",
    "UCG" to "Serine", "UAU" to "Tyrosine", "UAC" to "Tyrosine", "UGU" to "Cysteine",
    "UGC" to "Cysteine", "UGG" to "Tryptophan", "UAA" to "STOP", "UAG" to "STOP", "UGA" to "STOP"
)

fun translate(rna: String?): List<String> {
    var codons = mutableListOf<String>()

    var tmpCodon = StringBuilder()

    if (rna != null) {
        for (char in rna) {
            if (tmpCodon.length == 3) {
                if (!codonAminoAcidMap.containsKey(tmpCodon.toString())) {
                    throw IllegalArgumentException("Invalid codon")
                }
                if (codonAminoAcidMap.getValue(tmpCodon.toString()) == "STOP") {
                    tmpCodon = StringBuilder()
                    break;
                }
                codons.add(tmpCodon.toString())
                tmpCodon = StringBuilder()
            }
            tmpCodon.append(char)
        }
        if ( tmpCodon.isNotBlank() && !codonAminoAcidMap.containsKey(tmpCodon.toString())) {
            throw IllegalArgumentException("Invalid codon")
        }
        if (tmpCodon.isNotBlank() && codonAminoAcidMap.getValue(tmpCodon.toString()) != "STOP") {
            codons.add(tmpCodon.toString())
        }
    }
    val proteins = codons.map{codon -> codonAminoAcidMap.getValue(codon)}
    return proteins
}
