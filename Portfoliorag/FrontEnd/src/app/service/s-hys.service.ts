import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Hys } from '../model/hys';

@Injectable({
  providedIn: 'root'
})
export class SHysService {
  hURL = 'http://localhost:8080/h/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Hys[]>{
    return this.httpClient.get<Hys[]>(this.hURL + 'lista');
  }

  public detail(id: number): Observable<Hys>{
    return this.httpClient.get<Hys>(this.hURL + `detail/${id}`);
  }

  public save(hys: Hys): Observable<any>{
    return this.httpClient.post<any>(this.hURL + 'create', hys);
  }

  public update(id: number, hys: Hys): Observable<any>{
    return this.httpClient.put<any>(this.hURL + `update/${id}`, hys);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.hURL + `delete/${id}`);
  }
}
