package com.company;
public class Main
{
    public static void main(String[] args)
    {
        byte FirstByteNum= 99;
        short FirstShortNum=202;
        int FirstIntNum=20341;

        long BigNum=50000l+10l*(FirstByteNum+FirstShortNum+FirstIntNum); //for the "(FirstByteNum+FirstShortNum+FirstIntNum)"type casting isn't required because the max possible value for int h=can fit in long"
        System.out.println(BigNum);

        //but on the other hand

        //short SmolNum=1000+9*(FirstIntNum);   // it says required it "short" and provided is "int" you can typecast it by adding "short" before the value as such...

        short SmolNum= (short) (1000+9*(FirstIntNum));  //also make sure to enclose the whole value you wanna typecast within brackets :)

        float a= (float) 0.023;

        System.out.println(a);
    }
}
