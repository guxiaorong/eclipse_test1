package test1;
import java.io.IOException;
import java.util.Scanner;
 

public class SimpMana {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StuManager sm=new StuManager();
		sm.Manage();
	}
    
}


class StuManager
{
	int count;
	double Scores[][]={{101,45},{102,78},{103,84},{104,97},{105,63}};
	public StuManager()
	{
		count=5;
		//Scores=new double[5][2];
		System.out.println("�������ϵͳ");
//		Scanner sc=new Scanner(System.in );
//		for(int i=0;i<count;i++)
//		{
//			System.out.println("����ڡ�"+(i+1)+"��ѧ����ѧ�ţ�");
//			Scores[i][0]=Integer.parseInt(sc.nextLine());
//			System.out.println("����ڡ�"+(i+1)+"��ѧ���ĳɼ���");
//			Scores[i][1]=Double.parseDouble(sc.nextLine());
//		}
	}
	
	public void Manage()
	{
		int i;
		System.out.println("1������ѧ�ŵõ��ɼ�");
		System.out.println("2������ɼ��õ�ѧ��");
		System.out.println("3��ͳ�Ƹ��������׶�����");
		System.out.println("4������ѧ��ɾ����Ӧ�ɼ�");		
		System.out.println("���������ģʽ��");
		Scanner sc=new Scanner(System.in );
		i=Integer.parseInt(sc.nextLine());
		while(i>0)
		{
			switch(i)
			{
			case 1: 
				Mode1();
				break;
			case 2:
				Mode2();
				break;
			case 3:
				Mode3();
				break;
			case 4:
				Mode4();
				break;
			default:
				System.out.println("����ģʽerror��");		
			}		
			System.out.println("�������ģʽ��");
			i=Integer.parseInt(sc.nextLine());		
		}
		System.out.println("�˳�����ϵͳ����");
	}

	
	public void Mode1()
	{
		int num,flag1;
		System.out.println("����ģʽ1������ѧ�Ż�óɼ���");
		Scanner sc;
		System.out.println("����ѧ�ţ�");
		sc=new Scanner(System.in );
		num=Integer.parseInt(sc.nextLine());
		
		while(num!=0)
		{		
			flag1=0;			
			for(int i=0;i<Scores.length;i++)
			{
				if(Scores[i][0]==num)
				{	 
					System.out.println("ѧ��"+num+"�ɼ�:"+Scores[i][1]);
					flag1=1;
					break;
				}				
			}
			if(flag1==0)	
			{
				System.out.println("ѧ��"+num+"δ�ҵ�����");
			}
			System.out.println("����ѧ��(0�˳���ģʽ)��");
			num=Integer.parseInt(sc.nextLine());
		}
		System.out.println("�˳�ģʽ1!!");
	}
	
	public void Mode2()
	{
		int flag2;
		double score;
		System.out.println("����ģʽ2�����ݳɼ����ѧ�ţ�");
		Scanner sc;
		System.out.println("����ɼ���");
		sc=new Scanner(System.in );
		score=Double.parseDouble(sc.nextLine());
		while(score!=0)
		{
			flag2=0;
			for(int i=0;i<Scores.length;i++)
			{
				if(Scores[i][1]==score)
				{	 
					System.out.println("�ɼ�:"+score+"ѧ��"+Scores[i][0]);
					flag2=1;
					break;
				}
			}
			if(flag2 ==0)	
			{
				System.out.println("�ɼ�:"+score+"δ�ҵ�����");
			}
			System.out.println("����ɼ�(0�˳���ģʽ)��");
			score=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("�˳�ģʽ2��");
		
	}
	
	public int[] Mode3()
	{
		int Level[]=new int[5];
		System.out.println("����ģʽ3������������ȼ���������");
		for(int i=0;i<Scores.length;i++)
		{
			if(Scores[i][1]<60.00)
			{	 
				Level[0]++;
			}
			else if(Scores[i][1]<70.00)
			{	 
				Level[1]++;
			}
			else if(Scores[i][1]<80.00)
			{	 
				Level[2]++;
			}
			else if(Scores[i][1]<90.00)
			{	 
				Level[3]++;
			}
			else 
			{	 
				Level[4]++;
			}
		}
		System.out.println("���ȼ�������Ϊ��");
		System.out.println("���ϸ�:"+Level[0]+" �ϸ�:"+Level[1]+" ��:"+Level[2]+" ��:"+Level[3]+" ��:"+Level[4]);
		return Level;
	}
		
	public void Mode4()
	{
		System.out.println("����ģʽ4������ѧ��ɾ���ɼ���");
		int flag2;
		int num;
		Scanner sc;
		System.out.println("����ѧ�ţ�");
		sc=new Scanner(System.in );
		num=Integer.parseInt(sc.nextLine());
		while(num!=0)
		{
			flag2=0;
			for(int i=0;i<Scores.length;i++)
			{
				if(Scores[i][0]==num)
				{	 
					Scores[i][1]=0;
					System.out.println("ѧ��"+Scores[i][0]+"�ĳɼ�ɾ��");
					flag2=1;
					break;
				}
			}
			if(flag2 ==0)	
			{
				System.out.println("ѧ��"+num+"δ�ҵ�����");
			}
			System.out.println("����ѧ��(0�˳���ģʽ)��");
			num=Integer.parseInt(sc.nextLine());
		}
		System.out.println("�˳�ģʽ4��");
		
	}
	
	
	
}
