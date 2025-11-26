object EliudsEggs {

    fun eggCount(number: Int): Int{
        val stringOfBits = number.toString(2);
        return stringOfBits.count { it == '1'}
    }
}
