package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Reverse_string {

	public static void main(String[] args) {
		
		//1-Reverse a String: Write a loop to reverse a given string and print the reversed string.
		   String alfabeto="a, b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w , y ,z";
		   String []valores=alfabeto.split( ",");
		   List<String> list = Arrays.asList(valores);
	       Collections.reverse(list);

		   for(String e:list){
		   System.out.print(e);
		  }
			

}
}	
	

		
		
		

	
	
