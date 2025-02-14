package sk.kas.mirda.Cameras.SchoolWork;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface DPH {
    double calc(double price);
}


public class Lambda {
    public static void main(String[] args) {
//        int dph20 = 20;
//        int dph23 = 23;
//        int dph19 = 19;
//
//        DPH dph1 = (price) -> price * dph20 / 100 + price;
//        DPH dph2 = (price) -> price * dph23 / 100 + price;
//        DPH dph3 = (price) -> price * dph19 / 100 + price;
//
//
//        System.out.println(dph1.calc(100));
//        System.out.println(dph2.calc(100));
//        System.out.println(dph3.calc(100));
//
//        Predicate<Integer> has2Digits = (number) -> number > 9 && number < 100;
//        System.out.println(has2Digits.test(10));
//        System.out.println(has2Digits.test(12));
//
//
//
//        Predicate<LocalDate> isWeekend = date -> {
//            DayOfWeek day = date.getDayOfWeek();
//            return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
//        };
//
//        LocalDate date = LocalDate.of(2025, 2, 10);
//        System.out.println(isWeekend.test(date));
//
//
//        Function<String, Character> firstLetter = (text) -> text.charAt(0);
//        System.out.println(firstLetter.apply("Hello"));
//
//        Function<Date,String> monthToString  = (datetos) -> {
//            int month = datetos.getMonth();
//            switch (month){
//                case 1:
//                    return "January";
//                case 2:
//                    return "February";
//                case 3:
//                    return "March";
//                case 4:
//                    return "April";
//                case 5:
//                    return "May";
//                case 6:
//                    return "June";
//                case 7:
//                    return "July";
//                case 8:
//                    return "August";
//                case 9:
//                    return "September";
//                case 10:
//                    return "October";
//                case 11:
//                    return "November";
//                case 12:
//                    return "December";
//                default:
//                    return "Unknown";
//            }
//        };
//        System.out.println(monthToString.apply(new Date(2025, 4, 10)));
//
//        Consumer<String> print = (text) -> System.out.println(text);
//        print.accept("Hello World");
//
//        Supplier<Character> randomLetter = () -> {
//            int random = (int) (Math.random() * 26 + 65);
//            return (char) random;
//        };
//        System.out.println(randomLetter.get());
//
//        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 17 + 1);
//        System.out.println(randomNumber.get());

        List<String> cameras = List.of("Canon", "Nikon", "Sony", "Panasonic", "Olympus", "Fujifilm", "Leica", "Pentax", "Hasselblad", "Ricoh");
        List<String> cameras_filter = cameras.stream()
                .filter(camera -> camera.length() > 4 && Character.toLowerCase(camera.charAt(0)) == Character.toLowerCase(camera.charAt(camera.length() - 1)))
                .toList();
        System.out.println(cameras_filter);
//
 }

}
