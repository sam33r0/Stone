import java.util.*;
public class Stone {
public static void main(String arg[])
{
	Stone obj=new Stone();
	int p=0,pc=0,ph=0;
	Scanner ob1=new Scanner(System.in);
	Scanner ob=new Scanner(System.in);
	System.out.println("enter your name");
	String a=ob.nextLine();
	System.out.println("LETS PLAY STONE PAPER SCISSORS\n*************************\n___INSTRUCTIONS___\n");
	System.out.println("For Stone press N \nFor Paper press P\nFor Scissors press S ");
	System.out.println("\nThe game will be of n points\n"+a+" vs computer\n\n***___LETS BEGIN___***");
	System.out.println("enter the value of n");
	String ar[]={"Scissors","Paper","Stone"};
	int n=ob1.nextInt();int i=0;
	char z;
	/*
	This program is made by
	Sameer Srivastava
	*/
	while(p!=1)
	{
		int c=(int)(Math.random()*10);
		if(c%3==0)
		{
			i=0;
			z='S';
		}
		else if(c%2==0)
		{
			i=1;
			z='P';
		}
		else
		{
			i=2;
			z='N';
		}
		System.out.println("Give Input");
		char x=ob.nextLine().charAt(0);
		int m=0;int j=0;
		if(x==z)
		{
						System.out.println("\n\nboth have same input\n\n");System.out.println("Scores are \n"+a+"="+ph+"\tcomputer ="+pc+"\n\n");
			continue;
		}
		else
		{
			if(x=='N' && z=='P' )
			{
				j=2;
				m=2;
				pc++;
			}
			else if(x=='N' && z=='S')
			{
				j=2;
				m=1;

				ph++;
			}
			else if(x=='P' && z=='S')
			{
				j=1;
				m=4;

				pc++;
			}
			else if(x=='P' && z=='N')
			{
				j=1;
				m=3;
				ph++;
			}
			else if(x=='S' && z=='P')
			{
				j=0;
				m=5;
				ph++;
			}
			else if(x=='S' && z=='N')
			{
				j=0;
				m=6;
				pc++;
			}

		}
		System.out.println("\n\n"+a+" entered "+ar[j]+"\ncomputer entered "+ar[i]+"\n\n");
		if(m%2==0 && m!=0)
		{
			System.out.println("computer won this round");
			System.out.println("Scores are \n"+a+"="+ph+"\tcomputer ="+pc+"\n\n");

		}

		else if(m%2==1)
		{
			System.out.println("you won this round");
		System.out.println("Scores are \n"+a+"= "+ph+"\tcomputer = "+pc+"\n\n");
		}
		if(pc==n)
			System.out.println("\n\nyou lost\n\n BETTER LUCK NEXT TIME\n\n*******************************");
		if(ph==n)
			System.out.println("\n\n\ncongratulations "+a+"\n************************\n\n**__YOU WON__**");
		if(ph==n || pc==n)
			p=1;
	}
}
}