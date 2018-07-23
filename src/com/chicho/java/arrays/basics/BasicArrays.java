package com.chicho.java.arrays.basics;

public class BasicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] byteArray;
		
		short[] shortArray;
		
		int[] intArray; //declating an int array. Here. only reference of an array is created [step-1]
		intArray = new int[5]; //allocating memory to array [step-2]
		intArray[0] = 27;
		intArray[1] = 52;
		intArray[2] = 9;
		intArray[3] = 108;
		intArray[4] = 99;
		
		
		//another way //declaring array literals
		int[] intArray1 = new int[]{1,2,3,4};
		
		//No need to write new int part in the latest version of java
		int[] intArray2 = {11,12,13,14};
		
		//Accessing array elements
		for(int i : intArray1){
			System.out.println(i);
		}
		
		long[] longArray;
		
		float[] floatArray;
		
		double[] doubleArray;
		
		char[] charArray;
		
		// declares an Array of Student.
        Student[] arr;
 
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
 
        // initialize the first elements of the array
        arr[0] = new Student(1,"aman");
 
        // initialize the second elements of the array
        arr[1] = new Student(2,"vaibhav");
 
        // so on...
        arr[2] = new Student(3,"shikar");
        arr[3] = new Student(4,"dharmesh");
        arr[4] = new Student(5,"mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                        arr[i].roll_no +" "+ arr[i].name);
    }
		
	}


class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
