import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  routerLinkActive="active";
  public loginform:FormData;
  constructor(private formBuilder: FormBuilder,private http:HttpClient,private route:Router) { }
  title = 'admin';
 
  email = ' ';
  password = ' ';
  submitted = false;
 registerForm: FormGroup=new FormGroup({});

  

     
  ngOnInit() {
    this.registerForm = this.formBuilder.group({
        email: ['', [Validators.required, Validators.email]],
        password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }
     
  get f() { return this.registerForm.controls; }
  baseUrl = 'http://localhost:3000/admin/';

  onSubmit() {
    this.http.get<any>(this.baseUrl)
    .subscribe(res=>{
      const u=res.find((a:any)=>{
        return a.email===this.registerForm.value.email && a.password===this.registerForm.value.password
      })
      if(u){
        alert("Login success");
        this.registerForm.reset();
        this.route.navigate(['/dash'])
      }else{
        alert("Invalid Credentials")
      }
    })
  }  
  
     
   
  
  

}
