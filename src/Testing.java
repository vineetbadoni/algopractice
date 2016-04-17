import java.util.Scanner;


public class Testing {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
         String[] splittedTIme = null;
        
        if(time.endsWith("PM")||time.endsWith("pm")||time.endsWith("Pm")||time.endsWith("pM")){
        	splittedTIme = time.split(":");
            int hourPart = Integer.parseInt(splittedTIme[0]);
            hourPart +=12;
            splittedTIme[0]=hourPart+"";
        }
        if(splittedTIme==null){
            System.out.println(time);
        }else{
            String convertedTime = "";
            for(int cntr=0;cntr<splittedTIme.length;cntr++){
            	String timeParts = splittedTIme[cntr];
                if(cntr==0){
                    convertedTime=convertedTime+timeParts;
                }else{
                    convertedTime=convertedTime+":"+timeParts;
                }
            }
            convertedTime = convertedTime.replaceAll("PM", "");
            System.out.println(convertedTime);
        }
        
    }
}
