import kotlin.math.sqrt

object Darts {
    fun score(x: Number, y: Number /* choose proper types! */): Int {
       val distance = sqrt(x.toDouble() * x.toDouble() + y.toDouble() * y.toDouble())
        return when (distance) {
            in 0.0..INNER_CIRCLE_RADIUS -> 10
            in INNER_CIRCLE_RADIUS..MIDDLE_CIRCLE_RADIUS -> 5
            in MIDDLE_CIRCLE_RADIUS..OUTER_CIRCLE_RADIUS -> 1
            else ->  0
        }
    }
}

private const val INNER_CIRCLE_RADIUS = 1.0
private const val MIDDLE_CIRCLE_RADIUS = 5.0
private const val OUTER_CIRCLE_RADIUS = 10.0




//import kotlin.math.hypot
//
//
//
//
//
//
//
//
//
//
//object Darts {
//
//
//
//
//
//    fun score(x: Number, y: Number): Int {
//
//
//
//
//
//        val distance = hypot(x.toDouble(), y.toDouble())
//
//
//
//
//
//
//
//
//
//
//        return when {
//
//
//
//
//
//            distance <= 1 -> 10
//
//
//
//
//
//            distance <= 5 -> 5
//
//
//
//
//
//            distance <= 10 -> 1
//
//
//
//
//
//            else -> 0
//
//
//
//
//
//        }
//
//
//
//
//
//    }
//
//
//
//
//
//}
//
//
//
//