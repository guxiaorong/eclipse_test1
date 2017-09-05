package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Judge {

	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		GetScore getscore;
		try {
			getscore = new GetScore();
			System.out.println("最后得分="+getscore.getavege());
			System.out.println("最菜的评委是："+(getscore.getBad()+1));
			System.out.println("最好的评委是："+(getscore.getGood()+1));
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
    	Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("请输入评委的人数！");
			size= Integer.parseInt(sc.nextLine());
			System.out.println("size="+size);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
			e.printStackTrace();
		}
		
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
//		System.out.println("pass Max score="+scores[Maxdex]);
//		System.out.println("pass Min score="+scores[Mindex]);
//		System.out.println("average score="+Avescore);
		return Avescore;
	}
	
	public int getBad()
	{
		double avege=this.getavege();
		int badindex=0;
		double bad=Math.abs(scores[0]-avege);
		double temp=0f;
		for(int i=1;i<scores.length;i++)
		{
			temp=Math.abs(scores[i]-avege);
			if(bad< temp)
			{
				badindex=i;
				bad=temp;
			}
		}
		return badindex;
	}
	
	public int getGood()
	{
		double avege=this.getavege();
		int goodindex=0;
		double good=Math.abs(scores[0]-avege);
		double temp=0f;
		for(int i=1;i<scores.length;i++)
		{
			temp=Math.abs(scores[i]-avege);
			if(good> temp)
			{
				goodindex=i;
				good=temp;
			}			
		}
		return goodindex;
	}
}
