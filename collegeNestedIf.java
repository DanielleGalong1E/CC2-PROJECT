package Scanner;
import java.util.Scanner;
public class collegeNestedIf {
  public static void main (String[]args) {
      
    Scanner input = new Scanner (System.in);

    String College, AcademicProgram, Major;

    System.out.println("What is your College? (CAS, CBA, CEA, CITCS, CTE, COA)");
    College = input.nextLine();
    
    if (College.equals("CAS")){
        System.out.println("What is your Academic Program? (English, Political Science, Communication, Psychology");
            AcademicProgram = input.nextLine();
            
           if (AcademicProgram.equals("English")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Arts in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Political Science")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Arts in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Communication")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Arts in " + AcademicProgram);
            }
            else if (AcademicProgram.equals("Psychology")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            } 
            else
                System.out.println("Invalid input");
    }
    if (College.equals("CBA")){
        System.out.println("What is your Academic Program? (Business Administration, Entrepreneurship, Office Administration");
            AcademicProgram = input.nextLine();
            
           if (AcademicProgram.equals("Business Administration")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Entrepreneurship")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Office Administration")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            } 
            else
                System.out.println("Invalid input");
    }
    if (College.equals("CEA")){
        System.out.println("What is your Academic Program? (Architecture, Civil Engineering, Computer Engineering, Electronics Engineering, Environmental & Sanitary Engineering");
            AcademicProgram = input.nextLine();
            
           if (AcademicProgram.equals("Architecture")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Civil Engineering")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Computer Engineering")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            } 
           else if (AcademicProgram.equals("Electronics Engineering")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
           }
           else if (AcademicProgram.equals("Environmental & Sanitary Engineering")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
           }
           else
                System.out.println("Invalid input");
           
}
    if (College.equals("CITCS")){
        System.out.println("What is your Academic Program? (Computer Science, Information System, Information Technology, Computer Technology");
            AcademicProgram = input.nextLine();
            
           if (AcademicProgram.equals("Computer Science")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Information System")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Information Technology")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
            else if (AcademicProgram.equals("Psychology")){
               System.out.println("College of " + College);
               System.out.println("Associate in " + AcademicProgram);
            } 
            else
                System.out.println("Invalid input");
}
    
    if (College.equals("CTE")){
        System.out.println("What is your Academic Program? (Elementary Education-General, Elementary Education, Secondary Education");
            AcademicProgram = input.nextLine();
            
           if (AcademicProgram.equals("Elementary Education-General")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Elementary Education")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Secondary Education")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            } 
            else
                System.out.println("Invalid input");
}  
    
    if (College.equals("COA")){
        System.out.println("What is your Academic Program? (Accountancy, Accounting Technology, Management Accounting");
            AcademicProgram = input.nextLine();
            
           if (AcademicProgram.equals("Accountancy")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Arts in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Accounting Technology")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Arts in " + AcademicProgram);
            }
           else if (AcademicProgram.equals("Management Accounting")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Arts in " + AcademicProgram);
            }
            else if (AcademicProgram.equals("Forensic Accounting")){
               System.out.println("College of " + College);
               System.out.println("Bachelor of Science in " + AcademicProgram);
            } 
            else
                System.out.println("Invalid input");    
        }
    }
}

        
   