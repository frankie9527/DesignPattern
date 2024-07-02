# 责任链模式（Chain of Responsibility Pattern）
责任链模式是一种行为模式，它是由多个对象组成的链。
对于一个事物请求或者处理，在这个响应链上的对象都机会处理这个请求，或者将这个请求交响应链中的下一个对象

## example
1、采购员给厂里买材料，低于2000需要小组长审批，2000-5000 需要经理审批，
5000-20000需要厂长审批，如果高于20000则需要boss 直接处理
2、学生下河洗澡出事故以后，班主任，校长，县领导 都会收到惩罚。惩罚的大小根据死亡人数据不同而不同


## 个人理解
因为java和kt都是面向接口编程。对于责任链模式，我们可以首先考虑的是接口，但是根据example 例子发现
如果用接口声明 处理方法和下一个处理方法的时候发现，下一个处理是需要持有对象调用对应方法的。
因此接口不适合当前设计。故而 使用抽象类代替接口！