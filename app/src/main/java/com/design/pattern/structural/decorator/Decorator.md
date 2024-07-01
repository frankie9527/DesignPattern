# 装饰模式(Decorator Pattern)
装饰模式指的是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。
它是通过创建一个包装对象，也就是装饰来包裹真实的对象
指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
装饰者模式属于对象结构型模式，也体现了开闭原则（ocp）

## 个人理解
其实就是定义一个接口。实体类实现这个接口， 实体类构造方法传入这个接口。
并在接口的抽象方法里面进行反复叠加

## example
```kotlin
class BlackSilk(private val dressUp: GirlDressUp?=null) :GirlDressUp{
    override fun score(): Int {
        return 23+ (dressUp?.score() ?: 0)
    }

    override fun describe(): String {
        return "黑丝 "+ (dressUp?.describe() ?: "")
    }
}
```

## 总结
所以通过example 可以看出，不修改原有的代码接口，重写其接口方法就可以实现装饰模式！so easy