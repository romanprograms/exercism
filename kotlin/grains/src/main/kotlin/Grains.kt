import java.math.BigInteger

val MAX_SQUARE_NUMBER = 64

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require(number in 1..MAX_SQUARE_NUMBER) { "Square number must be between 1 and $MAX_SQUARE_NUMBER" }
        return BigInteger.TWO.pow(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        var total = BigInteger.ZERO;
        for (i in 1..MAX_SQUARE_NUMBER) {
            total += getGrainCountForSquare(i)
        }

        return total;
    }
}
