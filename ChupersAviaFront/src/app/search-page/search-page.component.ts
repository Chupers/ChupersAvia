import { Component, OnInit } from '@angular/core';
import { SearchService } from '../shared/search-service';
import { OrderItem } from 'src/entity/orderItem';
import { Observer, Observable } from 'rxjs';

@Component({
  selector: 'app-search-page',
  templateUrl: './search-page.component.html',
  styleUrls: ['./search-page.component.css']
})

export class SearchPageComponent implements OnInit {

  cityFrom:String =""
  cityTo:String = ""
  dateTo:String = ""

  find(){
    
    this.searchService.setFilter(this.cityFrom,this.cityTo,this.dateTo)
    this.loadOrderItemOnPage();

  }
  loadOrderItemOnPage(){
    this.searchService.searchOrderItem().subscribe(
      entitys =>{
        this.OrderItems = entitys;
      }
    );
  }
  constructor(private searchService:SearchService,) {
    
   }
  OrderItems: OrderItem[]
  ngOnInit(): void {
    this.loadOrderItemOnPage();
  }

}
