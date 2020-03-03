package Lesson1.lesson1
//kotlin code gets executed/run only in the main()
//main() function defines where kotlin code gets executed
//the {} defines the scope of your executable code
fun main() {
//    println():prints with a new line at the end
//    print() :prints content with continous line
    println("Hello World")
    println("Nichet")
    print("Nichet")
    print("Nichet")
    print("Nichet")
//explicitly defining the type of variables
    println()
    val country:String = "Kenya"//CONSTANT
    var county:String = "Nairobi"
    var age:Int = 18
    var gender :String
    gender = "Male"




    county = "UG"
    println(country)
    println(county)
    println(age)
//implicitly defining the type of variables
    val name = "John Doe"
    var language = "kotlin"
    println(name)
    println(language)

//      kotlin data types
//      1.numbers
//            1.1 Intergers:Non decimal numbers
    var my_age : Int =18
    println(my_age)
    my_age =my_age + 10
    println(my_age)
//            1.2 Floats:Intergers:decimal numbers
                val height = 3.56F

//      2.booleans:state true or false
                var isloggedin:Boolean = true
                var isloggedout:Boolean = false

//      3.strings
    var length:Int = 25
    var ruler:String = "Oxford"


    println("The length of the " + ruler+ " ruler is " + length + " cm ")
    println("The length of the $ruler ruler is $length cm ")
    println("")
//      4.characters:declared using single quotes
            val first_letter ='J'

//    Assignment ,create two variables num 1 and num 2 storing 10 and 20 respectively, and
//    calculate the sum of the two numbers
            var num1:Int = 10
            var num2:Int = 20
            println(num1 + num2)
//      5.arrays

}