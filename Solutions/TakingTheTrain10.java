import java.util.Scanner;
public class TakingTheTrain10 {
    public static void main(String[] args) {
        int rideRed = 0;
        int rideBlue = 0;
        Scanner scanner = new Scanner(System.in);
        int redTime = scanner.nextInt();
        int blueTime = scanner.nextInt();
        double startTime = scanner.nextDouble();
        for (double time=startTime;time<60;time++){
            if (-(time%redTime)+redTime>-(time%blueTime)+blueTime) rideBlue++;
            else if (-(time%redTime)+redTime<-(time%blueTime)+blueTime) rideRed++;
            else if (redTime<blueTime) rideBlue++;
            else rideRed++;
        }
        System.out.println(rideRed>rideBlue ? "Red" : (rideRed==rideBlue? "Equal" : "Blue"));
    }
}
