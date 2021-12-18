import { Component, OnInit } from '@angular/core';
import { throwError } from 'rxjs';
import { catchError, map } from 'rxjs/operators';
import { ApiService } from './api.service.service';
import { MovieModel } from './shared/MovieModel';

@Component({
  selector: 'pm-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'spring-angular';
  movieid:string = '';

  movies:MovieModel[] = [];

  constructor(private apiService:ApiService){

  }
  ngOnInit(): void {
    this.movies= [];
  }

  getAllMovies(){

    if(this.movieid.length==0){
      alert('Please enter MovieID')
    }
    else{
      this.apiService.getMovie(this.movieid).subscribe((res: any)=> {
          this.movies.push(res);

      });
      this.movieid='';
    }

  }
    

}
