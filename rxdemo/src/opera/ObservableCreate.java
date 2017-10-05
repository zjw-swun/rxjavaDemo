package opera;

import i.Observable;
import i.Observer;
import i.Subscriber;

public class ObservableCreate<T> extends Observable<T> {

    private Subscriber<T> source;

    public ObservableCreate(Subscriber<T> source) {
        this.source = source;
    }

    @Override
    public void subscribeActual(Observer<T> observer) {
        super.subscribeActual(observer);
        source.subscribe(observer);
    }
}
