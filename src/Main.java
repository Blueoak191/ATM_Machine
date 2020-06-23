import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    System.out.println("ATM Machine");
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print(" enter with draw cash: ");
	    int cash = keyboard.nextInt();
	    List<Integer> withDrawValue = Arrays.asList(1000, 500, 100);
	    withDraw(cash, withDrawValue , 0);
	  }
	
	public static void withDraw(int cash, List<Integer> value, int ind) {
		if(cash % 100 == 0) {
			int remaidCash	= cash % value.get(ind);
			int bankCount	= cash / value.get(ind);
			System.out.println("ธนบัคร " + value.get(ind) + " บาท จำนวน " + bankCount + " ใบ");
			ind++;
			if(value.size() > ind)
				withDraw(remaidCash, value, ind);
		}else {
			System.out.println("ธนบัตรมีเฉพาะ 100 500 และ 1000 บาท");
		}
	}
	
	
}
