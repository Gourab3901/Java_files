//        1 	   1 
//          2      2 
//            3 3 
//              4
 


import java.util.*;
public class Q23{
public static void main(String[] args) {
int n=4;
for(int i=1;i<=n;i++){
for(int j=1;j<i;j++)
System.out.print(" ");
System.out.print(i);
for(int j=1;j<=(2*(n-i))-1;j++)
System.out.print(" ");
if(i!=n)
System.out.print(i);
System.out.println(); } } }



















