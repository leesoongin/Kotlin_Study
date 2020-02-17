package Kotiln_Youtube_Study

/*고차함수와 람다함수*/

/*main에서 b가 a함수를 호출했을경우
*  function = a  /  function("b가 호출한")  /  str="b가 호출한"  /  println("$str 함수 a")
*
*
* */

fun main(){
    b(::a) // :: 은 일반함수를 고차 함수로 변경해주는 연산자

    var c : (String)->Unit={ str->println("$str 람다함수") } //function a를 람다함수로 표현한 방식
    // var c ={ str->println("$str 람다함수") } //코틀린의 타입추론기능 이용
    b(c) //람다함수는 그 자체가 고차함수이기 땜ㄴ에 연산자가 필요없다
}

fun a(str:String){
    println("$str 함수  a")
}

fun b(function: (String)->Unit){  //() 안에는 받아올 함수의 파라미터를 적어주고 -> 에는 그 함수의 반환형을 적어준다 . 반환형이 없다면 Unit
    function("b가 호출한")
}