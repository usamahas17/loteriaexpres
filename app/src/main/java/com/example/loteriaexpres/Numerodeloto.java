package com.example.loteriaexpres;

import java.util.Random;

public class Numerodeloto {
    int num1,num2,num3,num4, id,num5;
    Random r;
    public Numerodeloto(){
        r = new Random();

    }
    public Numerodeloto(int num1,int num2,int num3,int num4 ,int id,int num5){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.id = id;
        this.num5 = num5;


    }

    @Override
    public String toString() {
        return "Numerodeloto{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", id=" + id +
                ", num5=" + num5 +
                ", r=" + r +
                '}';
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
