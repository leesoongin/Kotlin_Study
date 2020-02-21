package Kotiln_Youtube_Study

/*컬렉션 함수들 2*/

/*associateBy{} <- 아이템에서 key를 추출하여 map으로 변환하는 함수
* groupBy{} <-key가 같은 아이템끼리 배열로 묶어 map으로 만드는 함수
* partition <- 아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌
* .flatMap{} <-아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
* .getOrElse(){} <- 인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환
*  collectionA zip <- collectionB 컬렉션 두개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어 줌
*  이때, 결과 list의 아이템개수는 더 작은 컬렉션을 따라가게 된다*/

fun main(){
    data class Person(val name:String, val birthYear:Int)

    val personList=listOf(Person("유나",1992),
                            Person("조이",1996),
                                Person("츄",1999),
                                    Person("유나",2003))

    println(personList.associateBy{it.birthYear}) //birthYear을 키로 map을만들어 밚환

    println(personList.groupBy{it.name}) //name을 키로 같은 키를 가지고있다면 배열로 묶어 map을 만드는 함수

    val (over98,under98) = personList.partition{it.birthYear>1998} //조건에 따라 두개의 파티션으로 나뉘어 각각 over98 , under98 에 map형식으로 저장된다
    println(over98)
    println(under98)

    val numbers=listOf(-3,7,2,-10,1)

    println(numbers.flatMap{listOf(it*10,it+10)})

    println(numbers.getOrElse(1){50}) // 존재하므로 7  반환
    println(numbers.getOrElse(8){50}) // 존재하지않으므로 50 반환0

    val names=listOf("A","B","C","D")

    println(numbers zip names) // 이때 numbers의 크기는 5 names의 크기는 4 이므로 반환되는 list의 size는 4 numbers의 1은 생략된다
    println(names zip numbers)

}