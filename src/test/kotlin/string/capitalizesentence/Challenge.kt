package string.capitalizesentence

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun capitalizeSentence(str: String): String {
    return str.split(" ")
        .joinToString(" ") {
            s -> s.replaceFirstChar { it.uppercase() }
        }
}

private class Test {
    @Test
    fun `"flower" is capitalized to "Flower"`() {
        capitalizeSentence("flower") shouldBeEqualTo "Flower"
    }

    @Test
    fun `"this is a house" is capitalized to "This Is A House"`() {
        capitalizeSentence("this is a house") shouldBeEqualTo "This Is A House"
    }
}

fun main() {
    val str = "this is a house"
    val result = capitalizeSentence(str)
    println(result)
}