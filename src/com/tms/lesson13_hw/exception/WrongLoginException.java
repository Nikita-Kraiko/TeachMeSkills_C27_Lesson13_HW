package com.tms.lesson13_hw.exception;

public class WrongLoginException extends Exception{
    public WrongLoginException(){

    }
    public WrongLoginException(String string){
        super(string);
    }

}
