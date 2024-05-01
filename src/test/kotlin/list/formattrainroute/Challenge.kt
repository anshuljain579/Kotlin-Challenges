package list.formattrainroute

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
    Given list of strings representing train station names implement a function which will return passenger friendly String:
        1. String always starts with `Train is calling at`
        2. If list contains single train station name, then return `Train is calling at stationName`.
        3. If list contains multiple train station names, then return comma separated station names but the last two names are separately by `and` word.
 */

private fun formatTrainRoute(stations: List<String>): String {
    var str = ""
    stations.forEach {
        str += when(it) {
            stations.first() -> it
            stations.last() -> " and $it"
            else -> ", $it"
        }
    }
    return "Train is calling at $str"
}

private class Test {
    @Test
    fun `formatTrainRoute list 'Luton'`() {
        formatTrainRoute(listOf("Luton")) shouldBeEqualTo  "Train is calling at Luton"
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden'`() {
        formatTrainRoute(listOf("Luton", "Harpenden")) shouldBeEqualTo "Train is calling at Luton and Harpenden"
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden', 'London'`() {
        val list = listOf("Luton", "Harpenden", "London")
        formatTrainRoute(list) shouldBeEqualTo "Train is calling at Luton, Harpenden and London"
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden', 'St Albans', 'London'`() {
        val list = listOf("Luton", "Harpenden", "St Albans", "London")
        formatTrainRoute(list) shouldBeEqualTo "Train is calling at Luton, Harpenden, St Albans and London"
    }
}