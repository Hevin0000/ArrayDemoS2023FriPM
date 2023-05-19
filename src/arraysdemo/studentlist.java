/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author Hevin
 */
public class studentlist {
    //comment addes at 1:21 PM
    //Friday
    public static void main(String[] args){
        Student s1 = new Student("s1","Hevin");
        Student[] studentList = new Student[3];
        
        studentList[0]=s1;
        studentList[1]=new Student( "s2","abc");
        studentList[2]=new Student( "s3","def");
        for(int i=0;i<studentList.length;i++) {
        System.out.println(studentList[i].getaName());
    }
       }
            }
