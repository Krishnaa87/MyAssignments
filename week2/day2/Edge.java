package week2.day2;

public class Edge extends  Browser{
	
	
public void	takeSnap()

{
	System.out.println("takeSnap");
}

public void clearCookies()

{

	System.out.println("clearCookies");

}

public void openURL()
{
	System.out.println("OpenURL Edge");
}

public void loadUrl(String url,boolean status)
{
	System.out.println("loadUrl1 :"+ url +"  "+ status);
}
public void loadUrl(String url)
{
	System.out.println("loadUrl2 :"+ url);

}

public static void main(String[] args) {
	
	
	Edge br1 = new Edge();
	br1.openURL();
	br1.loadUrl("Test1",true);
	br1.loadUrl("Test2");
	
}

}
