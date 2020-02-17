package Kotiln_Youtube_Study

/*스코프함수로 좀더 간결하게 코드를 작성하자!*/

/*람다함수도 여러구문의 사용이 가능
* 람다함수가 여러줄이 되는 경우 마지막구문의 결과값이 반환된다
* it 키워드
*
* 스코프 함수는 5가지 종류가 존재한다.
* apply, run, with ,  also, let
*
* apply <-> also
* run <-> let
*
* 스코프 함수는 인스턴스의 속성이나 함수를 scope내에서 깔끔하게 분리하여 사용할수있다는 점 때문에 코드의 가독성을 향상시키는 장점이 있다
* */
fun main(){
   /* var c: (String) ->Unit={
        *                       ...
        *                       ...
        *                       }*/
    var price =5000

    var a:()->Unit={println("패러미터가 없어요")}// 패러미터가 없는 람다함수라면 실행할 구문만 중괄호안에 나열하면 된다
    var c:(String) -> Unit={/*패러미터 이름 생략*/println("$it 람다함수")}//패러미터가 한개뿐이라면 it을 사용가능

    /*apply*/
    var d=Book("디모의 코틀린",10000).apply{
        name+=" [초특가] "+name
        discount()
    }
    /* apply는 인스턴스를 생성한 후 변수에 담기전에,  초기화 과정을 수행할 때 많이 사용 /
        apply는 인스턴스 자신을 다시 반환하므로 생성되자마자 조작된 인스턴스를 변수에 바로 넣어줄 수 있다*/

    /*run*/
    d.run {
        println("상품명:${name}, 가격:${price}")
    }//run은 인스턴스가 이미 만들어진 이후에 인스턴스의 함수나 속성을 scope내에서 사용해야할때에 유용

   /* apply, run은 자신들의 scope안에서 참조연산자를 사용하지 않아도 된다는 점은 같지만,
      일반 람다함수처럼 인스턴스대신 마지막 구문의 결과값을 반환한다*/

    d.let{
        println("상품명:${it.name}, 가격:${it.price}")
    } //book클래스 scope의 price 변수,main scope의 price변수중 run 은 main 우선 .. so let 사용해서 book의 price를 it 을 통해 불러옴
    //let과 마찬가지로 also또한 같음

    /*with*/
    /*with는 run과 동일한 기능을 가짐 but 인스턴스를 참조연산자 (.) 대신 패러미터로 받는차이뿐
    a.run{...}
    with(a){...}
    */
}

class Book(var name:String, var price:Int){
    fun discount(){
        price-=2000
    }
}