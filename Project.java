package Locker;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Scanner;
public class Project
{
public static void main(String args[])
{
		System.out.println(" ************************ LOCKER Pvt Ltd***************************");
		System.out.println("                      Developed by : HINDUJA                          ");
		System.out.println("                Contact email : customercare@locker.info              ");
		System.out.println("********************************************************************");
		System.out.println("Please Select an option");
		System.out.println("");
        System.out.println("1.Add a file");
        System.out.println("2.Delete a file");
		System.out.println("3.Search a file");
		System.out.println("4.Return to a main menu");
		System.out.println("5.close the application");

		String str = null;
          Scanner sc=new Scanner (System.in);
          try
          {
               str=sc.nextLine();
        }
          catch(InputMismatchException ex)
          {

        	  System.out.println("Entered Invalid Option.");
              System.out.println("You have entered option:" +str);

          }
          		String loop="start";
          		while(loop!="end") {
        		 switch(str) {
                  case "1":
                	  try {
                		  System.out.println("Please Enter the File Name to create:");
                		  Scanner sc1=new Scanner (System.in);
                          String FileName=sc1.nextLine();
                          File myObj1 = new File("C:\\Java\\" +FileName);  
                          if (myObj1.createNewFile()) {  
    			        System.out.println("File created: " + myObj1.getName());  
    			        System.out.println("Absolute path: " + myObj1.getAbsolutePath()); 
    			        System.out.println("File Sucessfully created");
                	  }
    			    
    			      else
    			      {
    			    	  System.out.println("File already exsist");
    			      }
                	  }
                	  
                	  catch (IOException e)
    			      {
    			    	  e.printStackTrace();
    			      }
    			      
                	  break;
                	      case "2":
                        	
                        	System.out.println("Please Enter the File Name to Delete:");
                      		Scanner sc1=new Scanner (System.in);
                            String FileName=sc1.nextLine();
                        	File myObj1=new File("C:\\Java\\" +FileName); 
    			    	      if (myObj1.delete()) {
    				    	  System.out.println("File deleted:"+ myObj1.getName());
    			    	      }
    			    	      else
    			    	      {
    			    	    	  System.out.println("File not found to delete");
    			    	      }
                        	break;
                   
                        	
    			   case "3":
    				   File directoryPath = new File("C:\\Java\\");
    				      //List of all files and directories
    				      String contents[] = directoryPath.list();
    				      for (int i = 0; i < contents.length; i++) {
    				    	    contents[i]=contents[i].toLowerCase();    
    				    	     }
    				      Arrays.sort(contents);
    				      System.out.println("search a file");
    				      Scanner sc3=new Scanner(System.in);
    				      String SearchName=sc3.nextLine();
    				      int index=Arrays.binarySearch(contents,SearchName.toLowerCase());
    				      if (index>=0)
    				    	  System.out.println("File found in the drive: "
    	                               + index);
    	        else
    	            System.out.println("File not found to search");
    				      
    	    			  break;
    			   case "4":
    				   System.out.println("Return to main menu");
    				   System.out.println(" ************************ LOCKER Pvt Ltd***************************");
    					System.out.println("                      Developed by : HINDUJA                          ");
    					System.out.println("                Contact email : customercare@locker.info              ");
    					System.out.println("********************************************************************");
    					System.out.println("Please Select an option");
    					System.out.println("");
    			        System.out.println("1.Add a file");
    			        System.out.println("2.Delete a file");
    					System.out.println("3.Search a file");
    					System.out.println("4.Return to a main menu");
    					System.out.println("5.close the application");
    				   
    				   break;
    			   case "5":
    				   loop="end";

    				   System.out.println("close the application");
                	    break;
                	default:
                		System.out.println("You have entered the invalid option");
        		 }     
        		 if(loop!="end")
        		 {
        		 
        		 
        		 if(str=="4")
        		 {
        		System.out.println("Please Enter the option:");
        		 }
        		 else
        		 {
                 System.out.println("Please Enter the another option:");
        		 }
                 Scanner sc2=new Scanner (System.in);
                 String str1=sc.nextLine();
                 str=str1;
                 System.out.println("You have entered option:" +str1);
        		 }
                 }
          
          }
}
        		 
      
	       
    				   
                    

              				        

    			        
                  
        	  
          
                 
        	  
        	  
        
          



        	 



