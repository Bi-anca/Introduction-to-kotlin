package arrays

fun main(args: Array<String>) {
//Array is a collection of similiar data types either of
//Int,string etc .Array in kotlin is mutable in
//nature with fixed size which means we can perform
//both read and write operations on elements of array.
//You can declare an array explicity and implicity
//use the array function to create an array


//declaring an array implicity
    val country = "kenya"// array declaration implicit dec
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    val names = arrayOf("John","Mary","Paul","Mike")

//declaring an array implicity
    val county:String = "Nai"// array declaration implicit dec
    val nums = arrayOf<Int>(1,2,3,4,5,6,7,8)
    val majina = arrayOf<String>("John","Mary","Paul","Mike")


        //accessing array items
        //use index numbers
        println(numbers[0])
//      2.use get(), takes the index number as a argument
    println(majina.get(2))


//    creating an array using factory functions
    val cars = intArrayOf(1,2,3,4,5,6,7,8)
    val isTrue = booleanArrayOf(true,false)

//    changing array values :use set() method
//    set() method takes two argument:one is the index of the
//    value you want to change ,the other arg is the value to
//    replace with
    majina.set(1, "konny")
    println(majina.get(1))


    val num_names:Int = majina.size
    println(num_names)

//    looping through an array
    for(i in 0..num_names-1){
        println(majina.get(i))
        println(majina[i])
    }
    println(majina[1].length)//length function:returns number
//    of characters in a string

//fun countchar(name:string){
//    val x =name.length
//    println(x)
//}

}
