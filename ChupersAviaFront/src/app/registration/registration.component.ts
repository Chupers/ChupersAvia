import { Component, OnInit } from '@angular/core';
import { FormGroupDirective, FormControl, NgForm, Validators } from '@angular/forms';
import { ErrorStateMatcher } from '@angular/material/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { GlobalRootURL } from '../GlobalRootURL';
import { debuglog } from 'util';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})

export class RegistrationComponent implements OnInit {

  constructor(public http:HttpClient) { }
  readonly URL = GlobalRootURL.BASE_API_URL + 'user/registration'
  hide = true;

  ngOnInit(): void {
  }
  password ="";
  mail  = "";
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);
  regitr(){
    let headers = new HttpHeaders(
      {'Content-Type': 'application/json'}
    )
    let body = {
      userName : this.mail,
      hashPassword : this.password
    };
    let options = {
      headers : headers ,
      observe : <'body'>'response'
    }
    this.http.post<any>(this.URL,body,options).subscribe((loginResp: Response) =>{
      if(loginResp.ok){
        debuglog("OK");
      }
    })
  }
  matcher = new MyErrorStateMatcher();
  

}
export class MyErrorStateMatcher implements ErrorStateMatcher {
  isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
    const isSubmitted = form && form.submitted;
    return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
  }
}