package Kotiln_Youtube_Study

/*null처리와 동일성의 확인*/

/*
*  ?. <- null safe operator
*  ?: <- elvis operator
*  !!. <- non-null assertion operator
*
*  ?. 연산자는 참조연산자를 실행하기 전에 객체가 null인지 확인하고 객체가 null이라면 뒤의 구문을 실행하지 않는다.
*  ex ) sample?.toUpperCase()
*  ?: 연산자는 객체가 null이 아니라면 그대로 사용하지만 null이라면 연산자 우측의 객체로 대체되는 연산자
*  ex ) sample?:"default"
*  !!. 연산자는 참조연산자를 사용할 때에 null여부를 컴파일시 확인하지 않도록 하여 런타임시 널 포인터 익셉션이 나도록 의도적으로 방치하는 연산자
* */

/* 동일성
* 내용의 동일성, 객체의 동일성
* 내용의 동일성 객체의 동일성
*  == / ===
* */

fun main(){
    var a:String?=null
    var b:String="a"

    println(a?.toUpperCase()) //null
    println(a?:"default".toUpperCase()) //DEFAULT
   // println(a!!.toUpperCase()) //nullPointerException

    println(b?.toUpperCase())//A
    println(b?:"default".toUpperCase())//a
    println(b!!.toUpperCase())//A

    /*?. 연산자는 스코프함수와 사용하면 편리*/

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

    var c=Product("콜라",1000)
    var d=Product("콜라",1000)
    var e=c

    var f=Product("사이다",1000)

    println(c==d) //true
    println(c === d) //false

    println(c==e) //true
    println(c===e) //true

    println(c==f) //false
    println(c===f) //false
}
/*질문해보자 .. 내용의 통일성 객체의 통일성이 내가 주석에 달아놓은대로가 맞는지  ... */
class Product(var name:String,var price:Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){ //내용의 통일성을 확인하는 부분 why? Product객체라면 if문 안으로 들어가기 때문  / Product 부분이 Product자료형을 말하는건지 Product객체를 말하는건지 헷갈림
            return other.name == name && other.price == price //같은객체라면 같은지 다른지 판단
        }else{//서로 다른 객체인지 판단
            return false
        }
    }
}
/*내용의 통일성은 자동으로 판단되는것이 아닌dd
* 코틀린의 모든 클래스가 내부적으로 상속받는 Any라는 최상위 클래스의 equals함수가 반환하는 Boolean값으로 판단하는것*/
