class work2{
	public static void main(String [] args){
		for(int i = 1; i <= 200; i++){
		System.out.println(i+" isPrimeNumber: "+isPrimeNumber(i));
		}
	}

	public static boolean isPrimeNumber(int n) {
		boolean yes = true;
		for(int i = 2; i < n/2; i++){
			if(n%i==0){
				yes = false;
				break;
			}
		}
		return yes;
	}
}

