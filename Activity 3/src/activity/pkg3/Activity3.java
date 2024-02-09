/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity.pkg3;
import java.text.DecimalFormat;
/**
 *
 * @author MenardJakeP
 */
public class Activity3 {

    
    public static void main(String[] args) {
        
       DecimalFormat df =new
       DecimalFormat("###0.00");
       double c = 10f;
       double a = 5f;
       double b = 5;
       
       double result = c * a + b;
        System.out.println(df.format(result));
       
    }

    
    }

    

