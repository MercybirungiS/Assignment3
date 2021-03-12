fun main(){
    school()
    println(identity("Hope",15) )
    println(name("mercy") )
    whoIam("Mercy")
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
    var myName=word.length
    return myName
}
fun whoIam(name:String){
    var name="That's me"
    if (name==name ){
        println("That's me!")
    }
    else{
        println("i do not know who that is ")
    }



}
