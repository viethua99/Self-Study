package com.vproject.study.language.kotlin

import java.util.concurrent.locks.Lock

/**
 * +------------------------+
 * | Higher-order Functions |
 * +------------------------+
 *
 * @definition: A function that takes another function as an argument
 * or returns one, or both.
 * @example: list.filter { x > 0 }
 *
 */
internal fun higherOrderFunctionPlayground() {
    // a lambda that takes two Int parameters and returns an Int value
    val sum1: (Int, Int) -> Int = { x, y -> x + y }
    val sum2 = { x: Int, y: Int -> x + y }

    // The return type of function type can be marked as nullable:
    val canReturnNull: (Int, Int) -> Int? = { _, _ -> null }

    // This is a nullable function type, it's different with canReturnNull example
    val funOrNull: ((Int, Int) -> Int)? = null

    // We pass a lambda to the higher-order function to calculate sum of the operation
    twoAndThree({ x, y -> x + y })

    // The parentheses can be removed if the lambda is the last argument of the high-order function
    twoAndThree { x, y -> x + y }

    // Analysis:
    // Step 1: twoAndThree method is called
    twoAndThree { x, y ->
        // Step 3: Get x, y values to calculate the result and return value
        x * y
    }

    "ab1c".filter { it in 'a' .. 'z' }

    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    val result = calculator(Order(3))
}

/**
 * The first example of a higher-order function, this function takes a lambda
 * as an argument.
 * @param operation This is a lambda that takes two Int parameters and returns an Int value.
 */
private fun twoAndThree(operation: (Int, Int) -> Int) {
    // Step 2: Start running code inside the operation lambda
    val result = operation(2, 3) // Step 4: Assign the value that operation returned to result value

    // Step 5: Print the final result
    println("The result is $result")
}

/**
 * The second example of a higher-order function, this is an extension function of
 * String class to filter the values
 * @param predicate This is a lambda that takes a Char parameter and returns a Boolean value.
 * @return return the result of filter string
 */
private fun String.filter(predicate: (Char) -> Boolean): String {
    val stringBuilder = StringBuilder()
    for (index in indices) {
        val element = get(index)
        if (predicate(element)) stringBuilder.append(element)
    }
    return stringBuilder.toString()
}

enum class Delivery { STANDARD, EXPEDITED }
class Order(val itemCount: Int)
/**
 * The third example of a higher-order function, this function takes a delivery type
 * as an argument and return another function.
 * @param delivery This is a normal enum class type.
 * @return return another function to calculate the cost
 */
private fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> 1.2 * order.itemCount }
}

/**
 * +------------------+
 * | Inline Functions |
 * +------------------+
 *
 * @motivation: Lambdas compiled to anonymous classes, that means every time you use a lambda, an extra class is created -> Bad performances.
 * @definition: When you declare a function as inline, its body is inlined,
 * that means it’s substituted directly into places where the function is called instead of being invoked normally.
 *
 */
// internal fun inlineFunctionPlayground() {
//    val lock = Lock()
//    println("Before sync")
//    synchronized(lock) {
//        println("Action")
//    }
//    println("After sync")
// }
// -------------- EQUIVALENT CODE ---------
// The equivalent code, which will be compiled to the same bytecode:
// internal fun __inlineFunctionPlayground__() {
//    val lock = Lock()
//    println("Before sync")
//    lock.lock()               |
//    try {                     |
//        println("Action")     | --> All the code inside the synchronized method
//                              | has been compiled directly, instead of creating
//    } finally {               | new anonymous class for the lambda
//        lock.unlock()         | NOTE: The inlining applied to the lambda and the implementation of the synchronized method
//    }                         |
//    println("After sync")
// }


// internal fun inlineFunctionPlaygroundWithArgument(body: () -> Unit) {
//    val lock = Lock()
//    println("Before sync")
//    synchronized(lock, body) // We pass the lambda as an argument to the inline function
//    println("After sync")
// }
// -------------- EQUIVALENT CODE ---------
// The equivalent code, which will be compiled to the same bytecode:
// internal fun __inlineFunctionPlaygroundWithArgument__(body: () -> Unit) {
//    val lock = Lock()
//    println("Before sync")
//    lock.lock()               |
//    try {                     |
//        body()                | --> The body lambda is not inlined
//                              |
//    } finally {               |
//        lock.unlock()         | NOTE: The inlining only applied to the implementation of the synchronized method
//    }                         |
//    println("After sync")
// }

private inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}