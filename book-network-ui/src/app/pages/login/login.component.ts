import {Component} from '@angular/core';
import {AuthenticationRequest} from "../../services/models/authentication-request";
import {NgForOf, NgIf} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {Router} from "@angular/router";
import {AuthenticationService} from "../../services/services/authentication.service";
import {catchError, of} from "rxjs";
import {TokenService} from "../../services/token/token.service";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    NgForOf,
    FormsModule,
    NgIf
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  authRequest: AuthenticationRequest = {email: '', password: ''};
  errorMsg: Array<string> = [];

  constructor(
    private router: Router,
    private authService: AuthenticationService,
    private tokenService: TokenService
  ) {
  }

  login() {
    this.errorMsg = []
    this.authService.authenticate({
        body: this.authRequest
      }
    ).pipe(
      catchError(err => {
        console.log(err);
        if (err.error.validationErrors) {
          this.errorMsg = err.error.validationErrors
        } else {
          this.errorMsg.push(err.error.error);
        }
        return of(null);
      })
    ).subscribe({
      next: (res)=> {
        this.tokenService.token = res?.token as string;
        this.router.navigate(['books']);
      }
    })
  }

    register()
    {
      this.router.navigate(['Register'])
    }
  }
