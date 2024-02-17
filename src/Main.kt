
fun main(args: Array<String>) {
//    val x = 2
//    when (x) {
//        1 -> print("x = 1")
//        2 -> print("x = 2")
//        else -> {
//            print("x is neither 1 or 2")
//        }
//    }
//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items) {
//        println(item)
//    }
//
//    for (index in items.indices) {
//        println("item at $index is ${items[index]}")
//    }
//
//    var x = 10
//    for (x in 1..3) {
//        println(x)
//    }
//
//    val notNullText : String = "Rider Kick"
//    val nullableText1 : String? = "Might be null"
//    val nullableText2: String? = null
//
//    fun funny(text: String?) {
//        if (text != null) {
//            println(text)
//        } else {
//            println("Nothing to print :(")
//        }
//    }
//
//    funny(notNullText)
//
//    fun funnier(text: String?) {
//        val toPrint = text ?: "Nothing to print :("
//        println(toPrint)
//    }
//
//    funnier(nullableText2)
//
//    val a: String? = "Kotlin"
//    val b: String? = null
//    println(a?.length)
//    println(b!!.length)
    fun fizzbuzz(num: Int) {
        print("Received $num: ")
        if (num % 3 == 0) {
            print("fizz ")
        }
        if (num % 5 == 0) {
            print("buzz ")
        }
        println()
    }

    fizzbuzz(15) // fit but
    fizzbuzz(6) // fit
    fizzbuzz(20) // but
    fizzbuzz(0) // nothing
}
