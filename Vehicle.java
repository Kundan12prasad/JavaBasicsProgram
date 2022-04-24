//This is the Home from the interface concept.

import java.io.*;
import java.io.DataInputStream;
interface Vehicle
{
	public abstract void getcost();
	public abstract void Speed();
}
class Twowheeler implements Vehicle
{
	int dis,time;
	Twowheeler(int dis,int time)
	{
		this.dis=dis;
		this.time=time;
	}
		
		public void Speed()
		{
		 int speed1;
		speed1=(dis*time);
		System.out.println("Speed of tho wheeler is:" +speed1);
		
	    }
	 public void getcost()
	{
		long price=50000;
		System.out.println("Cost of two wheeler is:" +price);
		
	}
	
}
	class Threewheeler implements Vehicle
	{
		int dis1,time1;
	 Threewheeler(int dis1,int time1)
	{
		this.dis1=dis1;
		this.time1=time1;
	}
		
		public void Speed()
		{
		 int speed2;
		speed2=(dis1*time1);
		System.out.println("Speed of three wheeler is:" +speed2);
		
	    }

		public void getcost()
		{
			long price=100000;
			System.out.println("Cost of three wheeler is" +price);
			
		}
		
		
	}
	class Fourwheeler implements Vehicle
	{
		int dis2,time2;
	 Fourwheeler(int dis2,int time2)
	{
		this.dis2=dis2;
		this.time2=time2;
	}
		
		public void Speed()
		{
		 int speed3;
		speed3=(dis2*time2);
		System.out.println("Speed of four wheeler is:" +speed3);
		
	    }
		public void getcost()
		{
			long price=400000;
			System.out.println("cost of Four wheeler is" +price);
		}
		
	}
			class Manager
			{
				public static void main(String args[]) throws IOException
				{
					DataInputStream s1=new DataInputStream(System.in);
                    System.out.println("Enter the value of distance for Two Wheeler:");
                    int dist=Integer.parseInt(s1.readLine());

					DataInputStream s2=new DataInputStream(System.in);
					System.out.println("Enter the value of time for Two Wheeler:");
					int time=Integer.parseInt(s2.readLine());		
					
					Twowheeler t1=new Twowheeler(dist,time);
					t1.getcost();
					t1.Speed();
					
                    DataInputStream s3=new DataInputStream(System.in);
                    System.out.println("Enter the value of distance for Three Wheeler:");
                    int dist1=Integer.parseInt(s3.readLine());
					DataInputStream s4=new DataInputStream(System.in);
					System.out.println("Enter the value of time for three wheeler");
					int time1=Integer.parseInt(s4.readLine());
					Threewheeler t2=new Threewheeler(dist1,time1);
					t2.getcost();
					t2.Speed();			
					
					InputStreamReader x2=new InputStreamReader(System.in);
					BufferedReader y2=new BufferedReader(x2);
					String st4,st5;	
					System.out.println("Enter the value of distace for Four Wheeler ");
					st4=y2.readLine();
					int dist2=Integer.parseInt(st4);
					System.out.println("Enter the value of time for four Wheeler");
					st5=y2.readLine();
					int time2 =Integer.parseInt(st5);	
					Fourwheeler t3=new Fourwheeler(dist2,time2);
					t3.getcost();
					t3.Speed();
				}
			}				
					
					
					
					
					
			        
					
				
			
					