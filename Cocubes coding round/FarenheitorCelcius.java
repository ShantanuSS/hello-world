
import java.util.Scanner;

public class FarenheitorCelcius {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int c=sc.nextInt();
float temp=sc.nextFloat();
float p=FareorCel(c,temp);
System.out.print(p);
	
	}

static float FareorCel(int c,float temp){   //you have to only write this function's code only
	float t=0;
	if (c==1){
		t=((temp-32)*5)/9;
	}
	else if(c==2){
		t=(temp*9)/5+32;
	}
	else{
		t=temp;}
	
	return (t);
}

}