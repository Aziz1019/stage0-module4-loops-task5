package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if(height == 0){
            return;
        }
        int half = height / 2;
        for (int i = half; i >= 0; i--) {
            for (int j = 0; j < height; j++) {
                if (j >= half - i && j <= half + i) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= half; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= half - i && j <= half + i) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
