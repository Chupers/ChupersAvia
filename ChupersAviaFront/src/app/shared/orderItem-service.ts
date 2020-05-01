import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { OrderItem } from 'src/entity/orderItem';

@Injectable({
    providedIn:'root'
})
export class OrderItemService {
    readonly URL = GlobalRootURL.BASE_API_URL + "orderItem"
    readonly SOURL = GlobalRootURL.BASE_API_URL + "salesOrder"
    constructor(private http:HttpClient){

    }
    getOrderItemById(id:number): Observable<any>{
        return this.http.get<OrderItem>(this.URL+"/findById?id="+id)
    }
    createSalesOrder(firstName:String,orderItemId : number,secondName:String,cardNumber:String,userId:number) : Observable<any>{
        let body = { 
            firstName : firstName,
            secondName : secondName,
            cardNumber : cardNumber,
            userId : userId,
            orderItemId: orderItemId
        }
        return this.http.post(this.SOURL,body)
    }
}