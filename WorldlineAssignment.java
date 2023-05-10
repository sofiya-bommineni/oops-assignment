

package worldline.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class Recruitment extends WorldlineAssignment{
    
  public int avg(int phy,int che,int mb)
  {
      int mean=(phy+che+mb)/3;
     return mean;
  }
  public void selection(String com,int mean,int ug,int pg,int project,String edu,int im,String citizen){
      if((ug>8)&&(pg>8)&&(project>=2)&&(edu.equals("full"))&&(im>=35)&&(citizen.equals("Indian"))){
          if(com=="sc"||com=="st")
      {
          if(mean>50){
              System.out.println("Candidate is selected");
          }
          else
          {
              System.out.println("Candidate is not selected");
          }
      } 
          else if(mean>60)
          {
              System.out.println("Candidate  selected");
          }
          else
          {
              System.out.println("Candidate not selected ");
          }
              
          
      }
      else
      {
          System.out.println("Candiadte not selected");
      }
      
      
  }
}



public class WorldlineAssignment {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
System.out.println("Enter the Date ");

String date = sc.next();

SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
Date date2=null;
try {
//Parsing the String
date2 = dateFormat.parse(date);
} catch (ParseException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println("Enter the physics mark");
int phy=sc.nextInt();
        System.out.println("Enter the chemistry mark");
        int che=sc.nextInt();
          System.out.println("Enter the Maths/Biology mark");
        int mb=sc.nextInt();
         System.out.println("Enter the your community");
        String com=sc.next();
          System.out.println("Enter the UG cgpa");
        int ug=sc.nextInt();
          System.out.println("Enter the PG mark");
        int pg=sc.nextInt();
          System.out.println("Enter the Mode of Education");
        String edu=sc.next();
          System.out.println("Enter the interview mark");
        int im=sc.nextInt();
          System.out.println("Enter the no.of projects completed");
        int project=sc.nextInt();
          System.out.println("Enter the citizenship");
        String citizen=sc.next();
        Recruitment rec=new Recruitment();
        int mean=rec.avg(phy,che,mb);
        rec.selection(com, mean, ug, pg, project, edu, im,citizen);
       
        
        
        
        
        
        
        
        
            
        
        
        
    }
    
}
