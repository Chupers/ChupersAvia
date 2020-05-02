import { Component, OnInit } from '@angular/core';
import { OrderItem } from 'src/entity/orderItem';
import { OrderItemService } from '../shared/orderItem-service';
import { ActivatedRoute } from '@angular/router';
import { Customer } from 'src/entity/Customer';
import { BillingAccount } from 'src/entity/billingAccount';
import { User } from 'src/entity/user';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {
  saveBill = false
  orderItem:OrderItem
  billing:BillingAccount
  id : number
  firstName:String
  secondName:String
  cardNumber:String
  user:User
  makeSO(){
    this.user = JSON.parse(localStorage.getItem('user'));
   this.orderItemService.createSalesOrder(this.firstName,this.id,this.secondName,this.cardNumber,this.user.userId)
   .subscribe(response =>{
     this._snackBar.open("complite","OKe",{
       duration : 2000,
     })
   })
  }
  constructor(private orderItemService:OrderItemService,
              private route:ActivatedRoute,
              private _snackBar: MatSnackBar) {
                this.id = parseInt(this.route.snapshot.paramMap.get('id'))
                this.orderItemService.getOrderItemById(this.id).subscribe(response =>{
                  this.orderItem = response
                })
               }
  costumer: Customer;
  ngOnInit(): void {
   
  }

 

}
