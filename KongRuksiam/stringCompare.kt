// String compare
fun main(args: Array<String>) {
    var str1 = "namchok"
    var str2 = "NAMCHOK"

    if(str1.equals(str2, true)){ // True not care Capital
        print("same")
    }else{
        print("not same")
    }
}