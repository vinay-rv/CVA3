import java.util.Scanner;
class Sample
{
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentance");
		String str = sc.nextLine();
		System.out.println("Enter a letter");
		String str1=sc.nextLine();
		if(str.indexOf(str1)==-1){
			System.out.println("not found");
		}else {
			int num=str.indexOf(str1)+1;
			System.out.println("Result : "+str.substring(num));
		}
	}
}