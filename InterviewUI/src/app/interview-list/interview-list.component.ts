import { Component, OnInit, ViewChild } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';
import { Interview } from '../interview';
import { InterviewService } from '../interview.service';
//import { UpdateInterviewComponent } from '../update-interview/update-interview.component';
@Component({
  selector: 'app-interview-list',
  templateUrl: './interview-list.component.html',
  styleUrls: ['./interview-list.component.css']
})
export class InterviewListComponent implements OnInit {

interviews: Array<Interview>
displayedColumns: string[] = ['action','id', 'candidatename' , 'interviewername', 'date', 'day', 'time' , 'link' , 'result' , 'creationdate' , 'createdby' , 'modificationdate' , 'modifiedby' , 'status' ];
  //dataSource : Array<Interview>;
  dataSource: MatTableDataSource<Interview>;

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  constructor(private interviewService:InterviewService,
    private router:Router,private dialog:MatDialog) { }

  ngOnInit(): void {
    this.getInterviews();
   
  }
  applyFilter(event: Event) {
  const filterValue = (event.target as HTMLInputElement).value;
  this.dataSource.filter = filterValue.trim().toLowerCase();

  if (this.dataSource.paginator) {
    this.dataSource.paginator.firstPage();
  }
}
getInterviews(){
  this.interviewService.getInterviewList().subscribe(data =>{
    this.dataSource= new MatTableDataSource(data);
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
  });
}

deleteInterview(id: number){
  if (confirm("Are you sure to Delete Interview??")) {
  this.interviewService.deleteInterview(id).subscribe(data =>{
    alert("Interview deleted Successfully!")
    window.location.reload();
  });
}
}

}