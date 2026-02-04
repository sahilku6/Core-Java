package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainApp {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
	
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(10);
		al.add(30);
	
		System.out.println(al);
		
		//stream()
		
		al.stream()
		.forEach(System.out::println);
		
		List<String> name = Arrays.asList("Vaibhav","Sahil","Rohit");
		
		//List<String> name = new ArrayList<String>(Arrays.asList("Vaibhav","Sahil","Rohit"));
		
		name.stream()
		.forEach(System.out::println);
		
		//count
		long count1 = name.stream().count();
		System.out.println(count1+" ");
		
		
		//filter
		
		name.stream()
		.filter(s->s.length()>5)
		.forEach(System.out::println);
		
		
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		
		
		// Map - to perform operation on each element
		List<Integer> doubled=numbers.stream()
		.map(n->n*2)	//retrun new stream
		.collect(Collectors.toList());
		
		System.out.println(doubled);
		
		List<String> UpperCase=name.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(UpperCase);
		
		
		
		//custom object
		
		List<Student> studentList= Arrays.asList(new Student(21,"Ansh"),new Student(12,"Kumar"),new Student(25,"Komal"),new Student(18,"Anjali"));
		
		System.out.println("============================");
		
		studentList.stream()
		.filter(o->o.getName().startsWith("A"))
		.forEach(System.out::println);
		
	}
	
	
}