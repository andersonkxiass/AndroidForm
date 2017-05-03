package br.com.involves.viewlook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.components.BuildType;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.view.FormLuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());
        objectList.add(new Object());

        FormLuck formList = (FormLuck) findViewById(R.id.form_id);

        FormBuilder builder = new FormBuilder();
        builder.setFormType(BuildType.MULTI);
        builder.addMultiChoiceField("Checkbox Label", new String[]{"A", "B", "C"});
        builder.addSingleChoiceField("RadioGroup Label", new String[]{"1", "2", "3"});
        builder.addDropListField("Spinner Label", new String[]{"1", "2", "3"});
        builder.forObjectList(objectList);

        formList.buildWith(builder);
    }
}