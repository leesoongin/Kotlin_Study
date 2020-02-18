package Kotiln_Youtube_Study

/*컬렉션 객체 , 데이터를 담는 List*/
/*List 의 두가지 종류
* List<out T>  /  MutableList<T> *변환할수있는
    차이는 생성시 넣은 객체를 대체 추가 삭제 불가 / 가능
    listOf(...) / mutableListOf(...)
    mutableList -> add(data),add(index,data) / remove(data) removeAt(index) /shuffle() sort() 메서드 존재
*/

fun main(){
    var a=listOf("사과","딸기","배")

    println(a)

    for(i in a){//자바의 향상된 for문 느낌인데?
        println("${i}")
    }//for

    for(i in 0..a.size-1){ //이게 기본 for문인듯
        println(a[i])
    }

    var b=mutableListOf(6,3,1)

    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.remove(6)
    println(b)

    b.removeAt(1)
    println(b)
}