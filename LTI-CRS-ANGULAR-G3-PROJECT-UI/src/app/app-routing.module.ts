import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CourseComponentComponent } from './course-component/course-component.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { Professor } from './model/professor';
import { ProfessorComponentComponent } from './professor-component/professor-component.component';
import { RegisterComponentComponent } from './register-component/register-component.component';

const routes: Routes = [
  { path: 'Login', component:  LoginComponentComponent },
  { path: 'Register', component:  RegisterComponentComponent },
  { path: 'addCourse', component:  CourseComponentComponent },
  { path: 'addProfessor', component: ProfessorComponentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
