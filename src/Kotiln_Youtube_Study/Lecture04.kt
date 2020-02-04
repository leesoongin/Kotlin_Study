package Kotiln_Youtube_Study

//타입추론과 함수
/*자료형을 명시하지 않아도 코틀린이 자동으로 자료형을 추론해주는 기능*/
fun main() {
    val str="문자열?"
    val str2:String="문자열"

    var a=1234 //int
    var b=1234L // Long
    var c=12.34 //double
    var d=12.34f //float

    var bool=false //boolean
    var f='c' //char

/*    대부분은 코틀린의 타입추론 기능을 이용하여 코드량을 줄일수있다*/

    println(add(1,2,3))
}

fun add(a: Int,b:Int, c:Int):Int{ //일반적으로 java에서 사용했던 형태으ㅣ 함수랑 비슷
    return a+b+c
}
//단일 표현식 함수 in Kotlin

fun add2(a:Int,b:Int,c:Int)=a+b+c//단일 표현식 함수에서는 반환형의 타입추론이 가능하므로 반환형을 생략가능

/*
코틀린에서 함수는 내부적으로 기능을 가진 형태이지만,
파라미터를 넣는다는 점 외에는 자료형이 결정된 변수라는 개념으로 접근하는것이 좋다
위의 방식이 함수형 언어라는 코틀린의 특징을 가볍게나마 나타내는듯
*/
