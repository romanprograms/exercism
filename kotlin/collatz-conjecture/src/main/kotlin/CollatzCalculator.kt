object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        var newStart = start
        var steps  = 0
        while(newStart != 1) {
            if (newStart.rem(2) == 0) {
                newStart /= 2
            } else {
                newStart = 3 * newStart + 1
            }
            steps++;
        }

        return steps;
    }
}
// Fancy
//object CollatzCalculator {
//
//
//
//    fun computeStepCount(n: Int): Int {
//
//        require(n > 0) { "Only natural numbers are allowed" }
//
//
//
//        return computeStepCount(n, 0)
//
//    }
//
//    private tailrec fun computeStepCount(n: Int, count: Int): Int =
//
//        when {
//
//            n == 1     -> count
//
//            n.isEven() -> computeStepCount(n / 2, count + 1)
//
//            else       -> computeStepCount(3 * n + 1, count + 1)
//        }
//}
//fun Int.isEven() = this % 2 == 0