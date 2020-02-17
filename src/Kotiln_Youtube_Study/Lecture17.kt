package Kotiln_Youtube_Study

/*옵저버 패턴*/

/*시스템 혹은 루틴에 의해서 발생하게 되는 동작들을 이벤트라고 부르며,
이벤트가 발생할때마다 즉각적으로 처리할 수 있도록 만드는 프로그래밍 패턴을 옵저버 패턴이라고 부릅니다
옵저버 패턴을 구현하기 위해서 두개의 클래스가 필요
이벤트를 수신하는 class 이벤트의 발생 및 전달 class
*/

fun main(){
    EventPrinter().start()
}

interface EventListener{
    fun onEvent(count:Int)
}

class Counter2(var listener:EventListener){
     fun count(){
         for(i in 1..100){
             if(i % 5 == 0) listener.onEvent(i)
         }
     }
}

class EventPrinter: EventListener {
    override fun onEvent(count:Int){
        print("${count}-")
    }
    fun start(){
        var counter=Counter2(this)
        counter.count()
    }
}
/*다음시간에 계속 ...*/