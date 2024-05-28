// import { Component, OnInit } from '@angular/core';
// import { Employee } from '../employee';
// import { EmployeeService } from '../employee.service';

// @Component({
//   selector: 'app-employee-list',
//   templateUrl: './employee-list.component.html',
//   styleUrls: ['./employee-list.component.css']
// })
// export class EmployeeListComponent implements OnInit {
//   // this array holds employee properties
//   employees: Employee[];

//   constructor(private employeeService :EmployeeService){}

//   ngOnInit(): void {
//     this.getEmployees();
//   }

//   private getEmployees(){    // this is response data and we are sending to employees
//   this.employeeService.getEmployeesList().subscribe(data=>
//     {
//       this.employees=data;
//     })
// }

//   }



import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];

  constructor(private employeeService: EmployeeService) {
    // Assign a value to employees in the constructor
    this.employees = [];
  }

  ngOnInit(): void {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService.getEmployeesList().subscribe(data => {
      this.employees = data;
    });
  }
}

