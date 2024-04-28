package addupto

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
    Given positive integer `n` implement a function which calculates sum of all numbers from 1 to up to ( Including ) number `n`.
 */

private fun addUpTo(n: Int): Int {
    return (n * ( n + 1) / 2)
}

private class Test {
    @Test
    fun `add up to 1`() {
        addUpTo(1) shouldBeEqualTo 1
    }

    @Test
    fun `add up to 3`() {
        addUpTo(3) shouldBeEqualTo 6
    }

    @Test
    fun `add up to 10`() {
        addUpTo(10) shouldBeEqualTo 55
    }
}


fun main() {
    val arr = intArrayOf(1,2,3,4,5)
    val result = arr.reversed().toIntArray()
}
