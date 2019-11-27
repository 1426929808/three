package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class NotRegisterValidator
        implements ConstraintValidator<NotRegister,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if(value!=null && value.equals("admin")) {
            System.out.println("你是admin");
            return true;
        }else{
            System.out.println("你不是admin");
            return false;
        }
    }


}
