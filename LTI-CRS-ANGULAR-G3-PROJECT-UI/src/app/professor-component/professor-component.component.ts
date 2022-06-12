import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { AdminServiceService } from '../admin-menu-component/admin-service.service';
import { Professor } from '../model/professor';

@Component({
  selector: 'app-professor-component',
  templateUrl: './professor-component.component.html',
  styleUrls: ['./professor-component.component.css']
})
export class ProfessorComponentComponent implements OnInit {

  constructor(private _route:Router, private _service:AdminServiceService) { }
  professor = new Professor();

  ngOnInit(): void {
  }


  addProfessor()
  {
    this._service.addProfessor(this.professor).subscribe
    (
      data=>
      {
        console.log("data added successfully");
        // this._route.navigate(['productlist']);
      }
    )
  }

}
