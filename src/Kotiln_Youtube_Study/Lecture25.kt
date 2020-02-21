package Kotiln_Youtube_Study

/*data class 와 enum class*/

/*data class 는 일반클래스와 다르게 5가지 기능들을 내부적우로 자동으로 생성
* equals() , hashcode() , toString()<- 포함된 속성을 보기쉽게 나타내주는 fun , copy(), componentX() <- 속성을 순서대로 반환하는녀석 사용자가 사용하진않음 */

/*val a=Data("A",7)
   * val b=a.copy()  아무 패러미터가 없으면 똑같은 내용으로 생성함
   * val a.copy("B") 패러미턱 ㅏ있다면 해당 패러미터를 교체하여 생성함 -> b는  Data("B",7) 으로 생성됨
   * */

fun main(){
    val a=General("보영",212)
    println(General("보영",212) == a)
    println(a.hashCode()) //일반 클래스는 지원해주지않으므로 제대로 안찍힘
    println(a) // 속성값도 마찬가지. componentX() 함수가 작동하지않기때문  ... 아마..? ㅎ

    val b=Data("루다",306)

    println(Data("루다",306) == b)
    println(b.hashCode()) //해시코드값
    println(b) //속성값 출력
    println(b.copy()) //그대로 복사
    println(b.copy("아린")) //name만 바뀌어서 그대로 복사
    println(b.copy(id=618))// id만 바뀌어서 그대로 복사

    val list =listOf(Data("보영",212),
                        Data("루다",306),
                            Data("아린",618))

    for((a,b) in list){//속성이 2개 이므로  (a,b)
        println("${a}, ${b} ")
    }

    var state=State.SING
    println(state) //sing

    state=State.SLEEP
    println(state.isSleeping()) // true

    state=State.EAT
    println(state.message) //밥을 먹습니다
}

class General(val name:String, val id:Int)

data class Data(val name:String, val id:Int)

enum class State(val message:String){
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP

}