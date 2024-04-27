package integer.getodd

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
Instructions
    Give a list of integers return a list of that contains only odd integers ( only integers which are not a multiple of 2 )
 */

private fun filerOdd(list:List<Int>): List<Int> {
    if(list.isEmpty()) return emptyList()
    return list.filter { it % 2 != 0 }.toList()
}

private class Test {
    @Test
    fun `empty list returns empty list`() {
        filerOdd(listOf()) shouldBeEqualTo emptyList()
    }

    @Test
    fun `1 2 3 return 1, 3`() {
        filerOdd(listOf(1, 2, 3)) shouldBeEqualTo listOf(1, 3)
    }

    @Test
    fun `2, 9, 2, 5, 4 returns 9, 5`() {
        filerOdd(listOf(2, 9, 2, 5, 4)) shouldBeEqualTo listOf(9, 5)
    }

    @Test
    fun `7, 4, 6, 8, 7, 9 returns 7, 7, 9`() {
        filerOdd(listOf(7, 4, 6, 8, 7, 9)) shouldBeEqualTo listOf(7, 7, 9)
    }
}