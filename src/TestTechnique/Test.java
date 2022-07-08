package TestTechnique;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
 import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
 

public class Test {

	public static void main(String[] args) {
 
		
		  File entree =new File("entree.txt");
		  List<String> list = new ArrayList<String>();
		  
		  try {
			  
		  //*********** class d'un nouveau fichier sortie **************//	   
			  
			  File sortie =new File("sortie.txt"); 
  			  FileWriter filsort =new FileWriter(sortie);
  			  PrintWriter Printsort = new PrintWriter(filsort);
  			  
   			
  		  //************lecture d'un fichier entree *************//	 
  			  
			  Scanner scanfichier =new Scanner(entree);
		        while (scanfichier.hasNext()) 
			       {
				       String mot =scanfichier.next(); 
                       list.add(mot);
                   }
			  
			     
				  Set<String> Pmot = new HashSet<String>(list);

			      List<String> NVlist = new ArrayList<String>(Pmot);
			       
			 
			       Collections.sort(NVlist);
			    
                
                   for (String Name : NVlist) 
                   {
                	    
                	    System.out.println(Name + ": " + Collections.frequency(list, Name));
                	      
                  //*********** créer un nouveau fichier sortie ***************//	
                	    Printsort.print(Name + ": " + Collections.frequency(list, Name) + " \n " );
                   }
				  
				  
                   
				  scanfichier.close();
				  Printsort.close();	
		 }
		  
		  
		   catch(Exception e ) {
			  
			  e.printStackTrace();
			  
		  }
		  
		 
		
		
	}

}
