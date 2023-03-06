package basics;

class Student{
	int Rollno;
	String Name;
	int Age;
}
public class Arrays {

	public static void main(String[] args) {
		int nums[]=new int[5];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		System.out.println(nums);//we will get the reference if we try to print the nums we need to iterate 
		for(int i=0;i<=4;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-------------------------------------------------");
		for (int i : nums) {
			System.out.println(i);
		}
		int muldi[][]=new int[3][4];
	
		muldi[0][0]=(int)(Math.random()*100);
		muldi[0][1]=(int)(Math.random()*100);
		muldi[0][2]=(int)(Math.random()*100);
		muldi[0][3]=(int)(Math.random()*100);
		muldi[1][0]=(int)(Math.random()*100);
		muldi[1][1]=(int)(Math.random()*100);
		muldi[1][2]=(int)(Math.random()*100);
		muldi[1][3]=(int)(Math.random()*100);
		muldi[2][0]=(int)(Math.random()*100);
		muldi[2][1]=(int)(Math.random()*100);
		muldi[2][2]=(int)(Math.random()*100);
		muldi[2][3]=(int)(Math.random()*100);
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(muldi[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");
		for (int[] is : muldi) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
			
		}
		Student s1=new Student();
		s1.Rollno=1;
		s1.Name="Abi";
		s1.Age=23;
		Student s2=new Student();
		s2.Rollno=2;
		s2.Name="chaitu";
		s2.Age=25;
		Student s3=new Student();
		s3.Rollno=3;
		s3.Name="afeef";
		s3.Age=24;
		Student Students[]=new Student[3];
		Students[0]=s1;
		Students[1]=s2;
		Students[2]=s3;
		for (Student stud : Students) {
			System.out.println(stud.Name+" "+stud.Age);
		}
		System.out.println("-------------------------------------------------------");
		for(int i=0;i<Students.length;i++) {
			System.out.println(Students[i].Name+" "+Students[i].Age+" "+Students[i].Rollno);
		}
		
		
		

	}

}
