public class Maximum{
	public static void main(String[] args){
	
		int[] arr ={11, 3, 25, 33,14};
		int min=arr[0];
		int max=0;
		for(int i=0; i<arr.length; i++){
	
			if(max<arr[i]){

				max=arr[i];			
			}
			else{
				
				
				if(min<arr[i]){
					break;
					}
				else{
					min=arr[i];
				}

			}	

		}System.out.println("min = "+min+ " max = "+max);
} 
}