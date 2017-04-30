# AndroidForm
Dynamic form builder

NOTE: This project is under construction and has not yet been released. 

**How to use:**

```xml
<br.com.involves.viewluck.view.FormView
    android:id="@+id/form_id"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

**Create form and configure.**

```Java
FormView formList = (FormView) findViewById(R.id.form_id);

FormBuilder builder = new FormBuilder();
builder.setFormType(BuildType.QUESTIONS);
builder.addMultiChoiceField("Checkbox Label", new String[]{"A", "B", "C"});
builder.addSingleChoiceField("RadioGroup Label", new String[]{"1", "2", "3"});
builder.addDropListField("Spinner Label", new String[]{"1", "2", "3"});

formList.buildWith(builder);
```

<img src="https://github.com/andersonkxiass/AndroidForm/blob/master/images/form_screen.png" width="350" heigth="350">


**TODO:**

* Theme for each component
* Save form state.
* Create Date,InputText components.
* Components validation.
* Tests.
