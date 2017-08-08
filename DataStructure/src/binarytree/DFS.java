package binarytree;
import java.util.*;

class DFS{
	
	int v;
	LinkedList<Integer>[] ll;
	
	DFS(int v)
	{
		this.v=v;
	ll=new LinkedList[v];
	for(int i=0;i<v;i++)
	{
		ll[i]=new LinkedList<Integer>();
	}
	}
	
	void addNode(int a , int b)
	{
		ll[a].add(b);
	}
	void DFSUtil(boolean[] b ,int a )
	{  b[a] = true;
	   System.out.print(" " + a);
	   for(Integer xx : ll[a])
	   {
		   if(!b[xx])
			 DFSUtil(b,xx);
	   }
	
	}
	void DFSBeg(int v)
	{
		boolean b[] = new boolean[this.v];
		DFSUtil(b,v);
	}
	
	void sorty()
	{
		for(LinkedList<Integer> l : ll)
		{
			Collections.sort(l);
		}
	}
	
	public static void main(String...args)
	{
		DFS d = new DFS(6);
		d.addNode(0, 1);
		d.addNode(3, 5);
		d.addNode(0, 2);
		d.addNode(2, 4);
		d.addNode(1, 3);
		d.addNode(1, 2);
		d.sorty();
		d.DFSBeg(0);
	}
	

}