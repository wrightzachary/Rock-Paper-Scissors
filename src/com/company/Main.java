package com.company;

import java.util.Scanner;

public class Main {

    public static void  main (String[] args) {

        Scanner inputBuffer = new Scanner(System.in);
        String input;
        char move;
        int computer;
        final int P=0, R=1, S=2;

        System.out.println("Welcome to Rock-paper-Scissors");
        System.out.println("Please Enter Your move: R = Rock, P = Paper, S = Scissors");
        input = inputBuffer.nextLine();
        move = input.charAt(0);
        computer = (int)(Math.random() * 3);

        switch (computer){
            case P:
                System.out.println("Computer chose paper");
                break;

            case R:
                System.out.println("Computer chose rock");
                break;

            case S:
                System.out.println("Computer chose Scissors");
        }

        if ((move == 'R' || move == 'r') && computer == S){
            System.out.println("You Win! Rock Breaks Scissors!!");

        }
        else if ((move=='R' || move=='r') && computer == P){
            System.out.println("Computer Wins! Paper Covers Rock!!");
        }
        else if ((move=='R' || move=='r') && computer == R) {
            System.out.println("Tie!!");
        }
        else if ((move=='P' || move=='p') && computer == S){
            System.out.println("Computer Wins! Scissors Cut Paper!!");
        }
        else if ((move=='P'||move=='p') && computer == R){
            System.out.println("You Win! Paper Covers Rock!!");
        }
        else if ((move=='P'||move=='p') && computer == P) {
            System.out.println("Tie!!");
        }
        else if ((move=='S'||move=='s') && computer == P){
            System.out.println("You Win! Scissors Cut Paper!!");
        }
        else if ((move=='S'||move=='s') && computer == R) {
            System.out.println("Computer Wins! Rock Breaks Scissors!!");
        }
        else if ((move=='S'||move=='s') && computer == S) {
            System.out.println("Tie!!");
        }
        else {
            System.out.println("Invalid move!!");
        }
    }
}
