object Bob {
    fun hey(input: String): String {
       return when  {
            input.trim().isEmpty() -> "Fine. Be that way!"
            input.uppercase() == input && input.trim().isNotEmpty() -> "Whoa, chill out!"
            input.trim().endsWith("?") -> "Sure."
            else -> "Whatever."
        }
    }
}
