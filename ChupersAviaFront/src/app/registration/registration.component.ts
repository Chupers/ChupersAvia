import { Component, OnInit } from '@angular/core';
import { FormGroupDirective, FormControl, NgForm, Validators } from '@angular/forms';
import { ErrorStateMatcher } from '@angular/material/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { GlobalRootURL } from '../GlobalRootURL';
import { debuglog, log } from 'util';
import { RegistrService } from '../shared/registr-service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})

export class RegistrationComponent implements OnInit {

  constructor(private registrService: RegistrService,
              private _snackBar:MatSnackBar) { }
  
  hide = true;

  ngOnInit(): void {
  }
  hashpassword;
  mail;
  confirm;
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);
  regitr(){
    if(this.confirm == this.hashpassword){
    this.registrService
      .registerUser(this.mail,this.hashpassword)
      .subscribe(
        (resp:Response) =>{

        }
      )}
      else{
        this._snackBar.open("passwords not match","OK", {duration : 200})
      }
  }
  matcher = new MyErrorStateMatcher();
  

}
export class MyErrorStateMatcher implements ErrorStateMatcher {
  isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
    const isSubmitted = form && form.submitted;
    return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
  }
}