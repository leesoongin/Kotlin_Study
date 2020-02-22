package Kotiln_Youtube_Study

/*변수 ,상수 , 늦은 초기화 , 초기화의 지연*/
/*var , val
* var 은 할당된 객체를 변경 가능하지만 val은 할당된 객체를 변경할 수 없다. 하지만 객체의 속성을 바꾸지 못하는것은 아니다(변경이 불가능한것은 상수뿐 companion object)
* 상수는 클래스의 속성이나 지역변수로는 사용할 수 없고 객채의 생성과 상관없이 클래스와 관계된 고정적인 값으로만 사용
* 의례적으로 const val CONST_a=1234 이런식으로 사용함*/

fun main(){
    val foodCourt=FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    /*기능적으로 변수보다 상수를 이용하는 이유
    * 변수의 경우 런타임시 객체를 생성하는데에 시간이 더 소요되어 성능의 하락이 있기때문
    * 상수를통해 객체의 생성없이 메모리에 값을 고정시켜 사용함ㅁ으로서 성능향상시킬 수 있는 장점이 있기때문*/


    val a= LateInitSample()

    println(a.getLateInitText())

    a.text="새로 할당한 값"
    println(a.getLateInitText())

    /*val a:Int by lazy{7}
      코드에서는 선언시 즉시 객체를 생성 및 할당하여 변수를 초기화하는 형태를 가지고 있지만
    * 실제 실행시 변수를 사용하는 시점에 초기화됨*/
    val number:Int by lazy{
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)//시작 후 number 초기화
    println(number)// 이미 초기화 되서 7만 찍힘

}

class FoodCourt{
    fun searchPrice(foodName:String){
        val price=when(foodName){
            FOOD_CREAM_PASTA->13000
            FOOD_STEAK->20000
            FOOD_PIZZA->21000
            else->0 //else 문 꼭 필요한듯 switch의 default 와 같은 맥락
        }
        println("${foodName}의 가격은 ${price}입니다.")
    }

    companion object{
        const val FOOD_CREAM_PASTA="크림파스타"
        const val FOOD_STEAK="스테이크"
        const val FOOD_PIZZA="피자"
    }
}
class LateInitSample{
    lateinit var text:String

    fun getLateInitText():String{
        if(::text.isInitialized){ //lateinit var은 기본자료형에 사용 불가 (String은 가능) / 초기화 여부 알기위해선 변수 이름앞에 ::붙여 isInitialized
            return text
        }else{
            return "기본값"
        }
    }
}