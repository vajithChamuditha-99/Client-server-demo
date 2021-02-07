/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author me
 */

/* 

if we divide 4 by 3 it will gives 1.33. but in here it will give 
only the whole number part.to overcome that we have to change the 
data types into double

*/


public class SimpleClient {
    SimpleCalculateServer server= new SimpleCalculateServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleClient client=new SimpleClient();
        client.executeTest();
        client.execute();
        client.executeDivide();
        client.executeMultiply();
        client.executeSubstract();
        client.executeArraySum();
        client.executeArrayMultiply();
        client.executeArraySubstract();
        client.executeDivideArray();
    }
    
    public void executeTest(){
        System.out.println("[Client] - Testing if the server is connected...");
        if (server.isServerConnected()){
            System.out.println("[Client] - The client is Connected, the test can proceed");
        }else{
            System.out.println("[Client] - The client is Not Connected, the test has failed");
        }
    }
    
    public void execute(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int x=2;
            int y=3;
            System.out.println("[Client] - Asking the server what is the sum of "+x+" and "+y);
            int z=server.addInteger(x, y);
            System.out.println("[Client] - The server has replied that the sum of "+x+ " and "+y+" is "+z);
            if(z==x+y){
                System.out.println("[Client] - The server has returned the correct answer");
                
            }
            else{
                System.out.println("[Client] - The server has returned the wrong answer");
            }
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    public void executeDivide(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int x=4;
            int y=3;
            System.out.println("[Client] - Asking the server what is the ratio of "+x+" and "+y);
            int z;
            try {
                z = server.divideInteger(x, y);
                System.out.println("[Client] - The server has replied that the ratio of "+x+ " and "+y+" is "+ z);
                if(z==x/y){
                System.out.println("[Client] - The server has returned the correct answer");
                
                }
                else{
                    System.out.println("[Client] - The server has returned the wrong answer");
                }
            } catch (Exception ex) {
                System.out.println("[Client] - Something went wrong!!!..");
            }
            
            
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
    public void executeSubstract(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int x=7;
            int y=3;
            System.out.println("[Client] - Asking the server what is the substraction of "+x+" and "+y);
            int z=server.substractInteger(x, y);
            System.out.println("[Client] - The server has replied that the substraction of "+x+ " and "+y+" is "+z);
            if(z==x-y){
                System.out.println("[Client] - The server has returned the correct answer");
                
            }
            else{
                System.out.println("[Client] - The server has returned the wrong answer");
            }
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
    public void executeMultiply(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int x=2;
            int y=3;
            System.out.println("[Client] - Asking the server what is the multiply of "+x+" and "+y);
            int z=server.multiplyInteger(x, y);
            System.out.println("[Client] - The server has replied that the multiply of "+x+ " and "+y+" is "+z);
            if(z==x+y){
                System.out.println("[Client] - The server has returned the correct answer");
                
            }
            else{
                System.out.println("[Client] - The server has returned the wrong answer");
            }
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
    public void executeArraySum(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int[] x={5,8,9};
            int[] y={3,1,4};
            System.out.println("[Client] - Asking the server what is the sum of "+Arrays.toString(x)+" and "+Arrays.toString(y));
            try{
                int[] z=server.addArrayElements(x, y);
                System.out.println("[Client] - The server has replied that the sum of "+Arrays.toString(x)+" and "+Arrays.toString(y)+" is "+Arrays.toString(z));
            }catch(Exception e){
                System.out.println("[Client] - Array lengths are not equal!!!...");
            }
        
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
    public void executeArrayMultiply(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int[] x={5,8,9};
            int[] y={3,1,4};
            System.out.println("[Client] - Asking the server what is the multiplication of "+Arrays.toString(x)+" and "+Arrays.toString(y));
            try{
                int[] z=server.executeArrayMultiply(x, y);
                System.out.println("[Client] - The server has replied that the multiplication of "+Arrays.toString(x)+" and "+Arrays.toString(y)+" is "+Arrays.toString(z));
            }catch(Exception e){
                System.out.println("[Client] - Array lengths are not equal!!!...");
            }
        
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
    public void executeArraySubstract(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            int[] x={5,8,9};
            int[] y={3,1,4};
            System.out.println("[Client] - Asking the server what is the substraction of "+Arrays.toString(x)+" and "+Arrays.toString(y));
            try{
                int[] z=server.substractArrayElements(x, y);
                System.out.println("[Client] - The server has replied that the substraction of "+Arrays.toString(x)+" and "+Arrays.toString(y)+" is "+Arrays.toString(z));
            }catch(Exception e){
                System.out.println("[Client] - Array lengths are not equal!!!...");
            }
        
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
    
    public void executeDivideArray(){
        System.out.println("[Client] - Testing the server is Connected...");
        if(server.isServerConnected()){
            System.out.println("[Client] - Server is Connected , test can be proceed... ");
            try{
                int[] x={4,8,9,12};
                int[] y={2,4,3,3};
                System.out.println("[Client] - Asking the server what is the ratio of "+Arrays.toString(x)+ " and "+Arrays.toString(y));
                int[] z;
                try {
                    z = server.divideArrayElements(x, y);
                    System.out.println("[Client] - The server has replied that the ratio of "+Arrays.toString(x)+ " and "+Arrays.toString(y)+" is "+ Arrays.toString(z));
                    
                } catch (Exception ex) {
                    System.out.println("[Client] - Something went wrong!!!..");
                }
            }catch(Exception e){
                System.out.println("[Client] - Array lengths are not equal!!!...");
            }
            
            
        }
        else{
            System.out.println("[Client] - Server is  Not Connected , test has been failed!!!... ");
        }
    }
    
}
