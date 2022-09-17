package javaOdev2;

public class Main {

	public static void main(String[] args) {
		
		Students student = new Students ();  //STUDENTS CLASSINI ÇAĞIRDIK. CONSTRUCTOR ÇALIŞTI.
		
		Students student1 = new Students (1,"Berker","Oğuz",25,"Bilgisayar");
		Students student2 = new Students(2,"Sümeyye","Yücel",25,"Bilgisayar");
		Students student3 = new Students(3,"Hasan","Oğuz",16,"Aşçılık");
		
		Students [] students = {student1,student2,student3};
		
		for (Students index : students)
		{
			System.out.println(index.id+" no'lu öğrencinin ismi = " + index.name);
		}
		
		
		
		
		
		

	}

}
