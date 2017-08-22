package test1;
import java.io.*;
import java.util.Scanner;

public class Demo_test1 {

	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		GetScore getscore;
		try {
			getscore = new GetScore();
			System.out.println("last fen="+getscore.getavege());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class GetScore 
{
	double scores[]=null;
	int size;
	
    public GetScore() throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入评委的人数！");
		size= Integer.parseInt(sc.nextLine());
		System.out.println("size="+size);	
    	
		scores =new double[size];
		InputStreamReader str=new InputStreamReader(System.in );
		BufferedReader br=new BufferedReader(str);
		try {
										
		    for(int j=1;j<=size;j++)
		    {
		    	System.out.println("请输入第"+j+"位评委的分数！");				
				scores[j-1]=Double.parseDouble(br.readLine());
		    }
		}	
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			finally{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	// TODO Auto-generated constructor stub
    public int getMin()
	{
    	int minindex=0;
    	for(int i=0;i< scores.length;i++)
		{
			if(scores[i]<scores[minindex])
			{
				minindex=i;
			}
		}
		return minindex;
	}
	
    public int getMax()
	{
    	int maxindex=0;
    	for(int i=0;i< scores.length;i++)
		{
			if(scores[i]>scores[maxindex])
			{
				maxindex=i;
			}
		}
		return maxindex;
	}
    
	public double getavege()
	{
		int Mindex=getMin();
		int Maxdex=getMax();
		double Avescore=0.00;
		double Sumscore=0.00; 
		for(int i=0;i< scores.length;i++)
		{
			if(i!=Mindex && i!=Maxdex)
			{				
				Sumscore+=scores[i];			
			}
		}
		Avescore=Sumscore/(scores.length-2);
		System.out.println("pass Max score="+scores[Maxdex]);
		System.out.println("pass Min score="+scores[Mindex]);
		System.out.println("average score="+Avescore);
		return Avescore;
	}
	
	  
}
