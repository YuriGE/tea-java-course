package com.testautomation;
import java.time.Year;
/* Homework 3 - GitHub PR Workflow demonstration
@author Yuri Kirkitadze
 */
public class Homework3 {

    // მეთოდი, რომელიც აბრუნებს მიმდინარე წელს
    public static int getCurrentYear() {
        return Year.now().getValue();
    }

    public static void main(String[] args) {
        String author = "Yuri Kirkitadze";
        int birthYear = 1995;
        int age = getCurrentYear() - birthYear;

        System.out.println("My name is " + author + ". I'm " + age + " years old.");
    }
}
