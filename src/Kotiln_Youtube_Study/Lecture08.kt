package Kotiln_Youtube_Study

/*객체지향 , 클래스*/
/*코틀린은 객체지향 언어를 기반으로 함수형 언어의 장점을 흡수한 언어*/
fun main(){
    var a=Person("박보영",1990)
    var b=Person("이숭인",1996)
    var c=Person("박수진",1998)

    println(a.name)
    println(b.name)
    println(c.birthYear)

    println("안녕하세요, ${b.birthYear}년생 ${b.name} 입니다") //$표시로 class의 속성값까지 ""안에서 출력가능 {} 사용한이유는 문자열로 오인할 수 있기때문

    a.intro()
}

class Person(var name:String, val birthYear:Int){ // <- 속성을 선언함과 동시에 생성자를 선언하는방법 in 코틀린
    fun intro(){
        println("안녕하세요, ${birthYear}년생 $name 입니다")
    }
}