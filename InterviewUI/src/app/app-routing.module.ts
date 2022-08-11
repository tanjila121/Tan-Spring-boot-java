import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { InterviewListComponent } from './interview-list/interview-list.component';
import { UpdateInterviewComponent } from './update-interview/update-interview.component';
// import { AddInterviewComponent } from './add-interview/add-interview.component';

const routes: Routes = [
  {path:'',redirectTo:'interviews',pathMatch:'full'},
  {path:'interviews',component:InterviewListComponent},
  {path:'update-interview/:id',component:UpdateInterviewComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
