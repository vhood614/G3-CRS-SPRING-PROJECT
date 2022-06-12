import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { AdminMenuComponentComponent } from './admin-menu-component/admin-menu-component.component';
import { RegisterComponentComponent } from './register-component/register-component.component';
import { CourseComponentComponent } from './course-component/course-component.component';
import { ProfessorComponentComponent } from './professor-component/professor-component.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponentComponent,
    AdminMenuComponentComponent,
    RegisterComponentComponent,
    CourseComponentComponent,
    ProfessorComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
