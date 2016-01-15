import java.util.*;

class GetLastMan
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=1000;i++)
		{
			al.add(i);
		}
		Survivor s= new Survivor();
		s.lastManStanding(al);			
	}
}
class Survivor
{
	void lastManStanding(ArrayList<Integer> al)
	{
		boolean flag=false;
		while(al.size()>1)
		{
			if(flag==false)
			{
				int e=al.get(al.size()-1);
				for(int i=0;i<al.size()-1;i++)
				{
					al.remove(i+1);
				}
				if(e==al.get(al.size()-1))
				flag=true;
			}
			else
			{
				int e=al.get(al.size()-1);
				for(int i=0;i<al.size();i++)
				{
					al.remove(i);
				}
				if(e!=al.get(al.size()-1))
				flag=false;
			}
				
		}
		Iterator<Integer> it=al.iterator();
		System.out.println(it.next());
	}
}