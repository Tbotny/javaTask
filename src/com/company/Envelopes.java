package com.company;

import java.util.Scanner;


public class Envelopes extends Envelop {

    public void run() {
        System.out.println("Create envelop A");
        Envelope envelopeA = this.createEnvelop();
        System.out.println("Create envelop B");
        Envelope envelopeB = this.createEnvelop();
        if (envelopeA.canTakeIn(envelopeB)) {
            System.out.println("Envelope A can take in B");
        } else {
            System.out.println("Envelope A can not take in B");
        }
        if (envelopeB.canTakeIn(envelopeA)) {
            System.out.println("Envelope B can take in A");
        } else {
            System.out.println("Envelope B can not take in A");
        }
        this.dialogContinue();
    }

    private Envelope createEnvelop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input width: ");
        double width = in.nextDouble();
        System.out.println("Input height: ");
        double height = in.nextDouble();

        return new Envelope(width, height);
    }


    public void dialogContinue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String answer = in.nextLine();
        if (answer.equals("y") || answer.equals("yes")) {
            this.run();
        } else {
            System.out.println("Program is finished");
        }
    }
}
