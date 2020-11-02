package com.company;

public class Envelop {
    class Envelope {
        private final double width;
        private final double height;

        Envelope(Double width, Double height) {
            this.width = width;
            this.height = height;
        }

        public boolean canTakeIn(Envelope innerEnvelope) {
            return this.width > innerEnvelope.width && this.height > innerEnvelope.height;
        }
    }
}
