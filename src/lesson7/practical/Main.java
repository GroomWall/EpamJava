package lesson7.practical;

public class Main {
    public static void main(String[] args) {

        Device[] devices = {
                new Device("AAAP01", "LG", 1100.0),
                new Adapter("MO200", "Dell",1000, 100, "432898-nfiei394-3jri3jk"),
                new Device("AAAP01", "LG", 1100.0),
                new Monitor("MP_321","HP", 8300, 1024, 848),
                new Monitor("MP_321","HP", 8300, 1024, 848)
        };

        for (Device obj:devices) {
            System.out.println(obj.toString());
        }
        boolean firstCheck = devices[0].hashCode() == devices[2].hashCode();
        boolean secondCheck = devices[3].hashCode() == devices[4].hashCode();
        System.out.println("Equals 1 and 3 - > " + devices[0].equals(devices[2]));
        System.out.println("Equals monitors 4 and 5 - > " + devices[3].equals(devices[4]));
        System.out.println("Hash devices 1 and 3 are equal - > " + firstCheck);
        System.out.println("Hash monitors 4 and 5 are equal - > " + secondCheck);
    }

}
