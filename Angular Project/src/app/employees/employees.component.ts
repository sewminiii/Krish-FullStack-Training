import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { EmployeeService } from './employee.service';
//import employees from './data/employees.json';
import {Employee} from './Employees.model';
@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit,OnDestroy {
  
  title: string = 'Employee Management Solution'
  employees !:Employee[] ;
  showIcon:boolean = false;
  filteredEmployee !:any[];
  message:string='';
  subscriber!: Subscription;
  private _designationFilter:string = '';

  set designationFilter(value:string){
    this._designationFilter=value;
    this.filterByDesignation();
  }
  get designationFilter():string{
    return this._designationFilter;
  }

  constructor(private emplpoyeeService:EmployeeService) { }

  ngOnInit(): void {
    this.subscriber = this.emplpoyeeService.getEmployees().subscribe({
      next: data=> {
        this.filteredEmployee=data;
        this.employees = this.filteredEmployee
      }
    })
    
  }
  ngOnDestroy(): void {
    this.subscriber.unsubscribe();
  }
  toggleIcon(){
    this.showIcon = !this.showIcon;
  }

  filterByDesignation(){
    this.filteredEmployee=this.employees.filter(employee=>employee.designation.includes(this.designationFilter));
  }
  
  onMessageReceived(value:string){
    this.message=value;
  }
}
