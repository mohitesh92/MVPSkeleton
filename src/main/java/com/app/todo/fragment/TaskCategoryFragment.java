package com.app.todo.fragment;

import android.os.Bundle;
import android.text.TextUtils;

import com.app.todo.R;
import com.app.todo.component.ApplicationComponent;

/**
 * Created by mohitesh on 03/11/16.
 */

public class TaskCategoryFragment extends BaseViewPresenterFragment {

    private static final String TASK_CATEGORY = "category";

    public static TaskCategoryFragment newInstance(String category) {
        TaskCategoryFragment taskCategoryFragment = new TaskCategoryFragment();
        Bundle bundle = new Bundle();
        if(!TextUtils.isEmpty(category)) {
            bundle.putString(TASK_CATEGORY,category);
        }
        taskCategoryFragment.setArguments(bundle);

        return taskCategoryFragment;
    }

    @Override
    protected void initializePresenter() {

    }

    @Override
    protected void injectComponent(ApplicationComponent component) {

    }

    @Override
    int getFragmentLayout() {
        return R.layout.fragment_task_category;
    }
}
