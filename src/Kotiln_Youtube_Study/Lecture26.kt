package Kotiln_Youtube_Study

/*Collection Class Set, Map*/

/*Set은 List와 달리 순서가 정렬되지 않으며, 중복이 허용되지 않는 컬렉션
* 인덱스로 접근할 수 없으며, contains()로 Set안에 존재하는지를 확인하는 식으로만 사용
* Set도 List와 마찬가지로 Set 과 MutableSet이 존재
* add () remove() 추가, 삭제 */

/*Map은 객체를 넣을때에 그 객체를 찾아낼 수 있는 Key를 쌍으로 넣어주는 컬렉션
* 내부적으로는 MutableMap.MutableEntry에 객체로 담겨져있음
* 이러한 구조때문에 객체의 위치가 아닌 고유한 key를 통해 객체를 참조하는 특징을 가지고 있음
* 같은 키에 다른 객체를 넣으면 기존의 객체가 대체됨
* Map(), MutableMap()
* put(key,value)  remove(key)*/

fun main(){
    val a=mutableSetOf("귤","바나나","키위")

    for(item in a){
        println(item)
    }

    a.add("수박")
    println(a)

    a.remove("수박")
    println(a)

    println(a.contains("바나나"))

    val b=mutableMapOf("레드벨벳" to "음파음파",
                        "트와이스" to "팬시",
                            "잇지" to "아이시")

    for(entry in b){ //Map은 내부적으로 MutableMap.MutableEntry 안에 key value가 저장되어있으니 key, value를 각각 호출해줘야함
        println("${entry.key} , ${entry.value}")
    }

    b.put("소시","다시만난세계")
    println(b)

    b.remove("잇지")
    println(b)

    println(b["트와이스"])
}