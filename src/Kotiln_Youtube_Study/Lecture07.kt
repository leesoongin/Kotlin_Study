package Kotiln_Youtube_Study
/*흐름제어와 논리연산자*
반복문에서 break, continue
 */
fun main(){
    for(i in 0..9){
        if(i == 3) continue;
        print(i)
    } //3제외 다 print됨 코틀린에서는 한가지 더 추가.

    /*다중반복문 코틀린에서 추가된점*/
    soong@for(i in 0..9){
        for(j in 0..9){
            if(i == 2 && j == 2) break@soong
            println("i:$i , j:$j")
        }
    }
    /*조건에 만족하면 한번에 for문 종료시키기 soong은 label느낌임 내가 정의하는 이름으로 가능
    * 근데 우리교수님이 이런거 앵간하면쓰지말랬음 그냥 있다는것만 알아두면 될듯
    * ""안에서 변수값 출력하려면 $변수명 이런 방식으로 출력 가능*/
}