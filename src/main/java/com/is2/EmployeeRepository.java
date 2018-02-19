package com.is2;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.example.is2.Employee;

@Component
public class EmployeeRepository {
	private static final Map<String, Employee> employees = new HashMap<>();
	
	@PostConstruct
	public void initData() {
		Employee kulzer = new Employee();
		kulzer.setName("Kulzer");
		kulzer.setVorname("Andreas");
		kulzer.setAlter(40);
		kulzer.setBeruf("Softwareentwickler");;
		kulzer.setJahresgehalt(55000);
		employees.put(kulzer.getName(), kulzer);

		Employee illguth = new Employee();
		illguth.setName("Illguth");
		illguth.setVorname("Martin");
		illguth.setAlter(38);
		illguth.setBeruf("Softwareentwickler");;
		illguth.setJahresgehalt(60000);
		employees.put(illguth.getName(), illguth);

		Employee mueller = new Employee();
		mueller.setName("Müller");
		mueller.setVorname("Manuel");
		mueller.setAlter(25);
		mueller.setBeruf("Consultant");;
		mueller.setJahresgehalt(40000);
		employees.put(mueller.getName(), mueller);

	}

	public Employee findEmployee(String name) {
		Assert.notNull(name, "The employee's name must not be null");
		return employees.get(name);
	}
	
}




