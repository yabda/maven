package ya;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import com.opencsv.*;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Version Minimal ultime final" );
        System.out.println("max(4,5) : "+max(4,5));
		int myMax = 0;
		String filename ="data.csv";
		try {
			CSVReader reader = new CSVReader(new FileReader(filename));
			List<String[]> myEntries=reader.readAll();
			Vector<String> out=new Vector<String>();
			for(String[] entry : myEntries){
				List<String> list2 = Arrays.asList(entry);
				CollectionUtils.select(list2, new Predicate<String>(){
					public boolean evaluate(String arg0) {
						if (Integer.parseInt(arg0) > 50){
						return false;
						}
						else{
							return true;
						}
					}
        		}, out) ;
        		System.out.println("OUT :" + out) ;
				for (String i : entry){ 
					int nb = Integer.parseInt(i);
					myMax=max(myMax,nb);
			
				}
			}
			System.out.println("le maximum est :"+myMax);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int max(int a,int b ){
		return a>b?a:b; //stagiaire was fired
	}
	
	
}