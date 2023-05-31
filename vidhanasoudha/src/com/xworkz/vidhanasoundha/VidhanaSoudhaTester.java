package com.xworkz.vidhanasoundha;

public class VidhanaSoudhaTester {
    public static void main(String[] args){
        Cabinet cab=new Cabinet();
        VidhanaSoudha soudha=new VidhanaSoudha(cab);
        VidhanaSoudha.cabinet.toRule();
    }
}
