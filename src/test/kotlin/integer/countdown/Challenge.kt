package integer.countdown

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
    Given positive integer n implement a function which returns a list containing all steps from n to 0
 */

private fun countDown(n: Int): List<Int> {
    if(n == 0) return listOf(0)

    val result = mutableListOf<Int>()
    return (n downTo 0).toList()
}

private class Test {
    @Test
    fun `Count Down 0`() {
        countDown(0) shouldBeEqualTo listOf(0)
    }

    @Test
    fun `count down 1`() {
        countDown(1) shouldBeEqualTo listOf(1, 0)
    }

    @Test
    fun `count down 5`() {
        countDown(5) shouldBeEqualTo listOf(5, 4, 3, 2, 1, 0)
    }
}