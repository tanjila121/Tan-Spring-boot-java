import { Component } from '@angular/core';
import { AddInterviewComponent } from './add-interview/add-interview.component';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'InterviewUI';

  constructor(private dialog:MatDialog){

  }

  openDialog() {
    this.dialog.open(AddInterviewComponent, {
      width:'30%'
    });
  }
}
