package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int x, y;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę x: ");
        x = scanner.nextInt();
        System.out.print("Podaj liczbę y: ");
        y = scanner.nextInt();

        for (int z = x; z <= y; z++)
        {
            if (1 == z % 2)
            {
                System.out.println(z);
            }
        }
    }
}