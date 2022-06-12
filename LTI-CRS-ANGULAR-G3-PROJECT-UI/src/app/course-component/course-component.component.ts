import { Component, OnInit } from '@angular/core';


import { Router } from '@angular/router';
import { AdminServiceService } from '../admin-menu-component/admin-service.service';
import { Course } from '../model/course';
@Component({
  selector: 'app-course-component',
  templateUrl: './course-component.component.html',
  styleUrls: ['./course-component.component.css']
})
export class CourseComponentComponent implements OnInit {

  course = new Course();
  constructor(private _route:Router, private _service:AdminServiceService) { }

  ngOnInit(): void {
  }

  addCourse()
  {
    this._service.addCourse(this.course).subscribe
    (
      data=>
      {
        console.log("data added successfully");
        // this._route.navigate(['productlist']);
      }
    )
  }

}
