package Kotiln_Youtube_Study
//조건문 ,  비교 연산자
fun main() {
    var a=7

    //if문은 그냥 알고있는대로.. 달라진건 없음
    if(a>10){
        println("참")
    }else{
        println("거짓")
    }
    /*    But, 비교연산자에는 is, !is연산자가 존재
    a is Int a가 Int인지 (호환되는지)여부를 체크 ,  형변환까지 한번에 진행시켜주는 연산자
    */
    doWhen(a)
}

//다중조건문 switch-> when  하나의 변수를 여러개의 값과 비교할수있음 switch가 편리해짐
fun doWhen(a:Any){ // Any 는  어떤 자료형이든 상관없이 호환되는 코틀린의 최상위 자료형
    when(a){
        1->println("1") //정수일수도
        "Dino"->println("디노의 코틀린 강좌입니다")//문자열일수도
        is Long->println("long임")
        //a>10->println("10이상") 처럼 등호나 부등호의 사용은 불가능
        !is Long->println("long이 아님")
        else -> println("default와 같음")
    }
}

fun doWhen2(a:Any){
    //값을 반환하게 할 수도 있다
    var result=when(a){
        1->"1"
        "Dino"->"디노의 코틀린 강좌입니다"
        is Long->"long임"
        //a>10->println("10이상") 처럼 등호나 부등호의 사용은 불가능
        !is Long->"long이 아님"
        else ->"default와 같음"
    }

    println(result)
}