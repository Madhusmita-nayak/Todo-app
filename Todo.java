package com.todo.madhu;
import java.util.*;
import java.util.ArrayList;
public class Todo {
    static Scanner sc=new Scanner(System.in);
    static Todo t=new Todo();
    static  ArrayList<String> todo=new ArrayList<>();
    public void New()
    {
        int i=0;
        System.out.println("How many elements you want to insert");
        i=sc.nextInt();
        System.out.println("Add elements to the list:");
        while (i!=0) {
            todo.add(sc.next());
            i--;
        }
        System.out.println("Successfully added.");
    }
    public void exist()
    {
        int i=0;
        System.out.println("How many new inputs are there:");
        i=sc.nextInt();
        System.out.println("Add elements to the list:");
        while (i!=0) {
            todo.add(sc.next());
            i--;
        }
        System.out.println("Successfully added.");
    }
    public void Delete()
    {
       String dlt;
        System.out.println("Which data to be deleted:");
        dlt= sc.next();
        todo.remove(dlt);
        System.out.println("Element deleted successfully.");
    }
    public void display()
    {
        System.out.println("The list:"+todo);
    }
    public static void main(String[] args) {
        int opt=0;
        while(opt!=5)
        {
            System.out.println(" 1.New \n 2.Add to existing \n 3.Delete \n 4.Display \n 5.Exit");
            System.out.println("Enter any option:");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                    t.New();
                    break;
                case 2:
                    t.exist();
                    break;
                case 3:
                    t.Delete();
                    break;
                case 4:
                    t.display();
                    break;
                case 5:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Choose the right option");
            }
        }

    }
}
