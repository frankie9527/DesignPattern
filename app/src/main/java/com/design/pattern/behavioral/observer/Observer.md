# 观察者设计模式
- Subject :被观察者 （抽象类）
- Observer ：观察者 （可以是接口也可以是抽象类）
- Concrete Subject ：具体的被观察者，实现了被观察者的抽象方法
- Concrete Observer ：具体的观察者，是想了观察者的具体实现

## example ：
### 在java 中有Observer 类可以使用 demo 如下

```
public class  LiveActivity extends BaseActivity implements Observer{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live);
        //notice
        muModel = new LiveDanMuModel();
        muModel.addObserver(this);
    }
    //notice
    @Override
    public void update(Observable observable, final Object obj) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String str = (String) obj;
                Log.e("zcjyh", "show" + str);
                jcVideoPlayerStandard.setUp(str
                        , JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "");
                jcVideoPlayerStandard.startVideo();

            }
        });
    }
}

public class LiveDanMuModel extends Observable {
        public void onResponse(okhttp3.Call call, okhttp3.Response response){
             //notice
              setChanged();
              notifyObservers(mLiveVideoInfo.getData().getHls_url());
  }
}
```