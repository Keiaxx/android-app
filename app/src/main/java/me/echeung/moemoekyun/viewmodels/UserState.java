package me.echeung.moemoekyun.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class UserState extends BaseObservable {

    private static final UserState INSTANCE = new UserState();

    public final ObservableField<String> userName = new ObservableField<>();
    public final ObservableInt userRequests = new ObservableInt();
    public final ObservableInt queueSize = new ObservableInt();
    public final ObservableInt queuePosition = new ObservableInt();

    private UserState() {}

    public static UserState getInstance() {
        return INSTANCE;
    }

    public void clear() {
        INSTANCE.userName.set(null);
        INSTANCE.userRequests.set(0);
        INSTANCE.queueSize.set(0);
        INSTANCE.queuePosition.set(0);
    }
}