package br.com.involves.viewluck.components;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by andersonk on 04/05/17.
 */

public class SelectionViewSingle extends LinearLayoutCompat {

    SingleChoiceAdapter singleChoiceAdapter;

    public SelectionViewSingle(Context context) {
        super(context);
    }

    public SelectionViewSingle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private static class SingleChoiceAdapter extends RecyclerView.Adapter<ChoiceSingleVH>{

        @Override
        public ChoiceSingleVH onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(ChoiceSingleVH holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class ChoiceSingleVH extends RecyclerView.ViewHolder{

        public ChoiceSingleVH(View itemView) {
            super(itemView);
        }
    }
}