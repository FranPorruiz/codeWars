//Given an array of integers, find the one that appears an odd number of times.
//There will always be only one integer that appears an odd number of times.
public class FindOdd {
	public static int findIt(int[] a) {
    int odd=0;
    
    //this matrix is to check what number the size is the same of the original arrays
    int[] matriz=new int[a.length];
    
    //we make a comparison beetween the arrays with itself, if the number is even the result is even, 
    //if the result is even you have even numbers
    for (int i = 0; i < a.length; i++) {
       matriz[i]=0;      
       for (int j = 0; j < a.length; j++) {
            if(a[i]==a[j])
              matriz[i]++;
            }
    }
    
    //we only have a ood number, so, si the number of our matrix is odd tha is the number
    for (int i = 0; i < matriz.length; i++) {
        if(matriz[i]%2==1)
          odd=a[i];
      }
  	
    return odd;
  }
}
