package i;

import opera.*;

public class Observable<T> {


    public static <T> Observable<T> create(Subscriber<T> source) {
        return new ObservableCreate<>(source);
    }

    public <J> Observable<J> map(Fun1<T,J> fun1) {
        return new ObservableMap<>(this,fun1);
    }

    public LambdaObserver<T> subscribe(Observer<T> observer) {
        return new LambdaObserver<>(this,observer);
    }

    public Observable<T> subscribeOn() {
        return new ObservableSubscribeOn<>(this);
    }

    public Observable<T> observeOn() {
        return new ObservableObserveOn<>(this);
    }

    public void subscribeActual(Observer<T> observer) {

    }
}
