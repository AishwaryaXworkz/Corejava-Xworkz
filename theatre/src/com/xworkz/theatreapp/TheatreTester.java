package com.xworkz.theatreapp;
import java.util.Scanner;
public class TheatreTester {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Theatre theatre=new Theatre();
        for(int index=0;index<theatre.movieNames.length;index++)
        {
            System.out.println("enter the movie names:");
            String movies=sc.next();
            theatre.addMovie(movies);
        }
        theatre.getMovieNames();
    }
}
