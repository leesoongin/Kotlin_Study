package Kotiln_Youtube_Study

/*
* 조건형 반복문 -> while, do while 은 자바 , C랑 다를게 없음
* for문은 살짝 다르게  in x..y  증가 , downTo 감소  / default -> 1  / step 으로 증,감 범위 조절가능
*
* */
fun main() {
    var a=0

    while(a>5){
        println(a++)
    }

    for(i in 0..9){ //default로 1씩 증가
        print(i)
    }

    for(i in 0..9 step 3){ //step x -> x씩증가  ex) step 3 -> 3씩 증가
        print(i)
    }

    for(i in 9 downTo 0){ //default 로 1씩 감소
        print(i)
    }

    for(i in 9 downTo 0 step 3){ //증가와 마찬가지로 step으로 감소폭 지정 가능
        print(i)
    }

    for(i in 'a'..'e'){
        print(i)
    }

    for(i in 'a'..'e' step 3){
        print(i)
    }
}