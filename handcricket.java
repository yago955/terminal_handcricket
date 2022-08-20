import java.util.*;
public class handcricket
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the host");
        String h=sc.next();
        System.out.println("Enter the name of player1");
        String p1=sc.next();
        System.out.println("Enter the name of player2");
        String p2=sc.next();
        System.out.println(" Rules of the game: \n 1: the host shall operate the device all time \n 2: "+p1+" and "+p2+" will be given to enter the runs and if they both match then it will be considered as an out \n PLAY FAIR AND HAVE FUN!");
        System.out.println("enter any number to start the game");
        int start=sc.nextInt();//start


        System.out.println("processing...");
        System.out.println("Enter any number to start the randon toss");
        int tosstart=sc.nextInt();
        int tossran= 1+(int)(Math.random()*10);
        int bat1=0,ball1=0;
        if(tossran>5)
        {
            System.out.println("The toss is won by "+p1);
            System.out.println("Enter 1 to choose bating or Enter 2 to choose balling");
            int choicep1=sc.nextInt();
            switch(choicep1)
            {
                case 1 : bat1=1; break;
                case 2 : bat1=2; break;
                default : System.out.println("Wrong choice!:");
            }
        }
        else
        {
            System.out.println("The toss is won by "+p2);
            System.out.println("Enter 1 to choose bating or Enter 2 to choose balling");
            int choicep2=sc.nextInt();
            switch(choicep2)
            {
                case 1 : bat1=2; break;
                case 2 : bat1=1; break;
                default : System.out.println("Wrong choice!:");
            }
        }
        int check=0;
        System.out.println("Enter the number of overs you want to play");
        int o=sc.nextInt();
        o=o*6;
        System.out.println("The number of balls which will be played by the both players are " + o);
        int o1= o;
        int o2= o;
        int s11=0,s12=0;
        if(bat1==1)
        {
            while(o1!=0)
            {
                System.out.println(p1+" enter your runs out of 6");
                int p1r=sc.nextInt();
                System.out.println(p2+" enter your runs out of 6");
                int p2r=sc.nextInt();
                if(p1r==p2r)
                {
                    break;
                }
                s11+=p1r;
                o1--;
            }
            check=1;
            bat1=3;
        }
        if(bat1==2)
        {
            while(o2!=0)
            {
                System.out.println(p2+" enter your runs out of 6");
                int p2r=sc.nextInt();
                System.out.println(p1+" enter your runs out of 6");
                int p1r=sc.nextInt();
                if(p2r==p1r)
                {
                    break;
                }
                s12+=p2r;
                o2--;
            }
            check=2;
            bat1=4;
        }
        else
        {
            System.out.println("CODE CRASHED");
        }
        if(check==1)
        {
            System.out.println(p1+" your total runs: "+s11);
        }
        if(check==2)
        {
            System.out.println(p2+" your total runs: "+s12);
        }
        else
        {
            System.out.println("CODE CRASHED");
        }
        System.out.println("Enter any number to continue...");
        int c2=sc.nextInt();
        int check2=0;
        int o3=o, o4=o;
        int s21=0,s22=0;
        int last=0;
        if(bat1==3)
        {
            while(o3!=0)
            {
                System.out.println(p2+" enter your runs out of 6");
                int p2r=sc.nextInt();
                System.out.println(p1+" enter your runs out of 6");
                int p1r=sc.nextInt();
                if(p2r==p1r)
                {
                    break;
                }
                s22+=p2r;
                o3--;
            }
            check=2;
            last=2;
        }
        if(bat1==4)
        {
            while(o4!=0)
            {
                System.out.println(p1+" enter your runs out of 6");
                int p1r=sc.nextInt();
                System.out.println(p2+" enter your runs out of 6");
                int p2r=sc.nextInt();
                if(p1r==p2r)
                {
                    break;
                }
                s21+=p1r;
                o4--;
            }
            check=1;
            last=1;
        }
        if(check==2)
        {
            System.out.println(p2+" your total runs: "+s22);
        }
        if(check==1)
        {
            System.out.println(p1+" your total runs: "+s21);
        }
        else
        {
            System.out.println("CODE CRASHED");
        }
        System.out.println("Enter any number to continue");
        int c3=sc.nextInt();
        if(last==2)
        {
            if(s11>s22)
            {
                System.out.println(p1+" won the match!");
            }
            else if(s11<s22)
            {
                System.out.println(p2+" won the match!");
            }
            else
            {
                System.out.println("Its a draw!");
            }
        }
        if(last==1)
        {
            if(s12>s21)
            {
                System.out.println(p2+" won the match!");
            }
            else if(s12<s21)
            {
                System.out.println(p1+" won the match!");
            }
            else
            {
                System.out.println("Its a draw!");
            }
        }
    }
}
