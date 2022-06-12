import { Component, OnInit } from '@angular/core';
import { Course } from '../model/course';
import { AdminServiceService } from './admin-service.service';

@Component({
  selector: 'app-admin-menu-component',
  templateUrl: './admin-menu-component.component.html',
  styleUrls: ['./admin-menu-component.component.css']
})
export class AdminMenuComponentComponent implements OnInit {

  constructor(private _httpService: AdminServiceService) { }
  getData:any[];
  courses: Course[];

  ngOnInit(): void {
  }

  //call the service using the get course details

  getCourseDetails(){

    this._httpService.getCourse().subscribe((res : any[])=>{
      console.log(res);
      this.getData = res;

});
  }

  goToDeleteCourse(courseId:number)
                   {
                     this._httpService.removeCourse(courseId).subscribe(
                      data=>{
                        console.log("deleted successfully")
                        this.courses=data;
                      },
                      error=>console.log("error occured")
                      )
  

}
}
