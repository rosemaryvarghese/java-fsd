package arrayRotation;

class Rotate { 
public void rotate(int[] num, int k) {
    		if(k > num.length) 
       			k=k%num.length;
 		int[] res = new int[num.length];
 		for(int i=0; i < k; i++){
        			res[i] = num[num.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<num.length; i++){
        			res[i] = num[j];
j++;
    		}
 		System.arraycopy( res, 0, num, 0, num.length );
}
} 
public class ArrayRotation
{
	public static void main(String[] args) {
		Rotate r = new Rotate();
        		int array[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(array, 5); 
        		for(int i=0;i<array.length;i++){
            			System.out.print(array[i]+" ");
        		}
	}
}
