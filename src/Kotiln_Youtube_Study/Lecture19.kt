package Kotiln_Youtube_Study

/*제네릭*/

/*캐스팅 연산을 수행하는것은 프로글매의 속도를 저하시킬 수 있다는 단점이있다 함수나 클래스에 패러미터를 함수나 클래스를 넣어줄 경우.
* 그래서 제네릭이라는 개념이 등장 , 제네릭은 함수나 클래스를 선언할 때에
*  고정적인 자료형 대신 실제 자료형으로 대체되는 타입 패러미터를 받아 사용하는 방법*/

fun main(){
    usingGeneric(A()).doShout() //usingGeneric<A>(A()).doShout 해도 되지만 생성자의 패러미터로 클래스 A라는것을 알 수 있기때문에 생략가능
    usingGeneric(B()).doShout()// ...
    usingGeneric(C()).doShout()// ...

    doShouting(B())//캐스팅 없이 b객체 그대로 함수에서 사용하는것
}

fun <T:A>doShouting(t:T){
    t.shout()
}

open class A{
    open fun shout(){
        println("A가 소리칩니다")
    }
}
class B:A(){
    override fun shout(){
        println("B가 소리칩니다")
    }
}
class C:A(){
    override fun shout(){
        println("C가 소리칩니다")
    }
}

class usingGeneric<T:A>(var t:T){
    fun doShout(){
        t.shout()
    }
}
/*
class usingGeneric(var t:A){ 이렇게 사용해도 동작은 같겠지만 Generic이 자료형을 대체하게되어 캐스팅을 방지할 수 있으므로 성능 향상 가능
    ...
}
* */