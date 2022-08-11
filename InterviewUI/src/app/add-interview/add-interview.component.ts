import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Interview } from '../interview';
import { InterviewService } from '../interview.service';
import { MatDialogRef } from '@angular/material/dialog';
import { Candidate } from '../candidate';
import { Interviewer } from '../interviewer';
import { isEmpty } from 'rxjs';


@Component({
  selector: 'app-add-interview',
  templateUrl: './add-interview.component.html',
  styleUrls: ['./add-interview.component.css']
})
export class AddInterviewComponent implements OnInit {
  interview: Interview = new Interview();
  interviewForm:FormGroup;
  candidates: Array<Candidate>;
  interviewers: Array<Interviewer>;
  
    constructor(private formBuilder:FormBuilder,private interviewService:InterviewService,private router:Router,private dialogRef : MatDialogRef<AddInterviewComponent>) { }

  ngOnInit(): void {
    this.interviewForm = this.formBuilder.group({
      Interview_Date: ['',Validators.required],
      Interview_Day: ['',Validators.required],
      Interview_Time: ['',Validators.required],
      Interview_Link: ['',Validators.required],
      Interview_Result: ['',Validators.required],
      Created_By: ['',Validators.required],
      Creation_Date: ['',Validators.required],
      Modified_By: ['',Validators.required],
      Modification_Date: ['',Validators.required],
      Status: ['',Validators.required],
      Candidate_ID: ['',Validators.required],
      Interviewer_ID: ['',Validators.required]
    });
    this.interviewService.getCandidateList().subscribe(data => {
      this.candidates=data;
    });
    this.interviewService.getInterviewerList().subscribe(data =>{
      this.interviewers=data;
    })
  }

  addInterview(){
    this.interview.date = this.interviewForm.value.Interview_Date;
    this.interview.day = this.interviewForm.value.Interview_Day;
    this.interview.time = this.interviewForm.value.Interview_Time;
    this.interview.link = this.interviewForm.value.Interview_Link;
    this.interview.result = this.interviewForm.value.Interview_Result;
    this.interview.createdby = this.interviewForm.value.Created_By;
    this.interview.creationdate = this.interviewForm.value.Creation_Date;
    this.interview.modifiedby = this.interviewForm.value.Modified_By;
    this.interview.modificationdate = this.interviewForm.value.Modification_Date;
    this.interview.status = this.interviewForm.value.Status;
    this.interview.candidate= JSON.parse( "{}");
    this.interview.candidate.id = this.interviewForm.value.Candidate_ID;
    this.interview.interviewers= JSON.parse( "{}");
    this.interview.interviewers.id = this.interviewForm.value.Interviewer_ID;
    if(this.interview.candidate.id==null){
    this.interviewService.addInterview(this.interview).subscribe(data =>{
      console.log(data);
      alert("Interview Added Sucessfully");
    window.location.reload();
    this.dialogRef.close('save');
    },
    error => console.log(error));
  }
  else
    alert("Please Select another Candidate");

  }



  

  

}
