public class OOPSBannerUC3 {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC3: Using String.join()");
        System.out.println();
        System.out.println(String.join(" ",
                "*********", "*********", "*********", "*********"));
        System.out.println(String.join(" ",
                "**     **", "**     **", "**     **", "**      "));
        System.out.println(String.join(" ",
                "**     **", "**     **", "**     **", "**      "));

        System.out.println(String.join(" ",
                "**     **", "**     **", "*********", "*********"));
        System.out.println(String.join(" ",
                "**     **", "**     **", "**", "       **"));
        System.out.println(String.join(" ",
                "**     **", "**     **", "**", "       **"));
        System.out.println(String.join(" ",
                "*********", "*********", "**", "*********"));
    }
}