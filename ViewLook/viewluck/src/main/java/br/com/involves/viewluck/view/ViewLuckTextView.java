package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

/**
 * Created by andersonk on 16/03/17.
 */
public abstract class ViewLuckTextView extends AppCompatTextView implements ViewLuck {

    public ViewLuckTextView(Context context) {
        super(context);
    }

    @Override
    public void setData(Object object) {}

    @Override
    public Object getData() {
        return null;
    }
}