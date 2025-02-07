package sk.kas.mirda.Cameras.SchoolWork;



@FunctionalInterface
interface DPH {
    double calc(double price);
}


public class Lambda {
    public static void main(String[] args) {
        int dph20 = 20;
        int dph23 = 23;
        int dph19 = 19;

        DPH dph1 = (price) -> price * dph20 / 100 + price;
        DPH dph2 = (price) -> price * dph23 / 100 + price;
        DPH dph3 = (price) -> price * dph19 / 100 + price;


        System.out.println(dph1.calc(100));
        System.out.println(dph2.calc(100));
        System.out.println(dph3.calc(100));
    }


}
