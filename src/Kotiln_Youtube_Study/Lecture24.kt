package Kotiln_Youtube_Study

/*중첩클래스와 내부클래스*/

/*내부클래스는 혼자서 객체를 만들 수는 없고  외부 클래스의 객체가 있어야만 생성과 사용이 가능한 클래스*/

/*중첩클래스는 형태만 내부에 존재할 뿐, 실질적으로는 서로 내용을 직접 공유할 수 없는 별개의 클래스,
* 내부클래스는 외부 클래스안에서 사용되는 클래스이므로 외부클래스 객체의 속성이나 함수의 사용이 가능*/
fun main(){
    Outer.Nested().introduce()

    var outer=Outer()
    var inner=outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text="Changed Outer Class"
    inner.introduceOuter()

}
class Outer{
    var text="Outer class"

    class Nested{
        fun introduce(){
            println("Nested class")
        }
    }//class
    inner class Inner{
        var text="Inner class"

        fun introduceInner(){
            println(text)
        }//inner
        fun introduceOuter(){
            println(this@Outer.text)
        }//outer
    }
}