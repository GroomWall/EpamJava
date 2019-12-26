package Lesson2.practical;

public class Task2_2 {
    public static void main(String[] args) {
        long currentTime=System.currentTimeMillis() / 1000;
        long ss=currentTime % 60;
        long mm=(currentTime/60) % 60;
        long hh=currentTime / (60 * 60) % 24;
        long dd=currentTime / (60 * 60 * 24);
        System.out.println(dd + ":" + hh + ":" + mm + ":" + ss);

    }
}
