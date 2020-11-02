package com.company;


class RowFibonacci {
    public long lengthRow;
    public long fistFibonacciNumber;
    public long lastFibonacciNumber;

    public RowFibonacci(long lengthRow, long fistFibonacciNumber, long lastFibonacciNumber) {
        this.lengthRow = lengthRow;
        this.fistFibonacciNumber = fistFibonacciNumber;
        this.lastFibonacciNumber = lastFibonacciNumber;
    }

    public void createRowLength() {
        long f1 = 1;
        long f2 = 1;
        long f3;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= this.lengthRow; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
        System.out.println();
    }

    public void createRowDiapason() {
        long f1 = 0;
        long f2 = 1;
        long f3 = 0;
        do {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            if (f3 >= this.fistFibonacciNumber) {
                System.out.print(f3 + " ");
            }
        }
        while (f3 < (this.lastFibonacciNumber - f3));
    }
}
