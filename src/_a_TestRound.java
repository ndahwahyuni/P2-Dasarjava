import static java.lang.Math.round;

public class _a_TestRound {
    public static void main(String[] args) {
        double varDouble=2.73;
        long roundResult=round(varDouble);
        System.out.printf("pembulatan round %.2f adalah %d\n",varDouble,roundResult);

        varDouble=2.49;
        roundResult=round(varDouble);
        System.out.printf("pembuatan floor%.2f adalah %d\n",varDouble,roundResult);
    }
}
