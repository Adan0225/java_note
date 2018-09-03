class ex21 {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("請輸入分數");

		int x;
		x = sc.nextInt();


		if (x >= 91 && x <= 100) {
			System.out.println( "A");
		}

		else if (x >= 76 && x <= 90) {
			if (x >= 82) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}

		}

		else if (x >= 60 && x <= 75) {
            if(x>=67){
            	System.out.println("C+");
            }

            else{
            	System.out.println("C-");
            }


		}

		else if (x >= 0 && x <= 59) {
			System.out.println("D");
		}


		else {
			System.out.println("請輸入0-100的分數");
		}


	}
}


