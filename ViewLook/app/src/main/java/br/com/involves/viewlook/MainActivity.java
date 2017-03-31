package br.com.involves.viewlook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.view.FormView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FormView formList = (FormView) findViewById(R.id.form_id);

        FormBuilder builder = new FormBuilder();
        builder.setFormType(BuildType.QUESTIONS);
        builder.addMultiChoiceField("Checkbox Label", new String[]{"A", "B", "C"});
        builder.addSingleChoiceField("RadioGroup Label", new String[]{"1", "2", "3"});
        builder.addDropListField("Spinner Label", new String[]{"1", "2", "3"});

        formList.buildWith(builder);
    }
}