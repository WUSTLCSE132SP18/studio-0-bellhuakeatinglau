
public class Heartbeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		while(true)
		{
			try {
				Thread.sleep(1000);
				n+=1;
				System.out.println(n + " seconds have elapsed");
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
