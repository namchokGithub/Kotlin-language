/*
 * Lesson01 : ex04
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
    var product2 = Products()
    product.setProduct("Pen", 10.0)
    product2.setProduct("Pencil", 5.0)
    product.productShow()
    product2.productShow()
}
// kotlinc ex04.kt -include-runtime -d ex04.jar && java -jar ex04.jar