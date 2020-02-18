package Kotiln_Youtube_Study

/*다형성의 특징 , 수퍼클래스와 서브클라스간의 변환이 가능한 이유는 ?*/

/*up - casting 은 상위 자료형에 담는것
* down - casting은 하위 자료형
* down - casting은 별도의 연산자가 필요 : as , is
* as는 변수를 호환되는 자료형으로 변환해주는 캐스팅연산자.
* var a:Drink=cola()
* var b=a as Cola  <- 이후로 a는 cola로 작동함, 변환된 녀석을 반환도 가능
* is는 변수가 자료형에 호환되는지를 먼저 체크한 후 변환해주는 캐스팅 연산자
* 조건문 안에서만 사용되는 특징이 있다
* if (a is cola){
*   이 안에서만 a가 cola가 됨
* }*/

fun main(){
    var a=Drink()
    a.drink()

    var b:Drink=Cola()
    b.drink()
    //b.washDishes 는 아직까지 Drike객체의 것이므로 참조할수없다

    if(b is Cola){//다운캐스팅 is는 조건문 안에서만 적용되기때문에 if 문을 벗어나는 순간 b.washDishes는 참조할 수 없다고 뜰거임
        b.washDishes()
    }

    var c=b as Cola //다운캐스팅 as는 is와 달리 반환되는 값이 저장되는 c뿐만아니라 b까지도 Cola로 다운캐스팅시켜준다

    c.washDishes()
    b.washDishes() //as로 다운캐스팅 되었기 때문에 참조 가능해짐
}
open class Drink{
    var name="음료"

    open fun drink(){
        println("${name}를 마십니다")
    }
}
class Cola:Drink(){
    var type="콜라"

    override fun drink(){
        println("${name}중에 ${type}을 마십니다.")
    }
    fun washDishes(){
        println("${type}으로 설거지를 합니다")
    }
}