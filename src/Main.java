import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Mission 8.1");
        int[] bunchNumbers1 = new int[3];
        bunchNumbers1[0] = 1;
        bunchNumbers1[1] = 2;
        bunchNumbers1[2] = 3;

        double[] fractions1 = {1.57, 7.654, 9.986};

        char[] turbulentFantasy1 = {115, 107, 121, 96, 112, 114, 111};


        System.out.println(" ");
        System.out.println("Mission 8.2");

        int[] bunchNumbers = new int[3];
        //int [] bunchNumbers={ 1, 2, 3};
        bunchNumbers[0] = 1;
        bunchNumbers[1] = 2;
        bunchNumbers[2] = 3;
        System.out.println(Arrays.toString(bunchNumbers));
        //for (int i = 0; i < bunchNumbers.length; i++) {
        //System.out.print(bunchNumbers[i]);}

        //double [] fractions= new double[];
        //fractions[0]=1.57;
        //fractions[1]=7.654;
        //fractions[2]=9.986;
        double[] fractions = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fractions));
        //for (int i = 0; i < fractions.length; i++) {
        //   System.out.print(fractions[i]);}


        char[] turbulentFantasy = {115, 107, 121, 96, 112, 114, 111};
        String turbulentFantasyString = turbulentFantasy.toString();
        System.out.print(turbulentFantasy); // здесь позволил себе немного творчества


        System.out.println(" ");
        System.out.println("Mission 8.3");

        int[] bunchNumbers2 = new int[3];
        bunchNumbers2[0] = 1;
        bunchNumbers2[1] = 2;
        bunchNumbers2[2] = 3;
        for (int i = bunchNumbers2.length-1; i >= 0; i--)
            if (i > 0) {
                System.out.print(bunchNumbers2[i] + ", ");
            } else {
                System.out.print(bunchNumbers2[i]);
            }
        System.out.println();


        double[] fractions2 = {1.57, 7.654, 9.986};
        for (int i = fractions2.length - 1; i >= 0; i--)
            if (i > 0) {
                System.out.print(fractions2[i] + ", ");
            } else {
                System.out.print(fractions2[i]);
            }
        System.out.println();

        char[] turbulentFantasy2 = {115, 107, 121, 96, 112, 114, 111};
        for (int i = turbulentFantasy2.length - 1; i >= 0; i--)
            if (i > 0) {
                System.out.print(turbulentFantasy2[i] + ", ");
            } else {
                System.out.print(turbulentFantasy2[i]);
            }
        System.out.println();

        System.out.println(" ");
        System.out.println("Mission 8.4");

        int[] bunchNumbers3 = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < bunchNumbers3.length; i++) {
            if (bunchNumbers3[i] % 2 != 0 || bunchNumbers3[i]==0) {
                bunchNumbers3[i] += 1;
                System.out.print(bunchNumbers3[i] + " ");
            }
            else if (bunchNumbers3[i] % 2 == 0) System.out.print(bunchNumbers3[i] + " ");
        }
    }
}

// THE END