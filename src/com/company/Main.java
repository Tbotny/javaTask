package com.company;

import java.nio.file.FileSystemLoopException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileSystemLoopException {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number task: ");
        String task = in.nextLine();
        int numberTask = Integer.parseInt(task);

        switch (numberTask) {
            case 1:
                System.out.println("1. Chess Board");
                System.out.println("Input width: ");
                int width = in.nextInt();
                System.out.println("Input height: ");
                int height = in.nextInt();
                ChessBoard board = new ChessBoard(width, height);
                System.out.println(board.drawBoard());
                break;
            case 2:
                System.out.println("2. Analysis of envelopes");
                Envelopes envelopes = new Envelopes();
                envelopes.run();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("5. Number To Words");
                System.out.println("Input number: ");
                int number = in.nextInt();
                NumberInWord stringRow = new NumberInWord();
                stringRow.numberToWords(number);
                break;
            case 6:
                break;
            case 7:
                System.out.println("7. NumberRow");
                new NumberRow(60, 4);
                break;
            case 8:
                System.out.println("8. RowFibonacci");
                RowFibonacci fibonacci = new RowFibonacci(5, 55, 143);
                fibonacci.createRowLength();
                fibonacci.createRowDiapason();
                break;
            case 9:
                break;
            default:
                throw new FileSystemLoopException("Invalid type");

        }
    }
}
