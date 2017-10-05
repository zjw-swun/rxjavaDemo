import i.Observable;
import i.Observer;
import i.Subscriber;
import opera.Fun1;

public class Test {

    public static void main(String[] args) {
        Observable.create(new Subscriber<String>() {
            @Override
            public void subscribe(Observer<String> observer) {
                System.out.println("Subscriber() 所在线程: " + Thread.currentThread().getName());
                observer.onNext("1");
            }
        }).map(new Fun1<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).subscribeOn().observeOn().subscribe(new Observer<Integer>() {
            @Override
            public void onNext(Integer s) {
                System.out.println("onNext() 所在线程: " + Thread.currentThread().getName());
                System.out.println("onNext() 结果: " + s);
            }
        });
    }
}
