class Product{
    public var name: String 
    public var price: Int

    constructor(){
        this.name = ""
        this.price = 0
    }
    constructor(name: String, price: Int){
        this.name = name
        this.price = price
    }

    public fun product_show(){
        println("Name: ${this.name} Price: ${this.price}")
    }

}

fun main(args: Array<String>) {
    val p1 = Product("Money", 100)
    p1.product_show();
}