package Kotiln_Youtube_Study

/*옵저버 패턴*/

/*시스템 혹은 루틴에 의해서 발생하게 되는 동작들을 이벤트라고 부르며,
이벤트가 발생할때마다 즉각적으로 처리할 수 있도록 만드는 프로그래밍 패턴을 옵저버 패턴이라고 부릅니다
옵저버 패턴을 구현하기 위해서 두개의 클래스가 필요
이벤트를 수신하는 class 이벤트의 발생 및 전달 class
*/

fun main(){
    EventPrinter().start()//EventPrinter의 인스턴트 생성
}
interface EventListener{
    fun onEvent(count:Int)
}

class Counter2(var listener:EventListener){
    fun count(){
        for(i in 1..100){
            if(i%5 == 0) listener.onEvent(i)
        }//for
    }
}

/*익명객체*/
class EventPrinter{
    fun start(){
        var counter=Counter2(object:EventListener{ //익명 객체로 EventListener를 받아 익명리스너안에서 onEvent를 override
            override fun onEvent(count:Int){
                println("${count}")
            }
        })
        counter.count()
    }
}

/*class EventPrinter : EventListener{
    override fun onEvent(count:Int){
        println("${count}")
    }
    fun start(){
        var counter=Counter2(this)
        counter.count()
        *//*this 는 EventPrinter객체 자신을 나타내지만
         받는쪽에서 EventListener만 요규했기때문에 여기 this에서는 EventListener만 넘겨주게 된다
         이를 객체지향의 다형성이라고 한다. *//*
    }
}*/
