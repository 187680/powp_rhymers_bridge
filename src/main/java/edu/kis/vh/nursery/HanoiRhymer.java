package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejectedCounter = 0;

    int reportRejected() {
        return totalRejectedCounter;
    }

    public void countIn(int input) {
        if (!isEmpty() && input > peekaboo())
            totalRejectedCounter++;
        else
            super.countIn(input);
    }
}
