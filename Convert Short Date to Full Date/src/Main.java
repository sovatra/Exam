

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String date;

        System.out.print("Enter Date(YYYY-MM-dd) : ");
        date=input.next();

        String[] arr_date=date.split("-");

        switch(arr_date[1]) {
            case "01":
                arr_date[1]="January";
                break;
            case "02":
                arr_date[1]="Febuary";
                break;
            case "03":
                arr_date[1]="March";
                break;
            case "04":
                arr_date[1]="April";
                break;
            case "05":
                arr_date[1]="May";
                break;
            case "06":
                arr_date[1]="June";
                break;
            case "07":
                arr_date[1]="July";
                break;
            case "08":
                arr_date[1]="August";
                break;
            case "09":
                arr_date[1]="September";
                break;
            case "10":
                arr_date[1]="October";
                break;
            case "11":
                arr_date[1]="November";
                break;
            case "12":
                arr_date[1]="December";
                break;
            default:
                System.out.println("Months Number only 01-12");

        }

        System.out.println("Output : " + arr_date[1]+" "+arr_date[2]+","+arr_date[0]);

    }
}