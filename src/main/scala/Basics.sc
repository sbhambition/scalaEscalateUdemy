println("hell")

Array(1,2,3).foreach(println)
val a = Array(1,2,3)
for(i<-  a) println(i)

val s = List("hell","high", "water")

def max(a:Int, b:Int) :Int = if(a>b) a else b
max(3,4)

def greet() = println("hello world")
greet

//unlike in recursive function, where compiler cannot infer the return type
def greet1= {println("hello")}
greet1
//something has a side effect , use no curly braces
//val a1 = "Subash"
//println(s"hello how r you doing $a1")

//if is an expression
//while a loop,
//var v =  4


// a for without  a yield becomes a foreach , arg is the name
//used in the function literal

val greetStrings = new Array[String](3)

greetStrings(0) = "hello"
greetStrings(1) = ","
greetStrings(2) = "world!]\n"

for(i<- 0 to 2) print(greetStrings(i))


//All operations are method calls

1+2
1.+(2) //we are actually invoking + method

"hello".charAt(3)
"hello" charAt 3
//use infix rule instead, since we have only one parameter passed to charAt

val nums = Array (1,2,3,4)
val nums1 = Array.apply(1,2,3,4)

//Consing list

val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo:::threeFour
"subash"::oneTwo
















