import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'

@Injectable({
    providedIn:'root'
})
export class ProfileService {
    readonly URL = GlobalRootURL.BASE_API_URL + "/login"
    constructor(private http:HttpClient){

    }
    // registerUser(userName : string, hashPassword: string): Observable<any>{
       
    //     let body = { hashPassword : hashPassword, userName : userName}
    //     return this.http.post(this.URL,body)
    // }
}