import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

public class _d_TestRedDegreeSinCos {
    public static void main(String[] args) {
        //value of PI in degrees
        double rad=PI;
        System.out.println(toDegrees(rad));

        //value ofPI/2in degrees
        rad=PI/2;
        System.out.println(toDegrees(rad));

        //value ofPI/3 in degrees
        rad=PI/3;
        System.out.println(toDegrees(rad));

        //value ofPI/4 in degrees
        rad=PI/4;
        System.out.println(toDegrees(rad));

        System.out.println("sin 90 derajat adalah"+ sin(toRadians(90)));
        System.out.println("cos 60 derajat adalah"+ cos(toRadians(60)));

    }
}
