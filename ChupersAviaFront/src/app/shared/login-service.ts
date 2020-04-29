import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'

@Injectable({
    providedIn:'root'
})
export class LoginService {
    readonly URL = GlobalRootURL.BASE_API_URL + "login"
    readonly URLUser = GlobalRootURL.BASE_API_URL + "user"
    constructor(private http:HttpClient){

    }
    loadUser(){

    }
    login(username : string, password: string): Observable<any>{
       
        let body = { password : password, username : username}
        return this.http.post(this.URL,body)
    }
}