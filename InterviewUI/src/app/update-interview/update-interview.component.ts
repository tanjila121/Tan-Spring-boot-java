import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Interview } from '../interview';
import { InterviewService } from '../interview.service';

@Component({
  selector: 'app-update-interview',
  templateUrl: './update-interview.component.html',
  styleUrls: ['./update-interview.component.css']
})
export class UpdateInterviewComponent implements OnInit {
  id:number;
  interview : Interview = new Interview();
    constructor(private interviewService: InterviewService,
      private route: ActivatedRoute,
      private router: Router) { }

  ngOnInit(): void {
    console.log(this.route.snapshot.params['id'])
    this.id = this.route.snapshot.params['id'];
    this.interviewService.getInterviewById(this.id).subscribe(data =>{
      this.interview=data;
    },
    error => console.log(error));
  }
  updateInterview(){
    this.interviewService.updateInterview(this.interview).subscribe(data  =>{
      alert("Leave Updated Sucessfully")
      this.goToInterview();
    },
    )
    // error => console.log(error));
  }

  goToInterview(){
    this.router.navigate(['/interviews']);
  }
}
