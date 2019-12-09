/*
 * Lesson01 : EX03
 * Name: Namchok Singhachai
 */
class Products{
    private var name: String = ""
    private var price: Double = 0.0

    public fun setProduct(name: String, price: Double){
        this.name = name
        this.price = price
    }

    public fun productShow(){
        println("Name: ${this.name} Price: ${this.price}")
    }
}
// Class products

fun main(args: Array<String>) {
    var product = Products()
    product.setProduct("Pen", 10.0)
    product.productShow()
}
// kotlinc ex03.kt -include-runtime -d ex03.jar && java -jar ex03.jar