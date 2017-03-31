package br.com.involves.viewluck.view;

/**
 * Created by andersonk on 16/03/17.
 */

public interface ViewLuck <T>{

    void setData( T object);
    T getData();
}