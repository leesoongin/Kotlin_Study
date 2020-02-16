package Kotiln_Youtube_Study

/*오버라이딩과 추상화*/

/*
허용의 의미 -> open class든 function이든 ...
* 서브클래스에서 수퍼클래스 내의 함수와 동일한 이름을 가질수없는데,
* 허용만 한다면 오버라이딩으로 같은 이름과 형태로 된 함수의 내용을 구현 가능
* 수퍼클래스에서 open이 붙은 함수는 서브클래스에서 override를 붙여 재구현 가능
  abstract class 생성자를 가질 수 있음

  interface  생성자를 가질 수 없음
  속성, 추상함수 , 일반함수를 가질 수 있음
  구현부가 있는함수와 구현부가 없는 함수가 존재
  구현부가 있는 함수 -> open함수로 간주
  구현부가 없는 함수 -> abstract함수로 간주
  별도의 표현 (open , abstract)를 기재하지않아도 서브클래스에서 구현 , 재정의 가능
  클래스와 달리 인터페이스는 다중상속이가능하므로 설계에 유연

  구현부가 있든 없든 재정의 할때에는 그냥 override 써주면 될듯
* */

fun main(){
    var t=Tiger()

    t.eat()

    var r=Rabit()

    r.eat()
    r.sniff()
}

open class Animal2 {
    open fun eat(){ //open시 override 허용
        println("음식을 먹겠습니다.")
    }
}

class Tiger : Animal2(){
    override fun eat(){ //수퍼클래스의 eat함수 override
        println("고기를 먹습니다")

    }
}

abstract class Animal3{ //추상클래스 abstract class 일 경우 open안해줘도 되는 모양?
    abstract fun eat()
    fun sniff(){
        print("킁킁")
    }
}

class Rabit :Animal3(){
    override fun eat(){ //그래도 override 는 기재해줘야하는듯
        println("당근을 먹습니다")
    }
}

/////////////////////////////////////인터페이스

interface Runner{
    fun run()
}
interface Eater{
    fun eat(){
        println("음식을 먹습니다")
    }
}

class Dog2 : Runner, Eater{ //인터페이스 다중상속 받음
    override fun run(){
        println("개가 달립니다")
    }
    override fun eat(){
        println("허겁지겁 먹습니다")
    }
}