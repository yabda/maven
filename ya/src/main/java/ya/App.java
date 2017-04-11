package example;
import org.apache.commons.lang.WordUtils;
import java.util.List;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Hello {
    public static void main( String[] args )
    {
        System.out.println( "Version Minimal ultime final" );
        System.out.println("max(4,5) : "+max(4,5));
		int myMax = 0;
		String filename ="data.csv";
		try {
			CSVReader reader = new CSVReader(new FileReader("data.csv"));
			List<String[]> myEntries=reader.readAll();
			for(String[] entry : myEntries){
				int nb = Integer.parseInt(entry[0]);
				System.out.println(String.format("Nombre lu : %d", nb));
				if (nb>myMax)
					nb=max(myMax;nb)
			}
			System.out.println("le maximum est :"+myMax);
		} catch (IOException e) {
			e.printStackTrace();
		}
	public static int max(int a,int b ){
		return a>b?a:b;
	}
	
	}
}