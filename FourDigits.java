/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp3;

/**
 *
 * @author walaa
 */
public class VariableTypes2 {

    public static void main(String[] args) {
        
        int x = 2014;

        // هذا الأمر يتم استخدامه لاستخراج الرقم في أول منزلة
        int digit1 = x % 10; //2014 % 10 = 4

        // هنا يتم اخذالباقي من الرقم أي بدون أول منزلة
        x /= 10; // 2014 / 10 = 201 (int/int=int)

        // هذا الأمر يتم استخدامه لاستخراج الرقم في أول منزلة
        int digit2 = x % 10; //201 % 10 = 1

        // هنا يتم اخذالباقي من الرقم أي بدون أول منزلة
        x /= 10; // 201 / 10 = 20 (int/int=int)

        // هذا الأمر يتم استخدامه لاستخراج الرقم في أول منزلة
        int digit3 = x % 10; //20 % 10 = 0

        // هنا يتم اخذالباقي من الرقم أي بدون أول منزلة
        x /= 10; // 20 / 10 = 2 (int/int=int)

        // هذا الأمر يتم استخدامه لاستخراج الرقم في أول منزلة
        int digit4 = x % 10; //2 % 10 = 2

        /*
       أقدر استبدل الأمر
       int digit4 = x%10;
       بالأمر
       int digit4 = x;
       لان طالما قيمة اكس بس آحاد كل الأمرين يعطون نفس النتيجة
         */
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
    }

}
