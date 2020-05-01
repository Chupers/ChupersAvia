import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { LoginComponent } from '../login/login.component';
import { RegistrationComponent } from '../registration/registration.component';
import { User } from 'src/entity/user';
import { LoginService } from '../shared/login-service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public dialog: MatDialog,
    public loginService:LoginService) { }

  user:User

  loadUser(){
    
  }
  openRegistrationDialog(){
    const dialogRef = this.dialog.open(RegistrationComponent);
    dialogRef.afterClosed().subscribe(result =>{
      this.user = JSON.parse(localStorage.getItem('user'));
    });
  }

  openLoginDialog(){
    const dialogRef = this.dialog.open(LoginComponent)
    dialogRef.afterClosed().subscribe(result =>{
      this.loadUser()
    });
  }

  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user'));
  }

}
