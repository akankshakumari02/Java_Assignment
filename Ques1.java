import java.util.Scanner;
interface Details
{

    public void bookdetails(int bno, String bname, String d);
    public void userdetails(int uid, String uname);

}

abstract class Book implements Details
{

    int bno;
    String bname;
    String doi;

    public void display()
    {

        System.out.println("Book Number : " + bno);
        System.out.println("Book Name : " + bname);
        System.out.println("Date of Issue : " + doi);

    }
}

class Library extends Book
{

    int uid;
    String uname;

    public void bookdetails(int bno, String bname, String doi){

        this.bno = bno;
        this.bname = bname;
        this.doi = doi;

    }

    public void userdetails(int uid, String uname){

        this.uid = uid;
        this.uname = uname;

    }

    public void display()
    {

        System.out.println("\nUser Details are : ");

        System.out.println("User ID - " + uid);
        System.out.println("User Name - " + uname);

        System.out.println("Books Details are : ");
        super.display();

    }
}

class Ques1
{
    static Scanner sc;
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        int uid,bid;
        String bname,uname,issuedate;

        Book obj1 = new Library();

        System.out.print("\nEnter user id : ");
        uid = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter user name : ");
        uname = sc.nextLine();
        System.out.print("\nEnter book id : ");
        bid = sc.nextInt();
        System.out.print("\nEnter book name : ");
        bname = sc.next();
        sc.nextLine();
        System.out.print("\nEnter Date of isuue : ");
        issuedate = sc.nextLine();

        obj1.userdetails(uid,uname);
        obj1.bookdetails(bid, bname, issuedate);
        obj1.display();

    }
}