import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
                int temp;
                int iDollar;
                int iQuarter;
                int iDimes;
                int iNickles;
                int iPenny;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter an amount in double :");
                double duck = scanner.nextDouble();
                String strMoney = String.valueOf(duck);
                String[] aryStr = strMoney.split("\\.");

                if (aryStr[1].length()>3){
                        System.out.print("Enter two decimal places");
                        return;
                }

                iDollar = Integer.valueOf(aryStr[0]);
                temp =Integer.valueOf(aryStr[1]);
                iQuarter = temp/25;
                iDimes = (temp%25)/10;
                iNickles = ((temp%25)%10)/5;
                iPenny = ((temp%25)%10)%5;
                System.out.println("Amount "+strMoney+" = "+iDollar+" Dollars "+iQuarter+" Quarter "+iDimes+" Dimes "+iNickles+" Nickles "+iPenny+" Penny");













        }
}
 /*
                double money = 17.79;
                iDollar = (int)money;
                temp =(int)((money-iDollar)*200)+1;
                iQuarter = temp/25;
                iDimes = (temp/25)/10;
                iNickles = ((temp%25)%20)/5;
                double temp1 = (money-iDollar);
                int temp2 = (79%25)%10;
                iPenny = ((temp%25)%10)%5;
              //  System.out.println(temp+","+temp1+","+temp2);
                System.out.println("Amount "+money+" = "+iDollar+" Dollars "+iQuarter+" Quarter "+iDimes+" Dimes "+iNickles+" Nickles "+iPenny+" Penny");
              */
/*
	public static void main(String[] args) {
		int[] a = {2,4,3,5,8};
		int n = a.length;
		for(int i=0;i<n;i++ ) {
			System.out.println("a["+i+"]"+a[i]);
		}
		System.out.println("a[n-1]="+a[n-1]);
		System.out.println("a[n-2]="+a[n-2]);
	}
}
*/

//陣列超過三個使用



/*
 *
		int n= 360;
		int count = 0;

//		while(n%2==0) {
//			n/=2;
//			count+=1;
		for(;n%2==0;count++) {
			n/=2;
		}

		System.out.println("count ="+count);
		}
 */





/*
  int s=0;
		int n = 10;
		int i =100;
		//其中會考
		do {
			s+=i;
			i+=1;
		}while(i<=n);
			System.out.println("s = "+s);
			//do while至少執行一次\

			/*
			repeat
			util



			do
			loop

	       */



/*
  int s=0;
		int n = 10;
		int i =100;
		//其中會考
		while(i<=n) {
			System.out.println(i);
			s+=i;
			i+=1;

		}
 */







/*String[] languages = {"C","C++","jAVA"};

		for(String x:languages) {
			System.out.println(x);
			//新用法    i資料未止

		}
 */


/*
for(int i=0;i<languages.length;i++ ) {
	System.out.println(languages[i]);


}
*/




/*if(i%2 ==1) {

s+=i;

}*/






/*
int s=0;
int n = 5;
//其中會考
for(int i = 1;i<n;i++) {
	if(i>5) {
		break;
	}

}
System.out.println("s = "+s);
System.out.println("n = "+n);
//System.out.println("i = "+i);
*/
