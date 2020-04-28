
import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { OrderItem } from 'src/entity/orderItem';

@Injectable({
    providedIn:'root'
})
export class SearchService {
    readonly URL = GlobalRootURL.BASE_API_URL + "orderItem/findOrderItem"
    constructor(private http:HttpClient){

    }
    cityFrom:String
    cityTo:String
    dateTo:String

    setFilter(cityFrom:String,cityTo:String,dateTo:String){
        this.cityFrom = cityFrom
        this.cityTo = cityTo
        this.dateTo = dateTo
    }
     searchOrderItem(): Observable<OrderItem[]>{
       
         let body = { cityFrom : this.cityFrom, cityTo : this.cityTo,dateTo:this.dateTo}
         return this.http.post<OrderItem[]>(this.URL,body)
     }
}