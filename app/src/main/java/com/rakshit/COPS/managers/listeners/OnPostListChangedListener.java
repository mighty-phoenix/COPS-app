package com.rakshit.COPS.managers.listeners;

import com.rakshit.COPS.model.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
