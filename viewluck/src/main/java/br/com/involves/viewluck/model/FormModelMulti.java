package br.com.involves.viewluck.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonk on 01/05/17.
 */

public class FormModelMulti extends FormModel {

    private List<String> answers = new ArrayList<>();

    public FormModelMulti() {
    }

    public FormModelMulti(List<String> answers) {
        this.answers = answers;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public void addAnswer(String answer){
         answers.add(answer);
    }
}