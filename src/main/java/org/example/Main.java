package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 9));
        System.out.println (area(-1.0, 4.0));// true
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock<0||clock>23){
            return false;
        }else if(isBarking && (clock < 8 || clock >= 20)){
            return true;
        }
        else {
            return false;
        }
    }   public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge>13 && firstAge<19)||
        (secondAge>13 && secondAge<19)||
                (thirdAge>13 && thirdAge<19)){
            return true;

        }return false;

    }  public static boolean isCatPlaying(boolean isSummer, int temp) {
            if((temp>25 && temp<35)||!isSummer){
                return true;
            }else {
                return false;
            }

    }
    public static double area(double width, double height) {
        if(width<0||height<0){
            return -1;
        } else {
            return width*height;
        }
    }

    public static double area(double radius) {
        if (radius<0){
            return -1;
        }else {
            return radius*radius*Math.PI;
        }
    }


}
