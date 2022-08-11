import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Candidate } from './candidate';
import { Interview } from './interview';
import { Interviewer } from './interviewer';

@Injectable({
  providedIn: 'root'
})
export class InterviewService {
private baseURL="http://localhost:8080/api/interviews/";
private baseURLById="http://localhost:8080/api/interview";
private baseURLCandidate="http://localhost:8080/api/candidates/";
private baseURLInterviewer="http://localhost:8080/api/interviewers/";

private baseURL1="http://localhost:8080/api/addInterview/";
private baseURL2="http://localhost:8080/api/update";
private baseURL3="http://localhost:8080/api/delete";

  constructor(private httpClient:HttpClient) { }

  getInterviewList():Observable<Interview[]>{
    return this.httpClient.get<Interview[]>(this.baseURL);
  }

  getInterviewById(id : number) : Observable<Interview>{
    return this.httpClient.get<Interview>(`${this.baseURLById}/${id}`);
  }
  getCandidateList():Observable<Candidate[]>{
    return this.httpClient.get<Candidate[]>(this.baseURLCandidate);
  }
  getInterviewerList():Observable<Interviewer[]>{
    return this.httpClient.get<Interviewer[]>(this.baseURLInterviewer);
  }

  addInterview(interview:Interview):Observable<object>{
    
    return this.httpClient.post((this.baseURL1),interview);
  }

  updateInterview(interview:Interview):Observable<object>{
    return this.httpClient.put(this.baseURL2,interview);
  }
  deleteInterview(id: number): Observable<object>{
    return this.httpClient.delete(`${this.baseURL3}/${id}`);
   }

  // deleteInterview(interviewId:number): Observable<any> {
  //   return this.httpClient.delete( this.baseURL3 + "delete/"+interviewId);
  // }
}
