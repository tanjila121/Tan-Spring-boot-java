import { Component, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  @ViewChild('f') signupform : NgForm;
  answer = '';
  defaultQuestion = 'pet';
  genders =['male','female'];
  user={
    username:'',
    email:'',
    secretQuestion:'',
    answer:'',
    gender:''
  };
  submitted = false;

  suggestUserName() {
    const suggestedName = 'Superuser';
    // this.signupform.setValue({
    //   userData:{
    //     username:suggestedName,
    //     email:''
    //   },
    //   secret:'teacher',
    //   questionAnswer:'',
    //   gender:'female'
    // });
    this.signupform.form.patchValue({
      userData:{
        username:suggestedName
      }
    });  
  }
  // onSubmit(form: NgForm){
  //   console.log(form);
  // }
  onSubmit(){
this.submitted = true;
this.user.username = this.signupform.value.userData.username;
this.user.email = this.signupform.value.userData.email;
this.user.secretQuestion = this.signupform.value.secret;
this.user.answer = this.signupform.value.questionAnswer;
this.user.gender = this.signupform.value.gender;



  }
}
