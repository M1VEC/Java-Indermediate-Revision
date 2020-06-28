package com.pbilton.Object.oriented.Programming.Revision;

public class TextBox {
    public String text =""; // Field
    public void setText(String name){
        this.text = name;
        //'this' dot operator is useful when the name of a parameter is the same name as the field
        //It inherits methods from other classes previously created
    }
    public void clear(){
        this.text ="";
    }
}
