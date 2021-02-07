/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class SimpleCalculateServer {
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connection is being tested...");
        return true;
    }
    
    public int addInteger(int a,int b){
        System.out.println("[Server] - Adding "+a+" and "+b);
        return a+b;
    }
    
    public boolean isArrayLengthSame(int[] a , int[] b ){
        return a.length==b.length;
    }
    
    public int substractInteger(int a,int b){
        System.out.println("[Server] - Substracting "+a+" and "+b);
        return a-b;
    }
    
    public int multiplyInteger(int a,int b){
        System.out.println("[Server] - Multiplying "+a+" and "+b);
        return a*b;
    }
    
    public int divideInteger(int a,int b) throws Exception{
        if(b==0){
            throw new Exception();
            
        }
        if ((b==0) && (a==0)){
           throw new Exception(); 
        }
        System.out.println("[Server] - Dividing "+a+" and "+b);
        return a/b;
    }
    
    public int[] addArrayElements(int [] a, int [] b)throws Exception{
        if (isArrayLengthSame(a,b)){
            int[] sumArray=new int[a.length];
            System.out.println("[Server] - Adding "+Arrays.toString(a)+" and "+ Arrays.toString(b));
            
            for(int i=0;i<a.length;i++){
            sumArray [i]=a[i] + b[i];
            }
            return sumArray;
        }else{
            throw new IllegalArgumentException("Arrays does not have same length");
        }
        
    }
    
    
    public int[] substractArrayElements(int [] a, int [] b) throws Exception{
        if (isArrayLengthSame(a,b)){
            int[] sumArray=new int[a.length];
            System.out.println("[Server] - Substracting "+Arrays.toString(a)+" and "+ Arrays.toString(b));
            
            for(int i=0;i<a.length;i++){
            sumArray [i]=a[i] - b[i];
            }
            return sumArray;
        }else{
            throw new IllegalArgumentException("Arrays does not have same length");
        }
        
    }
    
    public int[] executeArrayMultiply(int [] a, int [] b)throws Exception{
        if (isArrayLengthSame(a,b)){
            int[] sumArray=new int[a.length];
            System.out.println("[Server] - Multiplying "+Arrays.toString(a)+" and "+ Arrays.toString(b));
            
            for(int i=0;i<a.length;i++){
            sumArray [i]=a[i] * b[i];
            }
            return sumArray;
        }else{
            throw new IllegalArgumentException("Arrays does not have same length");
        }
        
    }
    
    public int[] divideArrayElements(int[] a,int[] b) throws Exception{
        if (isArrayLengthSame(a,b)){
            int[] sumArray=new int[a.length];
            System.out.println("[Server] - Dividing "+Arrays.toString(a)+" and "+Arrays.toString(b));
            for(int i=0;i<a.length;i++){
                if(b[i]==0){
                    throw new Exception();
         
                }
                if ((b[i]==0) && (a[i]==0)){
                    throw new Exception(); 
                }
                sumArray[i]=a[i]/b[i];
            }
            return sumArray;
        }else{
            throw new IllegalArgumentException("Arrays does not have same length");
        }
        
    }
    
    
}
