fun foo(x: Any?, y: Any?) = 0L

inline fun test(value: Any?): Long {
    return foo(null, value ?: return 1L)
}

fun box(): String {
    val t = test(null)
    return if (t == 1L) "OK" else "fail: t=$t"
}