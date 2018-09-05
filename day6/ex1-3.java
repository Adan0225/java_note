
//java.util.Scanner sc =new java.util.Scanner(System.in);


class ex13 {
	public static void main(String args[]) {
		String str;
		
		str = "";
        z:
		for (int x = 3; x < 8; x++) {
			if (x == 4) break;
			if(x == 6) break z;
			str += x;
		}
		System.out.println(str);
	}
}





