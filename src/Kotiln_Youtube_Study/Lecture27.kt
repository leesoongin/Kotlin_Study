package Kotiln_Youtube_Study

/*컬렉션에 사용하는 함수들 1*/
/*
    .forEach{단순 순회}
    .filter{조건에 따른 순회}
    .map{계산하게 되면 그 값이 수정되어 저장}
    .any{조건(it)} 하나라도 맞으면 true
    .all{조건(it)} 모두 맞으면 true
    .none{조건(it)} 하나도 맞지않으면 true
    .first() 로 사용하는경우, collection의 첫번째 객체를 반환
    .first{조건(it)} 조건에 맞는 첫번째 아이템을 반환
    .last{조건(it)} 조건에 맞는 마지막 아이템을 반환
     first-> find , last ->findLast 함수로 대체가능
     first와 last를 사용할 떄에 발생할 수 있는 문제점 -> 조건에 맞느 객체가 없는경우(컬렉션이 비어있는 경우)NoSuchElementException이 발생할 수 있음
     이때에 firstOrNull , lastOrNull을 사용하면 객체가 존재하지 않을경우 null값을 반환한다
     .count() 컬렉션의 모든 아이템의 개수 반환   /  .count{조건(it)} 조건에 맞는 아이템의 개수 반환
* */
fun main(){
    val nameList=listOf("박수영","김지수","김다현","신유나","김지우")

    nameList.forEach{ print(it)} //단순 순회하며 출력 it은 list의 앞부분부터 차례대로 순회함
    println()

    println(nameList.filter{it.startsWith("김")}) //조건에 맞는 녀석들만 차례대로 순회

    println(nameList.map{"이름"+it}) // list의 내용을 변화

    println(nameList.any{it == "김지연"}) //  김지연이라는 객체가 하나라도 존재하는 경우 true
    println(nameList.all{it == "박수연"}) // list의 모든 객체들이 박수연이라면 true
    println(nameList.none{it.startsWith("김")}) //조건에 맞는 녀석이 하나도 없다면 true

    println(nameList.firstOrNull{it.startsWith("김")}) //김으로 시작되는 녀속들중 첫번째   /  first일때에 조건에 맞는 객체가 없다면 NoSuchElementException발생
    println(nameList.lastOrNull{it.startsWith("이")}) // 이로 시작하는 녀석들중 가장 마지막녀석   / last일때에 조건에 맞는 객체가 없다면 NoSuchElementException발생
    println(nameList.count{it.contains("지")}) // 지를 포함하는 녀석들이 몇개인지

}