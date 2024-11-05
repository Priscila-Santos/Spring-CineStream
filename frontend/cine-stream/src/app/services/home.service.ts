import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private apiUrl = 'http://api.exemplo.com/search'; // URL da API para busca

  constructor(private http: HttpClient) { }

  searchMovies(query: string): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}?query=${query}`).pipe(
      map(response => {
        // Processar a resposta, se necessário
        return response;
      })
    );
  }
}
