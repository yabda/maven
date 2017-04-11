package ya;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Version Minimal ultime final" );
        System.out.println("max(4,5) : "+max(4,5));
    }


	public static int max(int a,int b ){
		return a>b?a:b;
	}
	
}