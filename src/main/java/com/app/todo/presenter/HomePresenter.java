package com.app.todo.presenter;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by mohitesh on 03/11/16.
 */

public class HomePresenter extends BasePresenterImpl<HomeView> {

    @Inject
    HomePresenter(Context baseContext) {
        super(baseContext);
    }


}
