package com.tms.lesson13_hw.exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
    }
    public WrongPasswordException(String string){
        super(string);
    }
}
