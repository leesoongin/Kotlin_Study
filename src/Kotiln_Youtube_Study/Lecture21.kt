package Kotiln_Youtube_Study

/*문자열*/

/*
* toUpperCase(), toLowerCase()  대 소문자 변환
* split(" ... ") 기준 문자열로 문자열을 나눠 반환
* joinToString(" ... ")  비었으면 그냥 , 기준 문자열로 문자열을 합침
* subString(" index .. index ") 문자열 일부 뽑아 보기
* isNullOrEmpty() , isNullOrBlank()  널 혹은 빔 허용 /  널 혹은 공백  허용
* startsWith("str") , endsWith("str") , contains("str")  str로 시작하는 / str로 끝나는 / str을 포함하는   ... 조건 성립시 true
*
* */
fun main(){
    var test1="Test.Kotlin.String"

    println(test1.length)

    println(test1.toUpperCase())
    println(test1.toLowerCase())

    var test2=test1.split(".") //문자열 자르기
    println(test2) // [Test,Kotlin,String]

    println(test2.joinToString()) // Test,Kotlin,String  /  문자열합치기
    println(test2.joinToString("-")) //Test-Kotiln-String  / ..

    println(test1.substring(5..10)) //Kotiln / 문자열 일부만 뽑아보기

    var nullString:String?=null
    var emptyString=""
    var blankString=" "
    var normalString="A"

    println(nullString.isNullOrEmpty()) //null이거나 비어있으면 허용 / 조건성립하면 true
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println(nullString.isNullOrBlank()) //비어있거나 공백도 허용 / 조건성립하면 true
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var testStr="Kotlin.kt"
    var testStr2="java.java"

    println(testStr.startsWith("java")) // 시작
    println(testStr2.startsWith("java"))

    println(testStr.endsWith("java")) //끝
    println(testStr2.endsWith("java"))

    println(testStr.contains("java")) //포함
    println(testStr2.contains("java"))


}