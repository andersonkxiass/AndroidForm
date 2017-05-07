package br.com.involves.viewlook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.involves.viewluck.components.BuildType;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.view.FormLuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FormLuck formList = (FormLuck) findViewById(R.id.form_id);

        FormBuilder builder = new FormBuilder();
        builder.setFormType(BuildType.SINGLE);

        for (int i = 0; i < 10; i++) {

            builder.addMultiChoiceField("Checkbox Label - " + 1, new String[]{"A", "B", "C"});
            builder.addSingleChoiceField("RadioGroup Label - " + 1, new String[]{"1", "2", "3"});
            builder.addDropListField("Spinner Label -  " + 1, new String[]{"1", "2", "3"});
            builder.addDropListField("Spinner Label -  " + 1, new String[]{"1", "2", "3"});
        }

        formList.buildWith(builder);
    }
}