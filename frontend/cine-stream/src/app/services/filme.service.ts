import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Filme } from '../model/filme';

@Injectable({
  providedIn: 'root'
})
export class FilmeService {
  private apiUrl = 'http://localhost:8080/api/filmes';

  constructor(private http: HttpClient) { }

  getFilmesPorGenero(genero: string): Observable<Filme[]> {
    return this.http.get<Filme[]>(`${this.apiUrl}/genero?genero=${genero}`);
  }

  getFilmes(): Observable<Filme[]> { return this.http.get<Filme[]>(this.apiUrl); }
}

