package szys;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Histroy {
	String qstr;
	String astr;
	String str;
	String str2="0 0";
	double tot=0;
	double rn=0;
	public List<String> qstrlist = new ArrayList<String>();
	public List<String> astrlist = new ArrayList<String>();
	public void scan(String qstr,String astr){
		str=(astr+" "+qstr);
	}
	public void scan2(int tot,int rn){
		str2=(tot+" "+rn);
	}
	public void Histroy_create(){
		String path = "d:\\Myapp";
		File f = new File(path);
		if(!f.exists()){
			f.mkdirs();
			String fileName="histroy.txt";
			File file = new File(f,fileName);
			if(!file.exists()){
				try {
				file.createNewFile();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
			}
			f.mkdirs();
			String fileName2="histroy_num.txt";
			File file2 = new File(f,fileName2);
			if(!file2.exists()){
				try {
				file2.createNewFile();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
			}
			Histroy_saveNum();
		}
		
	}
	public void Histroy_save(){
		 FileWriter writer;
		 String fileName = ("d:\\Myapp\\histroy.txt");
		try {
			writer = new FileWriter(fileName, true);
			writer.write(str);
			writer.write("\r\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Histroy_saveNum(){
		FileWriter writer2;
		String fileName2 = ("d:\\Myapp\\histroy_num.txt");
		try {
			writer2 = new FileWriter(fileName2, true);
			writer2.write(str2);
			writer2.write("\r\n");
			writer2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Histroy_read()  throws FileNotFoundException{
		Scanner in = new Scanner(new File("d:\\Myapp\\histroy.txt"));//Ϊ��ʷ��Ϣ.tit���File����һ��ɨ����in
		while(in.hasNextLine()){
			String line = in.nextLine();//������ʷ��Ϣ.txt����һ��
			Scanner lineScanner = new Scanner(line);//Ϊÿһ�н���һ��ɨ����
			lineScanner.useDelimiter(" ");//ʹ�ÿո���Ϊ�ָ���
			qstr = lineScanner.next();//����
			astr = lineScanner.next();//��
			qstrlist.add(qstr);
			astrlist.add(astr);
		}
		in.close();
	}
	public void History_num() throws FileNotFoundException{
		Scanner in = new Scanner(new File("d:\\Myapp\\histroy_num.txt"));//Ϊ��ʷ��Ϣ.tit���File����һ��ɨ����in
		while(in.hasNextLine()){
			String line = in.nextLine();//������ʷ��Ϣ.txt����һ��
			Scanner lineScanner = new Scanner(line);//Ϊÿһ�н���һ��ɨ����
			lineScanner.useDelimiter(" ");//ʹ�ÿո���Ϊ�ָ���
			tot = Integer.parseInt(lineScanner.next());//����
			rn = Integer.parseInt(lineScanner.next());//��
		}
		in.close();
	}
}
