package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer dcor = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty())

            dcor.countIn(super.countOut());

        int value = dcor.countOut();

        while (!dcor.isEmpty())

            countIn(dcor.countOut());

        return value;
    }
}
