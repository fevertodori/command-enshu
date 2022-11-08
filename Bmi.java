import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        for(int i =0;i<2;i++){
	System.out.println("BMIを計算して肥満度を表示しようと思う。");
        Scanner scan = new Scanner(System.in);
            System.out.print("・身長(m)を入力しろ：");
                double height =  scan.nextDouble();
            System.out.print("・体重(Kg)を入力しろ：");
                double weight =  scan.nextDouble();

                double bmi = weight / Math.pow(height, 2);
                System.out.println("貴様のBMIは"+String.format("%.2f",bmi));
	}
    }
}

