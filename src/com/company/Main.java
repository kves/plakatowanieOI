package com.company;

//https://szkopul.edu.pl/problemset/problem/au-E9FH96-3U9rCKhcNsD5n9/site/?key=statement

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int postersAmount = 0;
        int a = 0;

        Scanner scanner = new Scanner(System.in);
        int buildingsAmount = scanner.nextInt();
        int [] x = new int[buildingsAmount];
        int [] stack = new int[buildingsAmount ];

        x[0] = scanner.nextInt();
        stack[0] = scanner.nextInt(); //zapisanie pierwszej wysokosci do stosu

        for (int i = 1; i < buildingsAmount ; i++) { //pobranie kolejnych wysokosci budynkow i porownanie z poprzednimi wysokosciami
            x[i] = scanner.nextInt();
            int height = scanner.nextInt();
            while (height < stack[a]){ //jesli kolejny budynek jest nizszy musimy przykleic plakat
                postersAmount++;
                a--;
                if (a == -1) stack[++a] = height;
            }
            if (height > stack[a]) stack[++a] = height; //jesli kolejny budynek jest wyzszy to przedluzamy plakat
        }
        postersAmount += a+1; //dodatnie plakatow z pozostalych budynkow
        System.out.println(postersAmount);
    }
}
