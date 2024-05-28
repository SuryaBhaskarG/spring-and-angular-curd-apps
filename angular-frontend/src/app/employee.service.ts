import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  // this baseurl for our rest end points
  private baseURL ="http://localhost:8080/api/v1/employee";

  constructor(private httpClient:HttpClient)  {}

  // type is array of employee and it takes parameter base url
      getEmployeesList(): Observable<Employee[]>
        {
           return this.httpClient.get<Employee[]>('${this.baseUrl}');
        }

}

