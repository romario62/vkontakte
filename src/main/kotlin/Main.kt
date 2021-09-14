fun main(){
    val amount = 45000000
    val percent = 0.0075
    val tax = if (amount * percent > 3500 ) amount * percent else 3500
    println("Total amount $tax")
}