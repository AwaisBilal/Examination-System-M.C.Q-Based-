import java.net.ServerSocket;
import java.net.Socket;




public class Server {
	private static	int requests=0;
	public static Socket client=null;
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(4444);
			System.out.println("Waiting for client request");
			while (true)
			{
				client=ss.accept();
				System.out.println(client.getInetAddress());
				requests++;
				System.out.println("Accepted Request# "+requests);
				MyThread ct = new MyThread(client);
				ct.start();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
}