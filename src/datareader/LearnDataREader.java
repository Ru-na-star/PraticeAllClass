package datareader;

import java.io.BufferedReader;
import java.io.FileReader;

// what is path
//path is location
//absoulate path: //full path:ex:C:\Users\DELL\IdeaProjects\PraticeAllClass\Datatest\Sample.txt
//reltive path://partial path:ex:Datatest/Sample.txt
public class LearnDataREader {
    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String filePath="../PraticeAllClass/Datatest/Sample.txt ";

       try {
        fileReader=new FileReader(filePath ) ;
        bufferedReader =new BufferedReader(fileReader );

           String data;
           while(( data=bufferedReader.readLine()) !=null) {
               System.out.println(data);
           }
       } catch (Exception e){
//e.printStackTrace();
           System.out.println(" file not found exception handling");
           }finally {
           try {
             fileReader.close();
             bufferedReader.close();
           }catch(Exception e){
               System.out.println(" flie alrady close");
           }
       }




    }
}
