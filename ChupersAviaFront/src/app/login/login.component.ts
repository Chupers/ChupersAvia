import { Component, OnInit } from '@angular/core';
import { MyErrorStateMatcher } from '../registration/registration.component';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }
  
  hide = true;

  ngOnInit(): void {
  }
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);

  matcher = new MyErrorStateMatcher();
}
