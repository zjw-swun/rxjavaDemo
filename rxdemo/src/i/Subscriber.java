package i;

import i.Observer;

public interface Subscriber<K> {

    void subscribe(Observer<K> observer) ;

}
