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
		System.out.println("进入管理系统");
//		Scanner sc=new Scanner(System.in );
//		for(int i=0;i<count;i++)
//		{
//			System.out.println("输入第【"+(i+1)+"】学生的学号！");
//			Scores[i][0]=Integer.parseInt(sc.nextLine());
//			System.out.println("输入第【"+(i+1)+"】学生的成绩！");
//			Scores[i][1]=Double.parseDouble(sc.nextLine());
//		}
	}
	
	public void Manage()
	{
		int i;
		System.out.println("1：输入学号得到成绩");
		System.out.println("2：输入成绩得到学号");
		System.out.println("3：统计各个分数阶段人数");
		System.out.println("4：给出学号删除对应成绩");		
		System.out.println("请输入操作模式：");
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
				System.out.println("操作模式error：");		
			}		
			System.out.println("输入操作模式：");
			i=Integer.parseInt(sc.nextLine());		
		}
		System.out.println("退出管理系统！！");
	}

	
	public void Mode1()
	{
		int num,flag1;
		System.out.println("进入模式1：根据学号获得成绩！");
		Scanner sc;
		System.out.println("输入学号：");
		sc=new Scanner(System.in );
		num=Integer.parseInt(sc.nextLine());
		
		while(num!=0)
		{		
			flag1=0;			
			for(int i=0;i<Scores.length;i++)
			{
				if(Scores[i][0]==num)
				{	 
					System.out.println("学号"+num+"成绩:"+Scores[i][1]);
					flag1=1;
					break;
				}				
			}
			if(flag1==0)	
			{
				System.out.println("学号"+num+"未找到！！");
			}
			System.out.println("输入学号(0退出该模式)：");
			num=Integer.parseInt(sc.nextLine());
		}
		System.out.println("退出模式1!!");
	}
	
	public void Mode2()
	{
		int flag2;
		double score;
		System.out.println("进入模式2：根据成绩获得学号！");
		Scanner sc;
		System.out.println("输入成绩：");
		sc=new Scanner(System.in );
		score=Double.parseDouble(sc.nextLine());
		while(score!=0)
		{
			flag2=0;
			for(int i=0;i<Scores.length;i++)
			{
				if(Scores[i][1]==score)
				{	 
					System.out.println("成绩:"+score+"学号"+Scores[i][0]);
					flag2=1;
					break;
				}
			}
			if(flag2 ==0)	
			{
				System.out.println("成绩:"+score+"未找到！！");
			}
			System.out.println("输入成绩(0退出该模式)：");
			score=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("退出模式2！");
		
	}
	
	public int[] Mode3()
	{
		int Level[]=new int[5];
		System.out.println("进入模式3：计算分数各等级的人数！");
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
		System.out.println("各等级的人数为：");
		System.out.println("不合格:"+Level[0]+" 合格:"+Level[1]+" 中:"+Level[2]+" 良:"+Level[3]+" 优:"+Level[4]);
		return Level;
	}
		
	public void Mode4()
	{
		System.out.println("进入模式4：根据学号删除成绩！");
		int flag2;
		int num;
		Scanner sc;
		System.out.println("输入学号：");
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
					System.out.println("学号"+Scores[i][0]+"的成绩删除");
					flag2=1;
					break;
				}
			}
			if(flag2 ==0)	
			{
				System.out.println("学号"+num+"未找到！！");
			}
			System.out.println("输入学号(0退出该模式)：");
			num=Integer.parseInt(sc.nextLine());
		}
		System.out.println("退出模式4！");
		
	}
	
	
	
}
