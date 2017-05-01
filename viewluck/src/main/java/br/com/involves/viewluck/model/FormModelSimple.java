package br.com.involves.viewluck.model;

/**
 * Created by andersonk on 01/05/17.
 */

public class FormModelSimple extends FormModel{
    private String answer;

    public FormModelSimple() {
    }

    public FormModelSimple(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
