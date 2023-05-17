package com.xworkz.theatreapp;

public class Theatre {
    String movieNames[]=new String[5];
    int index;
    public boolean addMovie(String movies){
        boolean isAdded=false;
        if(movies!=null && index<movieNames.length){
            movieNames[index++]=movies;
            isAdded=true;
        }
        else {
            System.out.println("maximum movie names is exceed");
        }
        return isAdded;
    }
    public void getMovieNames(){
        System.out.println("movienames are available");
        for(int index=0;index< movieNames.length;index++)
        {
            System.out.println(movieNames[index]);
        }
    }
}
