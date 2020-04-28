import { Component, OnInit } from '@angular/core';
import { SearchService } from '../shared/search-service';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  constructor(private searchService:SearchService,
    private router:Router
              ) { }

  ngOnInit(): void {
  }
  cityFrom:String =""
    cityTo:String = ""
    dateTo:String = ""
  find(){
    
    this.searchService.setFilter(this.cityFrom,this.cityTo,this.dateTo)
    this.router.navigate(['/search'])
  }

}
