fun main(){
   school()
    println(identity("Faith",15) )
    println(name("Christine") )
    (whoIam("Hope") )
    (whoIam("Mercy") )

}
fun school(){
    var school="akirachix"
    var a=school [0]
    var b=school [3]
    var c=school [4]
    println("$a$b$c")
}
fun identity(x:String ,y:Int ):String {
    return "Hi, my name is $x and i am $y years old "
}
fun name(word:String):Int {
    return    word.length

}
fun whoIam(name:String){
    if (name=="Mercy"){
        println("That's me!")
    }
    else{
        println("i do not know who that is ")
    }
}

