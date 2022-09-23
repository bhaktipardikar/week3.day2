package week3.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
	
		
		
	Set<Integer> data1 = new LinkedHashSet<Integer>();
	Set<Integer> data2 = new LinkedHashSet<Integer>();
	
	Set<Integer> data3 = new LinkedHashSet<Integer>();
	
	data1.add(3);
	data1.add(2);
	data1.add(11);
	data1.add(4);
	data1.add(6);
	data1.add(7);
	for(Integer values1:data1)
	{
		//System.out.print(values1);

	data2.add(1);
	data2.add(2);
	data2.add(8);
	data2.add(4);
	data2.add(9);
	data2.add(7);
	for (Integer values2:data2)
	{
		//System.out.print(values2);
		
	
	if (values1==values2)
	{
		System.out.println(values2);
		data3.add(values2);
}
	}
	System.out.println("Intersection"+data3);
	}}}

