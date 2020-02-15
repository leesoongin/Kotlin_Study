package Kotiln_Youtube_Study

/* 클래스의 상속*/

/*코틀린은 상속금지가 default 값이다
* 클래스를 상속하려면 open으로 열어줘야함*/

fun main(){
    var a=Animal("방울이",2,"개")
    var b=Dog("털복숭이",2,"서울")
    var c=Cat("츄",2,"부산")

    a.intro()
    b.intro()
    c.intro()

    b.bark()
    c.meow()

    println(b.from)
    println(c.from)
}

open class Animal(var name:String,var age:Int, var type:String){
    fun intro(){
        println("저는 $type 이고, 이름은 $name , 나이는 $age 입니다")
    }
}

class Dog(name:String,age:Int,var from:String) : Animal(name,age,"개"){

    fun bark(){
        println("멍멍")
    }
}

class Cat(name:String,age:Int,var from:String) : Animal(name,age,"고양이"){


    fun meow(){
        println("냥냥")
    }
}