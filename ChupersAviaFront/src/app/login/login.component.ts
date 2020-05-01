import { Component, OnInit } from '@angular/core';
import { MyErrorStateMatcher } from '../registration/registration.component';
import { FormControl, Validators } from '@angular/forms';
import { LoginService } from '../shared/login-service';
import { debuglog } from 'util';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private loginService:LoginService) { }
  
  hide = true;

  ngOnInit(): void {
  }
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);
  mail = "";
  hashpassword = "";
  login(){
    localStorage.removeItem('auth_token');
    console.log(localStorage.getItem('auth_token'))
    this.loginService.login(this.mail,this.hashpassword).subscribe(response=>{
      localStorage.setItem('auth_token', response.headers.get('Authorization'));
      this.loginService.loadUser(this.mail).subscribe(responseUser =>{
        localStorage.setItem('user',JSON.stringify(responseUser))
      })
     
    })
     
  }
  matcher = new MyErrorStateMatcher();
}
