package range.containsrange
import org.junit.jupiter.api.Test
import org.amshove.kluent.shouldBeEqualTo

/*
    Given two ranges, implement a function which checks if range1 contains range2
 */

private fun containsRange(range1: IntRange, range2: IntRange): Boolean {
    val start1 = range1.start
    val last1 = range1.last

    val start2 = range2.start
    val last2 = range2.last

    return (start1 <= start2 && last1 >= last2)
}

private class Test {
    @Test
    fun `5-7 range contains 5-7`() {
        containsRange(5..7, 5..7) shouldBeEqualTo  true
    }

    @Test
    fun `1-12 range contains 5-7`() {
        containsRange(1..12, 5..7) shouldBeEqualTo true
    }

    @Test
    fun `12-17 range contains 12-14`() {
        containsRange(12..17, 12..14) shouldBeEqualTo true
    }

    @Test
    fun `12-17 range contains 15-17`() {
        containsRange(12..17, 15..17) shouldBeEqualTo true
    }

    @Test
    fun `5-7 range contains 1-12`() {
        containsRange(5..7, 1..12) shouldBeEqualTo false
    }

    @Test
    fun `5-8 range contains 5-9`() {
        containsRange(5..8, 5..9) shouldBeEqualTo false
    }

    @Test
    fun `5-8 range contains 3-5`() {
        containsRange(5..8, 3..5) shouldBeEqualTo false
    }
}