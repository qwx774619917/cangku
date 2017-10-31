package szys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QA_List {

	public static int i;
	public static List<String> Qusetion=new ArrayList<String>();
	public static List<String> Answer=new ArrayList<String>();
	public QA_List(){
		for(int a=0;a<i;a++)
	    {
	        boolean x= new Random().nextBoolean();
	        Arithmetic hh = new Arithmetic(x);
	        String int_str = hh.int_operation();
	        String fra_str = hh.fra_operation();
	        if(x==true)
	        {
	        	Answer.add(int_str);
	        	Qusetion.add(hh.toString());
	        }
	        	
	        if(x==false)
	        {
	        	Answer.add(fra_str);
	        	Qusetion.add(hh.toString());
	        }
	    }
     for(int a=0;a<(10-i);a++){
     	Answer.add("");
     	Qusetion.add("");
     }
	}
	 
}
