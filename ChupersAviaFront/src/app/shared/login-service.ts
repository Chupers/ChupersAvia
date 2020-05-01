import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from, Observer } from 'rxjs';
import {Injectable} from '@angular/core'
import { User } from 'src/entity/user';

@Injectable({
    providedIn:'root'
})
export class LoginService {
    readonly URL = GlobalRootURL.BASE_API_URL + "login"
    readonly URLUser = GlobalRootURL.BASE_API_URL + "user"
    constructor(private http:HttpClient){

    }
    loadUser(username:string):Observable<any>{
        let headers = new HttpHeaders(
            { 'Content-Type': 'application/json',
              'Authorization': localStorage.getItem('auth_token')});
          let options = { headers: headers };
      
        return this.http.get<User>(this.URLUser+"/getByUserName?name="+username,options)

    }
    login(username : string, password: string): Observable<any>{

        let body = { password : password, username : username}
      
          let options = {
            observe: <'body'>'response'
          };
       
        return this.http.post<any>(this.URL,body,options)
    }
    logout(){
        localStorage.removeItem('user');
    }
}