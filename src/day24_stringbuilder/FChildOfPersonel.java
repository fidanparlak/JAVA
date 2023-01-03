package day24_stringbuilder;

import day25_Inheritance.APersonel;

public class FChildOfPersonel extends APersonel {


        public static void main(String[] args) {

            FChildOfPersonel obj1= new FChildOfPersonel();

            System.out.println(obj1.isim);
            // obj1.privateMethod();
            // child class olsa da parent class'daki private method'a ulasamaz

        }
}
