package ui;

import observer.Observer;

/**
 * Created by Илья on 19.04.2017.
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    int getState();

    void setState(int state);

    void notifySelf();
}
