import java.util.Scanner;
public class whoInterface{
   
   //String filter(String input);
   //Detects keywords in raw input.
   
   public static void main(String[]args){
      Scanner keyboard=new Scanner(System.in);
      String input,scan="idgad";
      boolean loop=true;
      System.out.println("Start\n");
      while(loop==true){
         input=keyboard.nextLine();
         scan=filter(input);
         System.out.println(scan);
         if((scan)==("stop")){
            loop=true;
         }
      }
      System.out.println(scan);
      return;
   }
   
   public static String filter(String input){
      String scan="idgad";
      if(input.indexOf("who")!=-1){
         scan="who";
      }
      else if(input.indexOf("what")!=-1){
         scan="what";
      }
      else if( (input.indexOf("i")!=-1||input.indexOf("I")!=-1) && (input.indexOf("dont")!=-1||input.indexOf("don't")!=-1) && input.indexOf("know")!=-1 ){
         scan="idk";
      }
      else if(input.indexOf("exit")!=-1||input.indexOf("quit")!=-1||input.indexOf("stop")!=-1){
         scan="stop";
      }
      else{
         System.out.println("not found.\n");
      }
      return scan;
   }
}