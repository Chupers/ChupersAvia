import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { LoginComponent } from '../login/login.component';
import { RegistrationComponent } from '../registration/registration.component';
import { User } from 'src/entity/user';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public dialog: MatDialog) { }

  user:User

  loadUser(){

  }
  openRegistrationDialog(){
    const dialogRef = this.dialog.open(RegistrationComponent);
    dialogRef.afterClosed().subscribe(result =>{
      this.loadUser()
    });
  }

  openLoginDialog(){
    const dialogRef = this.dialog.open(LoginComponent)
    dialogRef.afterClosed().subscribe(result =>{
      this.loadUser()
    });
  }

  ngOnInit(): void {
  }

}
