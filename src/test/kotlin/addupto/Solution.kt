package addupto

// Kotlin Idiomatic Solution
private object Solution1 {
    private fun addUpTo(n: Int): Int {
        return (1..n).sum()
    }
}

// Mathematical Solution
private object Solution2 {
    private fun addUpTo(n: Int): Int {
        return n* ((n+1)/2)
    }
}

// Iterative Solution
private object Solution3 {
    private fun addUpTo(n: Int): Int {
        var total = 0
        repeat(n+1) { total += it }
        return total
    }
}

// Iterative Solution
private object Solution4 {
    private fun addUpTo(n: Int): Int {
        var total = 0
        (0..n).forEach { total += it }

        return total
    }
}