package Kotiln_Youtube_Study

 /*object  와 companion object */

 /* 사용이유?
 * 공통적인 속성과 함수를 사용해야하는 코드에서는 object 사용
 * object로 선언된 객체는 최초 사용시 자동으로 생성되며 이후 코드전체에서 공용으로 사용될 수 있다*/
fun main(){

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    var a=FoodPoll("짬뽕")
    var b=FoodPoll("짜장")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println(a.count)
    println(b.count)
    println(FoodPoll.tatal) //companion object 를 사용할땐 클래스.변수 요런식
}

object Counter{
    var count=0

    fun countUp(){
        count++
    }
    fun init(){
        count=0
    }
}

class FoodPoll(var name:String){
    companion object{ //c++의 static 변수와 느낌이 비슷함 클래스용 변수 느낌.. 그정도로 기억하면 될듯함
        var tatal=0
    }
    var count=0

    fun vote(){
        count++
        tatal++
    }
}