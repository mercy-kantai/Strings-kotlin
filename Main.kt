fun main() {

printName("Sam","Smith")
    greetings("Mercy")
    sentence("Mercy",2005,"plumber")
    position("Avocado")
    getfruitlength("Avocado")
    number("0722283354")
    word("Nairobi","nairobi")
    blank(""," ")
    myName(" patience ")
    function("A big stone hit the big bird")


}
fun printName(name:String,lname:String){
    val fullName = "$name $lname"
    println(fullName)

}
fun greetings(name:String){
    println("Hello $name")
}
fun sentence(name:String,year:Int,word:String){
    println("$name, born in $year is a $word")
}
fun position(fruit:String){
   println(fruit[5])
    println(fruit.first())
    println(fruit.last())
    println(fruit.lastIndexOf("o"))


}
fun getfruitlength(fruit: String){
    //println(fruit.length)
}
fun number(phone:String){
    println(phone.lastIndexOf("2"))
}
fun word(city:String,town:String){
    println(city==town)
    println(city.equals(town))
    println(city.uppercase())
    println(city.lowercase())

}
fun blank(emptyString: String,blankString: String){
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(emptyString.isBlank())
    println(blankString.isBlank())
}
fun myName(name:String){
    println(name)
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())

}
fun function(sent:String){
    println(sent.replace("g","b"))
    println ( sent.split(""))
    println(sent.split("i"))
}



