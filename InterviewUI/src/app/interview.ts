import { Candidate } from "./candidate";
import { Interviewer } from "./interviewer";

export class Interview{
    id:number;
    date:Date;
    day:String="";
    time:String="";
    link:String="";
    result:String="";
    creationdate:Date;
    createdby:boolean;
    modificationdate:Date;
    modifiedby:boolean;
    status:boolean;
    candidate: Candidate;
    interviewers: Interviewer;
}