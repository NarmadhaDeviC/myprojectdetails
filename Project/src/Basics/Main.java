package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ArrayList<Bike> bike=new ArrayList();
      bike.add(new Bike());
      bike.add(new Bike());
      bike.add(new Bike());
      
      for(Bike b:bike)
      
      {
        System.out.println(b.mil);
        System.out.println(b.company);
        System.out.println(b.price);
      }
      

  }
}


class Bike
{
  int mil;
  String company;
  double price;
  
  Bike()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter details");
    int mil=sc.nextInt();
    String company=sc.next();
    double price=sc.nextDouble();
    this.mil=mil;
    this.company=company;
    this.price=price;
  }
  public String toString()
  {
    return mil + company +price;
  }
  
}