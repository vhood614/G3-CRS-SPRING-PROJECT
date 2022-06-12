import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from '../model/course';
import { Professor } from '../model/professor';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {
  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Access-Control-Allow-Origin','*');
  
  constructor(private httpClient:HttpClient) { }

  //get method implementation, fetch the data
  getCourse(): Observable<any>{
    let getCourseUrl:string = "http://localhost:8083/listcourse";
    return this.httpClient.get(getCourseUrl,{headers: this.headers});
  }

  // addCourse(course:Course): Observable<any> {
  //   // const headers = { 'content-type': 'application/json'}  
  //   // const body=JSON.stringify(course);
  //   // console.log(body)
  //   let addCourseUrl:string = "http://localhost:8083/add-course";
  //   return this.httpClient.post(addCourseUrl,{headers: this.headers});
    addCourse(course: Course): Observable<any>{
      return this.httpClient.post<any>("http://localhost:8083/add-course", course);
      // }
  }
  addProfessor(professor: Professor): Observable<any>{
    return this.httpClient.post<any>("http://localhost:8083/add-professor", professor);
  }

  removeCourse(courseId:number): Observable<any>{
    return this.httpClient.delete<any>("http://localhost:8083/delete-course/" +courseId);
   }
  
}
