import { Component, OnInit } from '@angular/core';
import { admin } from '../employee.model';
import { Router } from '@angular/router';
import { EmployeeService } from '../employee.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private empService: EmployeeService, private router: Router) { }

  ngOnInit(): void {
  }
  editadminn(admin: admin): void {
    localStorage.removeItem('editEmpId');
    localStorage.setItem('editEmpId', admin.id!.toString());
    this.router.navigate(['admin']);
  }

}
