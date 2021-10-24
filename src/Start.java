import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student manament system");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("Enter 1 for add Student");
			System.out.println("Enter 2 for delete Student");
			System.out.println("Enter 3 for display Student");
			System.out.println("Enter 4 for update App");
			System.out.println("Enter 5 for exit App");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add new record
				System.out.println("Enter Student Name");
				String snm = br.readLine();
				
				System.out.println("Enter Student Std");
				int sstd = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Student City");
				String scity = br.readLine();
				
				Student st =  new Student(snm,sstd,scity);
				System.out.println(st);
				boolean ans=  StudentDao.insertStudentToDB(st);
				if(ans == true)
				{
					System.out.println("successfully added");
				}else
				{
					System.out.println("Not added");
				}
				
			}else if(c== 2) {
				//delete record
				System.out.println("Enter Student ID to delete");
				int sid = Integer.parseInt(br.readLine());
				boolean sts = StudentDao.delStudentRecord(sid);
				if(sts == true)
				{
					System.out.println("successfully deleted");
				}else
				{
					System.out.println("Not deleted");
				}
				
			}else if(c==3) {
				//display record
			 StudentDao.displayStudent();
				
				
			}else if(c== 4) {
				//update record
				System.out.println("Enter Student ID to update");
				int sid = Integer.parseInt(br.readLine());
				StudentDao.displayUpdRecord(sid);
				
				System.out.println("Enter Student Name to update");
				String snm = br.readLine();
				
				System.out.println("Enter Student Std to update");
				int sstd = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Student City to update");
				String scity = br.readLine();
				
				Student st =  new Student(sid,snm,sstd,scity);
				boolean ans=  StudentDao.updateStudentToDB(st);
				if(ans == true)
				{
					System.out.println("successfully update");
				}else
				{
					System.out.println("Not update");
				}
			}			
			else if(c== 5) {
				break;
			}else {
			}
		
		}
		System.out.println("Thank You");
	}
}
