package com.is2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.is2.CalculateNettoByEmployeeNameRequest;
import com.example.is2.CalculateNettoByEmployeeNameResponse;
import com.example.is2.GetEmployeeRequest;
import com.example.is2.GetEmployeeResponse;
import com.is2.EmployeeRepository;


@Endpoint
public class EmployeeEndpoint {
	private static final String NAMESPACE_URI = "http://is2.example.com";

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeEndpoint(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
		GetEmployeeResponse response = new GetEmployeeResponse();
		response.setEmployee(employeeRepository.findEmployee(request.getName()));

		System.out.println(response.getEmployee() + " eingabe war: "+ request.getName());
		
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "calculateNettoByEmployeeNameRequest")
	@ResponsePayload
	public CalculateNettoByEmployeeNameResponse calculateNettoByEmployeeName(@RequestPayload CalculateNettoByEmployeeNameRequest request) {
		CalculateNettoByEmployeeNameResponse response = new CalculateNettoByEmployeeNameResponse();
		int bruttoGehalt = employeeRepository.findEmployee(request.getName()).getJahresgehalt();
		int nettoGehalt = (int) (bruttoGehalt * 0.6);

		response.setNettoGehalt(nettoGehalt);
		
		return response;
	}
	
	
}
