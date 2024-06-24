# Builder设计模式
## 一、概述
复杂对象的创建过程分解成多个简单的构造步骤，提供了一种优雅的方式来构造特定类型的对象！一般情况下创建对象需要处理许多参数和属性，
builder 相对于工厂设计模式相对简单优雅！
## 二、使用场景
- 创建时包含了多个字段和属性
- 需要创建不可变对象
- 根据条件创建不同属性的对象
## 三、四要素
- Product:表示被构造的复杂对象
- Builder:为创建Product对象的各个部件指定抽象接口
- ConcreteBuilder:实现Builder的接口以构造和装配该产品的各个部件
- Director：指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系

#### example
```
mOkHttpClient = new OkHttpClient.Builder()
       cache(mCache)
       .addInterceptor(mNetworkInterceptor)
       .addNetworkInterceptor(mNetworkInterceptor)
       .retryOnConnectionFailure(true)
       .connectTimeout(15, TimeUnit.SECONDS)
       .build();
```
