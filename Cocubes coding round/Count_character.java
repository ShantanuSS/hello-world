// Asked in cocubes (13/6/17)
//return 0 if string is null,else count all letter and numbers in the String(ques was something like this only)  

import java.util.Scanner;
public class countchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int a= counter(str);
		System.out.print(a);
	}
//write this code
static int counter(String str){
int count=0,i;
	if(str==""){
		return 0;
	}
	else {
		for(i=0;i<str.length();i++){
	if(str.charAt(i)>=65 &&str.charAt(i)<=90 || str.charAt(i)>=97 &&str.charAt(i)<=122)	
		count++;
		
		if(str.charAt(i)>=48 && str.charAt(i)<=65)
			count++;
		}}
	return count;
}
	
}
