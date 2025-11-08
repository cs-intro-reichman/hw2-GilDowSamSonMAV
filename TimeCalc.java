public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int addOnMinutes = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + addOnMinutes;

        int totalhours = totalMinutes / 60;
        int newMinutes = totalMinutes - (totalhours * 60);
        int newHours = totalhours % 24;

        if (newMinutes < 10 && newHours != 00) {
            System.out.println(newHours + ":0" + newMinutes);
        } else {
            System.out.println(newHours + ":" + newMinutes);
        }
        if (newHours == 00) {
            if (newMinutes < 10) {
                System.out.println(newHours + "0:0" + newMinutes);
            } else {
                System.out.println("0" + newHours + ":" + newMinutes);
            }
        }

    }
}
