package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int total = 50;
        int cancel;
        int t = 0, ticket, person = 0;
        int[] per =new int[50];
        int[] tic =new int[50];
        int[]ct=new int[50];
        for(;;){
            System.out.println("BOOK FLIGHTS PRESS ENTER 1");
            System.out.println("CANCEL TICKET PRESS ENTER 2");
            System.out.println("PRINT DETAILS PRESS ENTER 3");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println("TICKET AMT 2500 PER PERSON");
                    System.out.println("HOW MANY TICKETS");
                        ticket = sc.nextInt();
                        if (count == 0) {
                            total = total - ticket;
                            person += 1;
                            per[count] = person;
                            tic[count]=ticket;
                            System.out.println("YOUR TICKET IS BOOKED ID IS " + person);
                            System.out.println("AND AVAILABLE TICKETS ARE : " + " " + total);
                            t = total;
                            System.out.println("TOTAL AMOUNT OF YOUR TICKET IS"+" "+2500*ticket);
                            count++;

                        } else if (count >= 1) {
                            if (t == 0) {
                                System.out.println("TICKET IS FULL");
                            } else {
                                total = total - ticket;
                                person += 1;
                                per[count] = person;
                                tic[count]=ticket;
                                System.out.println("YOUR TICKET IS BOOKED ID IS " + person);
                                System.out.println("AND AVAILABLE TICKETS ARE : " + " " + total);
                                t = total;
                                System.out.println("TOTAL AMOUNT OF YOUR TICKET IS "+2500*ticket);
                                count++;

                            }
                        }
                    }

                case 2 -> {
                    System.out.println("ENTER PERSON ID");
                    int p = sc.nextInt();
                    for (int i = 1; i <= count; i++) {
                        if (per[i] == p) {
                            System.out.println("HOW MANY TICKETS YOU BOOKED");
                            int n1 = sc.nextInt();
                            if (tic[i] == n1) {
                                System.out.println("YOU ENTER CORRECT DATA");
                                System.out.println("HOW MANY TICKETS WILL BE CANCEL");
                                cancel = sc.nextInt();
                                System.out.println("YOUR TICKET IS CANCELED PERSON ID IS" + " " + per[i]);
                                System.out.println("YOUR REFUND AMOUNT IS " + 2500 * cancel);
                                ct[i]=cancel;
                                cancel = cancel + t;

                                System.out.println("AND AVAILABLE TICKETS ARE : " + " " + cancel);
                            } else {
                                System.out.println("YOU ENTER WRONG DATA");
                            }
                        }
                    }
                }
                    case 3 ->
                    {

                        for(int i=0;i<count;i++)
                        {
                            int b1=tic[i]-ct[i];
                            System.out.println("PERSON ID IS "+per[i]+" "+"BOOKED TICKET AND AMOUNT IS "+b1*2500);
                        }
                    }
            }
        }

    }
}

