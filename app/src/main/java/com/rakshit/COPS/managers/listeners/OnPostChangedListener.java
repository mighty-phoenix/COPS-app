package com.rakshit.COPS.managers.listeners;

import com.rakshit.COPS.model.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
