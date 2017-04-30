package br.com.involves.viewluck.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import java.util.List;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.databinding.ViewluckCheckboxBinding;
import br.com.involves.viewluck.viewmodel.MultiChoiceViewModel;

/**
 * Created by andersonk on 28/03/17.
 */
public class ViewLuckMultipleChoice extends LinearLayoutCompat {

    private MultiChoiceViewModel viewModel;

    public ViewLuckMultipleChoice(Context context) {
        super(context);
        init(context);
    }

    public ViewLuckMultipleChoice(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {

        viewModel = new MultiChoiceViewModel();

        ViewluckCheckboxBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.viewluck_checkbox,this, true);
        binding.setVm(viewModel);

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getContext(), "Position " + position + " Clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void setLabel(String label) {
        viewModel.setFieldLabel(label);
    }

    public void populateAdapter(List<String> options) {
        viewModel.setFieldValue(options);
    }
}