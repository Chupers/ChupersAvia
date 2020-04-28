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

  constructor(private searchService:SearchService) {
    this.searchService.searchOrderItem().subscribe(
      entitys =>{
        this.OrderItems = entitys;
      }
    );
   }
  OrderItems: OrderItem[]
  ngOnInit(): void {
   
  }

}
