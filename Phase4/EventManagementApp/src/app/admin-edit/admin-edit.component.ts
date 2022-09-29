import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-admin-edit',
  templateUrl: './admin-edit.component.html',
  styleUrls: ['./admin-edit.component.css']
})
export class AdminEditComponent implements OnInit {

  empformlabel = 'Edit Admin';
  empformbtn = 'Update';
  constructor(private formBuilder: FormBuilder, private router: Router, private empService: EmployeeService) {
  }
  addForm: FormGroup;
  editForm: FormGroup;
  ngOnInit() {

    this.editForm = this.formBuilder.group({
      email: ['', Validators.required],
      password: ['', [Validators.required, Validators.maxLength(14)]]
    });
    
    const empid = Number(localStorage.getItem('editEmpId'));
    if (+empid > 0) {
      this.empService.getadminById(+empid).subscribe(data => {
        this.editForm.patchValue(data);
      });
    }
  }

  onUpdate() {

    console.log('Update fire');
    this.empService.updateadmin(this.editForm.value).subscribe(data => {
      this.router.navigate(['']);
    },
      error => {
        alert(error);
      });
  }
  
  

}
