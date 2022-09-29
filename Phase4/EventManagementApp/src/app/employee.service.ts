import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee.model';
import { admin } from './employee.model';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  constructor(private http: HttpClient) { }
  baseUrl = 'http://localhost:3000/employees/';
adminurl='http://localhost:3000/admin/';
  getEmployees() {
    return this.http.get<Employee[]>(this.baseUrl);
  }
  deleteEmployees(id: number) {
    return this.http.delete<Employee[]>(this.baseUrl + id);
  }
  createUser(employee: Employee) {
    return this.http.post(this.baseUrl, employee);
  }
  getEmployeeById(id: number) {
    return this.http.get<Employee>(this.baseUrl  + id);
  }
  updateEmployee(employee: Employee) {
    return this.http.put(this.baseUrl  + employee.id, employee);
  }
  updateadmin(admin: admin) {
    return this.http.put(this.adminurl  + 1, admin);
  }
  getadminById(id:number) {
    return this.http.get<admin>(this.adminurl  + 1);
  }
}
