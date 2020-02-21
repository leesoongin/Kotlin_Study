package Kotiln_Youtube_Study

/*argument를 다루는 방법과 infix함수*/

/*함수의 오버로딩 , default parameter, vararg , infix 함수
*
* */

fun main(){
    read(7)
    read("감사합니다")

    deliveryItem("짬뽕")
    deliveryItem("책",3)
    deliveryItem("노트북",30,"학교")

    /*맨뒤부터 default parameter가 들어간느데 중간이나 앞에껄 default로 하고싶다면 패러미터에 이런식으로 넣어주자*/
    deliveryItem(count=1,destination="친구집") // 맨앞 생략 default
    deliveryItem("선물",destination="친구집") //중간 생략 default

    sum(1,2,3,4)

    /*두개다 같음 this에 해당하는 값이 6, 인자에 해당하는값이 4*/
    println(6 multiply 4)
    println(6.multiply(4))
}
/*함수의 오버로딩 ... 인자의 개수와 자료형으로 어떤 함수가 호출되었는지 판단  만약 같은자료형에 패러미터의 개수가 같으면 판독불가 그니까 사용하지 말자*/
fun read(x:Int){
    println("숫자 ${x} 입니다")
}

fun read(x:String){
    println(x)
}
/*default parameter*/
fun deliveryItem(name:String="뭐", count:Int=1,destination:String="집"){
    println("${name},${count}개를 ${destination}에 배달하였습니다.")
}

/*같은 자료형을 개수에 상관없이 패러미터로 받고 싶을 때 사용하는 vararg
* vararg 는 개수가 지정되지 않은 패러미터라는 특징이 있으므로 다른 패러미터와 같이 쓰일때는 반드시 맨 마지막에 위치해야한다*/

fun sum(vararg x:Int){
    var sum=0;

    for(n in x){ //vararg는 배열처럼 for문으로 참조 가능
        sum+=n
    }

    println(sum)
}
//infix 함수가 적용될 자료형.function이름
/*클래스 안에서 infix함수를 선언할 때에는 적용할 클래스가 자기 자신이므로 클래스이름은 생략한다
* ex) infix fun multiply(x:Int):Int=this*x */
infix fun Int.multiply(x:Int):Int=this*x