package com.collection;
import java.util.ArrayList;
import com.collection.Employee;
public class MainClass {
	public static void main(String[] args) {
			ArrayList emplist = new ArrayList();
			emplist.add(new Employee ("Blake", 1234, 2341.12));
			emplist.add(new Employee ("Blake", 1234, 2341.12));
			emplist.add(new Employee ("Sundar", 1274, 2346.34));
			processSalary(emplist);
			}
			public static void processSalary(ArrayList ref)
			{
			for (int i =0; i<ref.size(); i++)
			{
			Employee e1 = (Employee) ref.get(i);
			System.out.println("salary = "+e1.salary);
			System.out.println("name = "+e1.name);
			System.out.println("id = "+e1.id);
			System.out.println("===============================================");
			}}
	}


