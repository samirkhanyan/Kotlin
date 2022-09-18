import java.util.*

fun main()
{
    val reader = Scanner(System.`in`)
    println("enter enter the numbers")

    val first: Int = reader.nextInt()
    val second: Int = reader.nextInt()
    println("what do you want??(+, -, *, /)")
    val op = reader.next()[0]
    var res = 0
    if (op == '+') {
        res = first + second }
    else if (op == '-') {
        res = first - second }
    else if (op == '*') {
        res = first * second }
    else if (op == '/') {
        res = first / second }
    else {
        println("invalid operation") }
    println("result is $res")
}
