package Kotiln_Youtube_Study
/*클래스의 생성자로 인스턴스를 생성하기
* init 함수는 파라미터나 반환형이 없는 특수함수,
* 생성자를 통해 인스턴스가 만들어질때 호출되는 함수*/

fun main(){
    var a=Person2("박보영",1990)
    var b=Person2("박보영",1990)
    var c=Person2("박보영",1990)

    var d=Person2("박보영")
    var e=Person2("박보영")
    var f=Person2("박보영")

}
/*기본 생성자, 보조 생성자 존재
* 인스턴스 생성시 편의를 제공하거나 추가적인 구문을 수행하는 기능을 제공하는 역할을 한다 */

class Person2(var name:String, var birthYear:Int){
    init{ // 이게 기본 생성자인듯
        this.birthYear=1998 //이렇게해도 되지않은가? 준영쎈빠이한테 물어바야징
        println("안녕하세요, ${this.birthYear}년생 ${this.name} 입니다")

    }
    /*this는 인스턴스 자신의 속성이나 함수를 호출하기 위해 클래스 내부에서 사용되는 키워드*/

    constructor(name:String) : this(name,1997){
        println("보조 생성자가 사용되었습니다.")
    }

    /*보조생성자를 만들때는 반드시 기본생성자를 통해 속성을 초기화 해줘야한다
    * 보조생성자가 기본생성자를 호출하도록 하려면 : ...*/
}