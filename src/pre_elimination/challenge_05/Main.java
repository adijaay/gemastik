package pre_elimination.challenge_05;

import helper.ExecutionTimeHelper;
import helper.MemoryUsageHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        final String[] adhi = in.nextLine().split(" ");
        final String[] vijay = in.nextLine().split(" ");
        if(adhi.length<3||adhi.length>100||vijay.length<3||vijay.length>100) throw new ArithmeticException("3-100 angka");
        in.close();
        final long startTime = System.nanoTime();
        int[] daduA = new int[adhi.length];
        int maxA = Integer.MIN_VALUE;
        for (int i = 0; i < adhi.length; i++) {
            daduA[i] = Integer.parseInt(adhi[i]);
            if(daduA[i]<1||daduA[i]>100)throw new ArithmeticException("1-100 saja");
            if (maxA < daduA[i]) maxA = daduA[i];
        }

        int[] daduB = new int[vijay.length];
        int maxB = Integer.MIN_VALUE;
        for (int i = 0; i < vijay.length; i++) {
            daduB[i] = Integer.parseInt(vijay[i]);
            if(daduB[i]<1||daduB[i]>100)throw new ArithmeticException("1-100 saja");
            if (maxB < daduB[i]) maxB = daduB[i];
        }

        int[] cntA = new int[maxA + 1];
        int[] cntB = new int[maxB + 1];
        for (int i = 0; i < adhi.length; i++) {
            cntA[daduA[i]]++;
            cntB[daduB[i]]++;
        }

        // count probability
        double[] probA = new double[maxA + 1];
        double[] probB = new double[maxB + 1];
        for (int i = 0; i < probA.length; i++) {
            probA[i] = 1.0 * cntA[i] / adhi.length;
        }
        for (int i = 0; i < probB.length; i++) {
            probB[i] = 1.0 * cntB[i] / vijay.length;
        }

        // count menang Adhi
        double menangAdhi = 0.0;
        for (int i = 0; i < probA.length; i++) {
            for (int j = 0; j < probB.length; j++) {
                if (probA[i] != 0 && probB[j] != 0 && i > j) {
                    menangAdhi += probA[i] * probB[j];
                }
            }
        }

        // count menang Vijay
        double menangVijay = 0.0;
        for (int i = 0; i < probB.length; i++) {
            for (int j = 0; j < probA.length; j++) {
                if (probB[i] != 0 && probA[j] != 0 && i > j) {
                    menangVijay += probB[i] * probA[j];
                }
            }
        }
        int y = (int) (menangAdhi * 36);
        int z = (int) (menangVijay * 36);
        int bagi = 36;
        if (menangVijay == menangAdhi) {
            System.out.println("Imbang");
        } else if (menangAdhi > menangVijay) {
            for (int i = 0; i < 1; ) {
                if (y % 2 == 0 && bagi % 2 == 0) {
                    y = y / 2;
                    bagi = bagi / 2;
                } else if (y % 3 == 0 && bagi % 3 == 0) {
                    y = y / 3;
                    bagi = bagi / 3;
                } else if (y % 5 == 0 && bagi % 5 == 0) {
                    y = y / 5;
                    bagi = bagi / 5;
                } else i++;
                if (i == 1)
                    System.out.format("Adhi menang dengan peluang %d/%d%n", y, bagi);
            }
        } else {
            for (int i = 0; i < 1; ) {
                if (z % 2 == 0 && bagi % 2 == 0) {
                    z = z / 2;
                    bagi = bagi / 2;
                } else if (z % 3 == 0 && bagi % 3 == 0) {
                    z = z / 3;
                    bagi = bagi / 3;
                } else if (z % 5 == 0 && bagi % 5 == 0) {
                    z = z / 5;
                    bagi = bagi / 5;
                } else i++;
                if (i == 1)
                    System.out.format("Vijay menang dengan peluang %d/%d%n", z, bagi);
            }
        }
        ExecutionTimeHelper.printExecutionTime(startTime);
        MemoryUsageHelper.printMemoryUsage();
    }
}
