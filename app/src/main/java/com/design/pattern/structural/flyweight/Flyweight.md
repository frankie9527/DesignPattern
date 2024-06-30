# 享元模式
享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式

# 优点
减少内存消耗：通过共享对象，减少了内存中对象的数量。
提高效率：减少了对象创建的时间，提高了系统效率

## example
在android 应用中，点击tab 切换界面，来回切换不可能看不到的就释放掉，因此要缓存起来，下次在用
因为界面都是fragment 所以持有fragment。 根据不同ui 显示不同fragment。
在现实的享元模式，应该把fragment 替换成接口！ 因为任何设计模式都是面向接口编程
```java
public class MainFragmentFactory {
  private  static SparseArray<Fragment> map=new SparseArray<Fragment>();
    public static Fragment getFragment(int position){
        Fragment  currentFragment=map.get(position) ;
          if (currentFragment==null){
              switch (position){
                  case 0:
                    map.put(0,new RecommendFragment());
                      break;
                  case 1:
                      map.put(1,new MoviesFragment());
                      break;
                  default:
                      break;
              }
              currentFragment=map.get(posistion);
          }
        return currentFragment;
    }
}
```
