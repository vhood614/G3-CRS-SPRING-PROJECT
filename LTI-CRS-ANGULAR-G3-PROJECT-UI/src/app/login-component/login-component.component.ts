import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {

  constructor() {
  
   }
  clickMessage:string="What is Status";
  ngOnInit(): void {
  
    

}
// onClickMe(){
//   if(this.username =="admin" && this.password =="1234") { console.log("welcome Admin")  }
  
// }
onClickMe(){
  window.open("http://localhost:4200/?username=&password=");
}

}