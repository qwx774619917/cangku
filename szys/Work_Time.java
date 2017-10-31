package szys;

import java.util.TimerTask;
import javax.swing.JTextField;

public class Work_Time extends TimerTask{

	static int y=0;
	static int z=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str_second = Frame.Time.getText().substring(6);
		int x = Integer.parseInt(str_second);
        if(Frame.Time.getText().equals("00:00.00")){
			x=0;y=0;z=0;
		}
        x++;
        if(z<10){
        	if(y<10)
	        {
	        	if(x<100)
	        		Frame.Time.setText("0"+z+":0"+y+"."+x);
		        if(x==100)
		        {
		        	y++;
		        	Frame.Time.setText("0"+z+":0"+y+".0");
		        	x=0;
		        	
		        }
	        }
	        if(y<60&&y>=10)
	        {
	        	if(x<100)
	        		Frame.Time.setText("0"+z+":"+y+"."+x);
		        if(x==100)
		        {
		        	y++;
		        	Frame.Time.setText("0"+z+":"+y+".0");
		        	x=0;
		        	
		        }
	        }
	        if(y==60){
	        	y=0;
	        	x=0;
	        	z++;
	        }
        }
        if(z<60&&z>=10){
        	if(y<10)
	        {
	        	if(x<100)
	        		Frame.Time.setText(z+":0"+y+"."+x);
		        if(x==100)
		        {
		        	y++;
		        	Frame.Time.setText(z+":0"+y+".0");
		        	x=0;
		        	
		        }
	        }
	        if(y<60&&y>=10)
	        {
	        	if(x<100)
	        		Frame.Time.setText(z+":"+y+"."+x);
		        if(x==100)
		        {
		        	y++;
		        	Frame.Time.setText(z+":"+y+".0");
		        	x=0;
		        	
		        }
	        }
	        if(y==60){
	        	y=0;
	        	x=0;
	        	z++;
	        }
	        else
	        {
	        	Frame.Time.setText("都一小时了放弃吧");
	        }
        }
	}
	

}
