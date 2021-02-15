package kotlinInAction.ch08

data class SiteVisit(val path: String, val duration: Double, val os: OS)

enum class OS{ WINDOWS, LINUX, MAC, IOS, ANDROID}

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/signup", 8.0, OS.IOS)
)

fun main() {
    // 복잡한 하드코딩 필터를 사용한 방문 데이터
    val averageMobileDuration = log.filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map (SiteVisit::duration)
        .average()
}

// 고차 함수를 사용해 중복 제거
fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()



