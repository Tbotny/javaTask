package com.company;

public class NumberRow {

    NumberRow(long lengthRow, long minSquare) {
        System.out.println(createRow(lengthRow, minSquare));
    }

    private long getSquare(long number) {
        return number * number;
    }

    private String createRow(long lengthRow, long minSquare) {
        StringBuilder row = new StringBuilder();

        for (long rowCounter = 1; rowCounter <= lengthRow; rowCounter++) {
            if (rowCounter > getSquare(minSquare)) {
                row.append(rowCounter);

                if (rowCounter != lengthRow) {
                    row.append(", ");
                }
            }
        }

        return row.toString();
    }
}
