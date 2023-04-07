fun main() {
    naame()
    v("jane")
    jane(7)
    jane(4)
    jane(12)
    gramer()
    var human=Human("serah","female","black",72.2,50.9)
    human.rest("sleep eight hours")
    human.identity()
    var mybook=Book("Ngugi wa thiongo","Decolonise of mind",289,2013)
    println(mybook.author)
    h()
    var rectangle=Rectangle(20,30)
    rectangle.csre()
    numbers(arrayOf(12,34,2,35,75,23,12))
    var person=Person("camilla",18)
    println(person.name)
    println(person.age)
    numb(arrayOf(56,24,12,50,2,11))
    ann()
    ann()
    nu(arrayOf(1,2,3,4,5,6,7,8,9,10))
    age(12)
    age(20)
    age(70)
    days("Monday")
    days("Friday")
    days("Tuesday")
    numberss()

}
fun naame(){
    var x="serah"
    println(x[2])
    for (i in x)
        println(i)
}
fun v(namee:String){
    println(namee)
}
fun jane(num:Int){
    if (num==7){
        println("neutral")
    }
    else if (num<7){
        println("base")
    }
    else
        println("acidic")

}
fun gramer(){
    var names= arrayOf("anita b","adalab","hopperlab","rwanda","kenya","tanzania")
    println(names.map { it .capitalize() })
}
class Human(var name:String,var gender:String,var color:String,var height:Double,var weight:Double){
    fun rest(statement:String){
        println(statement)

    }
    fun identity(){
        var k =("am $gender and my name is $name")
        println(k)
    }
}
data class Book(var author:String,var tittle:String,var pages:Int,var year:Int){

}
fun h(){
    var s="vallary"
    println(s.reversed())
}
class Rectangle(var width:Int,var height:Int){
    fun csre(){
        var c =height*width
        println(c)
    }
}
fun numbers(num:Array<Int>){
    var p=0
    for (i in num)
        if (i%2 ==0){
            p+=i


        }
    println("$p")
}
class Person(var name:String,var age:Int){

}
fun numb(Numb:Array<Int>){
    println(Numb.sortedArray().contentToString())

}
fun ann(){
    print("enter your password: ")
    var password= readLine()
    if (password=="password123") {
        println("Access granted")

    }
    else
        println("Access denied")
}
fun nu(num:Array<Int>){
    for (l in num)
        println(l)
}
fun age(ages:Int){
    if (ages in 1..18) {
        println("you are not old enough to vote")
    }
    else if (ages in 19..65){
        println("you are eligible to vote")
    }
    else
        println("you are a senior citizen")
}
fun days(day:String){
    when(day){
        "Monday" -> println("Monday blues")
        "Friday" -> println("TGIF")
        else-> println("just another day")
    }
}
fun numberss(){
    for (mun in 1..100)
        if (mun%2 !=0)
            println(mun)
}
