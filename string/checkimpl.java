import java.rmi.*;
import java.rmi.server.*;
public class checkimpl extends UnicastRemoteObject implements checkint{
	checkimpl()throws RemoteException{}
	public int check(String str){
			int i;
			int d=0;
			for(i=0;i<str.length();i++)
			{
				if(Character.isAlphabetic(str.charAt(i)))
				{
					d=d+1;
				}
				
				
			}
			return(d);
	
			
}
}
		