package functions

//parameter in between the brackets after calling a function

//a block f code that has a specific task e.g println()
//fun nameOfFunction(){
    //      code to execute
//}
    fun greetings1() {
        println("Hello World")
    }
    fun greetings2(name:String){
        println("Hello $name")
    }
    fun greetings3(name:String,age:Int){
        println("Hi I am  $name ,$age years old")
    }

fun main(args: Array<String>) {
//    to call a function use greetings1()
//    MUST be in the main function
    greetings1()
    println("Hello once again")
    greetings2( "John")//"John is an argument"
    greetings3("John" , 23)//"John is an argument"

    //functions that take an argument
//    parameter:a variable passed into a function during function
    //creation
    }
fun volume(radius:Int, height:Int){
    val p : Float = 3.142F
    val volume = p * height * radius *radius
    print("The volume is $volume")
}