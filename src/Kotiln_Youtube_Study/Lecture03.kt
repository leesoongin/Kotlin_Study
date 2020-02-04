package Kotiln_Youtube_Study
//형변환과 배열
/*
자료형의 형변환 -> 형변환 함수들이 존재
toInt() ,  . . . to Double() 등
*/
fun main() {
    /*
    코틀린은 형변환시 발생할수 있는 오류를 막기위해 다른 언어들이 지원하는 암시적 형변환을 지원하지 않는다.
    명시적 형변환 -> 변환될 자료형을 개발자가 직접 지정함
    암시적 형변환 -> 변수를 할당할 시 자료형을 지정하지 않아도 자동으로 형변환 됨
    */
    var a : Int=10
    var b : Long

    b=a.toLong()

    println(b)

    //배열은 내부적으로 Array Class로 제공되는 기능
    var intArr=arrayOf(1,2,3,4,5)
    var nullArr= arrayOfNulls<Int>(5)

    intArr[2]=8

    println(intArr[2])
}