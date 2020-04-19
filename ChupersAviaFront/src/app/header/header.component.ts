import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { LoginComponent } from '../login/login.component';
import { RegistrationComponent } from '../registration/registration.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public dialog: MatDialog) { }

  openRegistrationDialog(){
    const dialogRef = this.dialog.open(RegistrationComponent);
  }

  openLoginDialog(){
    const dialogRef = this.dialog.open(LoginComponent)
  }

  ngOnInit(): void {
  }

}
