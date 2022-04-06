import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }
  onLoadServer(id: number){
    //complex calculations or to reach out to our back-end
    this.router.navigate(['/servers',id,'edit'],{queryParams:{allowEdit:'1'},fragment:'loading'});
  }
  onLoadUsers(){
    //complex calculations or to reach out to our back-end
    this.router.navigate(['/users']);
  }
}
