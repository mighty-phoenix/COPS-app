package com.rakshit.COPS.managers.listeners;

import java.util.List;

/**
 * Created by Kristina on 10/28/16.
 */

public interface OnDataChangedListener<T> {

    public void onListChanged(List<T> list);
}
